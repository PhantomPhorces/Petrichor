/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template section, choose Tools | Templates
 * and open the template in the editor.
 */
package petrichor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Gareth
 */
public class GettingHelp {

    /**
     * Takes the name of the section parsed through and returns help from a file in the help directory based on the name parsed in.
     *
     * @param section The name of the page that you are getting help with as a string
     * @return The String containing the help from the corresponding help file
     */
    public static String getHelp(String section) {
        try {
            String out = "";
            section = "help\\" + section + "Help.txt";
            BufferedReader scanner = new BufferedReader(new FileReader(section));
            while (scanner.ready()) {
                out += scanner.readLine() + "\n";
            }
            return out;
        } catch (IOException ex) {
            return null;
        }
    }
}
