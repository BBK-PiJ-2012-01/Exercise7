/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise7;

import BBK.PiJ01.common.BadInput;
import BBK.PiJ01.common.Exercise;
import BBK.PiJ01.common.IOGeneric;

/**
 *
 * @author Sam Wright <swrigh11@dcs.bbk.ac.uk>
 */
public class HashUtilities implements Exercise {
    public static int shortHash(int input) {
        return Math.abs(input % 1000);
    }

    @Override
    public String getTitle() {
        return "Short hash test.";
    }

    @Override
    public String getDescription() {
        return "Hashes the hash code of a user-inputted string using shortHash.";
    }

    @Override
    public void run() {
        // Copied verbatim from exercise.
        System.out.println("Give me a string and I will calculate its hash code"); 
        String str;
        try {
            str = IOGeneric.getString();
        } catch (BadInput err) {
            System.out.println("Couldn't understand input.");
            return;
        }
        int hash = str.hashCode();
        int smallHash = HashUtilities.shortHash(hash); 
        System.out.println("0 < " + smallHash + " < 1000");
    }
    
    

}
