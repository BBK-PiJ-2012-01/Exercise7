/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

import BBK.PiJ01.common.Exercise;
import BBK.PiJ01.common.IOGeneric;

/**
 *
 * @author Sam Wright <swrigh11@dcs.bbk.ac.uk>
 */
public class HashTableExercise implements Exercise {

    @Override
    public String getTitle() {
        return "HashTable";
    }

    @Override
    public String getDescription() {
        return "Demonstrates a simple hash table with\n"
                + "multiple values allowed for each key,"
                + "and another which only allows one value"
                + "for each key.";
    }

    @Override
    public void run() {
        HashTableImpl hashtable = new HashTableImpl();
        SimpleMapImpl simpletable = new SimpleMapImpl();

        String letters = "abcdefghijklmnopq";
        for (int i = 0; i < letters.length(); ++i) {
            String letter = letters.substring(i, i + 1);

            hashtable.put(i, letter);
            simpletable.put(i, letter);
        }

        for (int i = 0; i < letters.length(); ++i) {
            String letter = letters.substring(i, i + 1);

            hashtable.put(i + letters.length() - 5, letter);
            simpletable.put(i + letters.length() -5, letter);
        }

        for (int i = 0; i < 2 * letters.length(); ++i) {
            System.out.format("simpletable[%d] = %s\n", i, simpletable.get(i));
        }
        System.out.println();

        for (int i = 0; i < 2 * letters.length(); ++i) {
            System.out.format("hashtable[%d] = %s\n", i, IOGeneric.listToString(hashtable.get(i), "[,]"));
        }

    }
}
