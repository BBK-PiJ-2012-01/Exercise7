/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

import java.util.LinkedList;
import java.util.ListIterator;

public class SimpleMapImpl extends AbstractHashTable implements SimpleMap {

    @Override
    public void put(int key, String name) {
        Bucket b = getValidBucket(key);
        if (!b.containsKey(key)) {
            b.put(key, name);
        }
    }

    @Override
    public String get(int key) {
        String[] values = getValidBucket(key).get(key);
        if (values.length == 0) 
            return null;
        
        return values[0];
    }

    @Override
    public void remove(int key) {
        getValidBucket(key).removeKey(key);
    }
}
