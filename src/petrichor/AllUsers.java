/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrichor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gareth
 */
public class AllUsers {

    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<String> names = new ArrayList<>();

    /**
     * allUsers is an object made to work with all the User accounts on the computer and contains a User object for each User. The constructor checks the file users.txt and creates objects from the data read in from it
     */
    public AllUsers() {
        try {
            StorageManager storage = new StorageManager("petri.accdb");
            ResultSet allResults = storage.query("Select * from tblUsers");
            while (allResults.next()) {
                users.add(new User(allResults.getInt("UserID"), allResults.getString("Username"), allResults.getString("Password"), allResults.getString("Email")));
                names.add(allResults.getString("Username"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("There was an error fetching the users");
        }

    }

    /**
     * Checks to see if there is a User with the specified username and password entered and returns the matching User object if there was a perfect match (case sensitive)
     *
     * @param usernameIn The username of the User trying to sign in as a string
     * @param passwordIn The password corresponding to the username of the User trying to sign in as a string
     * @return The User object if the username and password matched a User or null if there wasn't a match
     */
    public User getUser(String usernameIn, String passwordIn) {
        if (names.contains(usernameIn)) {
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).checkCredentials(usernameIn, passwordIn)) {
                    return users.get(i);
                }
            }
        }
        return null;
    }

    /**
     * Checks if a user has an ID corresponding with the entered ID and returns the object if there is a match or null otherwise
     *
     * @param userID The ID of the user attempting to be retrieved as an integer
     * @return The user object if a user exists with the specified ID and null otherwise
     */
    public User getUser(int userID) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getID() == userID) {
                return users.get(i);
            }
        }
        return null;
    }

    /**
     * Creates a User based on the inputs and adds it to the database
     *
     * @param usernameIn The username of the User being created as a string
     * @param passwordIn The password of the User trying to be created as a string
     * @param emailIn The email of the User trying to be created as a string
     * @return Boolean true if the User was created successfully and false if the username is taken or there was an error adding them to the database
     */
    public boolean addUser(String usernameIn, String passwordIn, String emailIn) {
        if (!names.contains(usernameIn) && !usernameIn.contains("'") && !emailIn.contains("'") && !passwordIn.contains("'")) {
            try {
                StorageManager storage = new StorageManager("petri.accdb");
                storage.update("Insert into tblUsers (Username,Password,Email) Values('" + usernameIn + "','" + passwordIn + "','" + emailIn + "')");
                updateList();
                return true;
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("There was an error adding the user");
                return false;
            }
        }
        return false;
    }

    /**
     * A private method used to update this object's internal arrayLists containing all the users and their names should a user be added or removed
     */
    private void updateList() {
        try {
            users.clear();
            names.clear();
            StorageManager storage = new StorageManager("petri.accdb");
            ResultSet allResults = storage.query("Select * from tblUsers");
            while (allResults.next()) {
                users.add(new User(allResults.getInt("UserID"), allResults.getString("Username"), allResults.getString("Password"), allResults.getString("Email")));
                names.add(allResults.getString("Username"));
            }
        } catch (ClassNotFoundException | SQLException ex) {

        }
    }

    /**
     * A method used to update a user's information in the database to new values given their ID
     *
     * @param userID The integer value of the user's ID whose information is to be changed (this can never be changed)
     * @param newUsername The new username the user would like associated with their account as a string
     * @param newPassword The new password the user has decided will replace their old password as a string
     * @param newEmail The new email address the user would like to replace their old email with as a string
     * @return Returns a new User object with the updated information, the old user object if it could not be updated and null if the username is already taken.
     */
    public User updateUser(int userID, String newUsername, String newPassword, String newEmail) {
        User oldUser = getUser(userID);
        if (!names.contains(newUsername) || newUsername.equals(oldUser.getUsername())) {
            try {
                StorageManager storage = new StorageManager("petri.accdb");
                storage.update("Update tblUsers Set Username = '" + newUsername + "', Password = '" + newPassword + "', Email = '" + newEmail + "' where Username = '" + oldUser.getUsername() + "' and Password = '" + oldUser.getPassword() + " 'and Email = '" + oldUser.getEmail() + "'");
                updateList();
                return getUser(userID);
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("There was an error updating the user's inforamtion");
                return getUser(userID);
            }
        } else {
            return null;
        }
    }
}
