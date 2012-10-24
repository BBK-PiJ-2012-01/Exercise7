/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

public class HashTableImpl extends AbstractHashTable implements HashTable {

    @Override
    public void put(int key, String name) {
        getValidBucket(key).put(key, name);
    }

    @Override
    public String[] get(int key) {
        return getValidBucket(key).get(key);
    }

    @Override
    public void remove(int key, String name) {
        getValidBucket(key).remove(key, name);
    }
}
