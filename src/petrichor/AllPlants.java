/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrichor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Gareth
 */
public class AllPlants {

    private List<Plant> everyPlant = new ArrayList<>();
    private List<Plant> userPlants = new ArrayList<>();
    private int userID;

    /**
     * An object that stores all the information of all the plants within the main database as well as all the information of the plants contained in a user's personal list of plants
     *
     * @param userIDIn The ID of the user using the application, used to determine which plants that user has added to their personal list as an integer
     */
    public AllPlants(int userIDIn) {
        userID = userIDIn;
        try {
            StorageManager storage = new StorageManager("petri.accdb");
            ResultSet allResults = storage.query("Select * from tblPlants");
            while (allResults.next()) {
                everyPlant.add(new Plant(allResults.getInt("PlantID"), allResults.getString("PlantName"), allResults.getString("LatinName"), allResults.getString("Description"),
                        allResults.getDouble("Temperature"), allResults.getDouble("Humidity"), allResults.getDouble("Light"), allResults.getDouble("SoilMoisture")));
            }
            ResultSet userResults = storage.query(
                    "SELECT tblPlants.* FROM tblPlants INNER JOIN "
                    + "tblUsersPlants ON tblPlants.PlantID = tblUsersPlants.PlantID WHERE tblUsersPlants.UserID = " + userID);
            while (userResults.next()) {
                userPlants.add(new Plant(userResults.getInt("PlantID"), userResults.getString("PlantName"), userResults.getString("LatinName"),
                        userResults.getString("Description"), userResults.getDouble("Temperature"),
                        userResults.getDouble("Humidity"), userResults.getDouble("Light"), userResults.getDouble("SoilMoisture")));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Returns a formatted string of all the plants' information separated by a new line with each value separated by the ";" character
     *
     * @return All the plants' information separated using a new line with each value separated using the ";" character according to the Plant.toString()
     */
    public String getAllPlantInformation() {
        if (everyPlant.size() > 0) {
            String out = everyPlant.get(0).toString();
            for (int i = 1; i < everyPlant.size(); i++) {
                out += "\n" + everyPlant.get(i).toString();
            }
            return out;
        }
        return "";
    }

    /**
     * Returns a formatted string of all the user's plants' information separated by a new line with each value separated by the ";" character
     *
     * @return All the user's plants' information separated using a new line with each value separated using the ";" character according to the Plant.toString() method
     */
    public String getUserPlantInformation() {
        if (userPlants.size() > 0) {
            String out = userPlants.get(0).toString();
            for (int i = 1; i < userPlants.size(); i++) {
                out += "\n" + userPlants.get(i).toString();
            }
            return out;
        }
        return "";
    }

    /**
     * Given the name of a plant or a section thereof returns all the plants that contain that string
     *
     * @param search The name or portion of a name to search for.
     * @return The information of all plants whose name contains the inputted value separated using a new line with each value separated using the ";" character according to the Plant.toString() method
     */
    public static String getSearchInformation(String search) {
        try {
            if (search.contains("'")) {
                return "";
            }
            List<Plant> searchPlants = new ArrayList<>();
            StorageManager storage = new StorageManager("petri.accdb");
            ResultSet searchResults = storage.query("SELECT * FROM tblPlants WHERE PlantName like ('%" + search + "%')");
            while (searchResults.next()) {
                searchPlants.add(new Plant(searchResults.getInt("PlantID"), searchResults.getString("PlantName"), searchResults.getString("LatinName"),
                        searchResults.getString("Description"), searchResults.getDouble("Temperature"), searchResults.getDouble("Humidity"),
                        searchResults.getDouble("Light"), searchResults.getDouble("SoilMoisture")));
            }
            String out;
            if (searchPlants.size() > 0) {
                out = searchPlants.get(0).toString();
            } else {
                out = "";
            }
            for (int i = 1; i < searchPlants.size(); i++) {
                out += "\n" + searchPlants.get(i).toString();
            }
            return out;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error in searching for plant");
            return "";
        }
    }

    /**
     * Given the name of a plant or a section thereof returns all the plants within a user's personal list that contain that string
     *
     * @param search The name or portion of a name to search through the user's list for
     * @return The information of all plants whose name contains the inputted value within the user's personal list separated using a new line with each value separated using the ";" character according to the Plant.toString() method
     *
     */
    public String getUserSearchInformation(String search) {
        String out = "";
        for (int i = 0; i < userPlants.size(); i++) {
            if (userPlants.get(i).getName().toLowerCase().contains(search.toLowerCase())) {
                if (out.equals("")) {
                    out = userPlants.get(i).toString();
                } else {
                    out += "\n" + userPlants.get(i).toString();
                }
            }
        }
        return out;
    }

    /**
     * Adds a plant to the user's personal list of plants internally and in the database, provided it is not already added and is a valid plant ID
     *
     * @param plantID The ID of the plant to be added to the user's personal list of plants
     * @return A boolean value indicating whether or not the plant was actually added to the user's personal list within the database and internally
     */
    public boolean addUserPlant(int plantID) {
        try {
            if (!userHasPlant(plantID)) {
                StorageManager storage = new StorageManager("petri.accdb");
                storage.update("INSERT INTO tblUsersPlants (UserID, PlantID) Values(" + userID + "," + plantID + ")");
                updateUserPlants();
                return true;
            } else {
                return false;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error adding a plant to the user");
            return false;
        }
    }

    /**
     * A private method used to update this objects internal arrayList containing all the user's plants should a plant be added or removed
     */
    private void updateUserPlants() {
        userPlants.clear();
        try {
            StorageManager storage = new StorageManager("petri.accdb");
            ResultSet userResults = storage.query("SELECT tblPlants.* FROM tblPlants INNER JOIN tblUsersPlants "
                    + "ON tblPlants.PlantID = tblUsersPlants.PlantID WHERE tblUsersPlants.UserID = " + userID);
            while (userResults.next()) {
                userPlants.add(new Plant(userResults.getInt("PlantID"), userResults.getString("PlantName"),
                        userResults.getString("LatinName"), userResults.getString("Description"), userResults.getDouble("Temperature"),
                        userResults.getDouble("Humidity"), userResults.getDouble("Light"), userResults.getDouble("SoilMoisture")));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error fetching user's plants");
        }
    }

    /**
     * Returns the information of one plant given its ID with each value separated using the ";" character according to the Plant.toString() method
     *
     * @param plantIDIn The ID of the plant whose information will be returned
     * @return Returns a string containing the information of one plant of given ID with each value separated using the ";" character according to the Plant.toString() method
     */
    public String getPlantInformation(int plantIDIn) {
        for (int i = 0; i < everyPlant.size(); i++) {
            if (everyPlant.get(i).getID() == plantIDIn) {
                return everyPlant.get(i).toString();
            }
        }
        return "";
    }

    /**
     * A private method used to check whether or not the user has a specific plant in their personal list.
     *
     * @param ID The integer value of the ID of the plant that is checked to be contained within the user's personal list
     * @return A boolean value stating whether or not the user does contain the plant within their personal list
     */
    private boolean userHasPlant(int ID) {
        for (int i = 0; i < userPlants.size(); i++) {
            if (userPlants.get(i).getID() == ID) {
                return true;
            }
        }
        return false;
    }

    /**
     * Given the ID of the plant in the user's personal list it removes it from the internal list as well as the database
     *
     * @param plantID The ID of the plant to be removed from the user's personal list of plants
     * @return A boolean value indicating whether or not the removal was successful
     */
    public boolean removeUserPlant(int plantID) {
        try {
            StorageManager storage = new StorageManager("petri.accdb");
            storage.update("Delete From tblUsersPlants Where UserID =" + userID + " and PlantID =" + plantID);
            updateUserPlants();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error removing a user's plant");
            return false;
        }
    }
}
