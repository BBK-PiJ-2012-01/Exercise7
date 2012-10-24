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
public class Bucket implements HashTable {

    private static int bucket_size = 50;
    LinkedList<KeyValuePair> lst = new LinkedList<KeyValuePair>();
    ListIterator<KeyValuePair> itr;
    int upper_boundary, lower_boundary;

    public Bucket(int lower_boundary, int upper_boundary) {
        this.upper_boundary = upper_boundary;
        this.lower_boundary = lower_boundary;
    }

    public static Bucket createNewFor(int hashcode) {
        int lower_boundary = ((int) hashcode / bucket_size) * bucket_size;
        return new Bucket(lower_boundary, lower_boundary + bucket_size);
    }

    public boolean isValidFor(int hashcode) {
        return hashcode >= lower_boundary && hashcode < upper_boundary;
    }

    private LinkedList<KeyValuePair> getKeyValuePairs(int hashcode) {
        KeyValuePair test_pair;
        LinkedList<KeyValuePair> matching = new LinkedList<KeyValuePair>();
        for (itr = lst.listIterator(); itr.hasNext();) {
            test_pair = itr.next();
            if (test_pair.key == hashcode) {
                matching.add(test_pair);
            }
        }
        return matching;
    }

    private KeyValuePair getKeyValuePair(int hashcode, String value) {
        KeyValuePair test_pair;

        for (itr = lst.listIterator(); itr.hasNext();) {
            test_pair = itr.next();
            if (test_pair.key == hashcode && test_pair.value.equals(value)) {
                return test_pair;
            }
        }
        return null;
    }

    @Override
    public void remove(int hashcode, String value) {
        if (getKeyValuePair(hashcode, value) != null) {
            itr.remove();
        }
    }

    @Override
    public String[] get(int hashcode) {
        LinkedList<String> values = new LinkedList<String>();
        for (itr = getKeyValuePairs(hashcode).listIterator(); itr.hasNext();) {
            values.add(itr.next().value);
        }
        
        return (String[]) values.toArray();
    }

    @Override
    public void put(int hashcode, String value) {
        lst.add(new KeyValuePair(hashcode, value));
    }

    @Override
    public boolean isEmpty() {
        return lst.isEmpty();
    }
}
