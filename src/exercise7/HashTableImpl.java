/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise7;

import java.util.LinkedList;
import java.util.ListIterator;


public class HashTableImpl implements HashTable {
    LinkedList<Bucket> hashtable = new LinkedList<Bucket>();
    ListIterator<Bucket> itr;

    private Bucket getValidBucket(int hashcode) {
        Bucket test_bucket;
        
        for (itr = hashtable.listIterator(); itr.hasNext();) {
            test_bucket = itr.next();
            if (test_bucket.isValidFor(hashcode))
                return test_bucket;
        }
        
        test_bucket = Bucket.createNewFor(hashcode);
        hashtable.add(test_bucket);
        return test_bucket;
    }
    
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

    @Override
    public boolean isEmpty() {
        for (itr = hashtable.listIterator(); itr.hasNext();) {
            if (!itr.next().isEmpty())
                return false;
        }
        return true;
    }

}
