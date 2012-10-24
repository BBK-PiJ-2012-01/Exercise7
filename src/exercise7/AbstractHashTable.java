/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Sam Wright <swrigh11@dcs.bbk.ac.uk>
 */
public class AbstractHashTable {

    LinkedList<Bucket> hashtable = new LinkedList<Bucket>();
    ListIterator<Bucket> itr;

    protected Bucket getValidBucket(int hashcode) {
        Bucket test_bucket;

        for (itr = hashtable.listIterator(); itr.hasNext();) {
            test_bucket = itr.next();
            if (test_bucket.isValidFor(hashcode)) {
                return test_bucket;
            }
        }

        test_bucket = Bucket.createNewFor(hashcode);
        hashtable.add(test_bucket);
        return test_bucket;
    }

    public boolean isEmpty() {
        for (itr = hashtable.listIterator(); itr.hasNext();) {
            if (!itr.next().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
