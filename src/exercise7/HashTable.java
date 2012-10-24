/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
* Map from integer to Strings: one to many 
*/
public interface HashTable {

    /**
     * Puts a new String in the map.
     */
    void put(int key, String name);

    /**
     * Returns all the names associated with that key, * or null if there is
     * none.
     */
    String[] get(int key);

    /**
     * Removes a name from the map.
     */
    void remove(int key, String name);

    /**
     * Returns true if there are no workers in the map, * false otherwise
     */
    boolean isEmpty();
}