/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise7;

/**
 *
 * @author Sam Wright <swrigh11@dcs.bbk.ac.uk>
 */
public class SimpleBucket implements SimpleMap {
    Bucket internal_bucket;
    
    public SimpleBucket(int lower_boundary, int upper_boundary) {
        internal_bucket = new Bucket(lower_boundary, upper_boundary);
    }
    
    @Override
    public void put(int key, String name) {
        if (!internal_bucket.containsKey(key))
            internal_bucket.put(key, name);
    }

    @Override
    public String get(int key) {
        String[] values = internal_bucket.get(key);
        if (values.length == 0)
            return null;
        return values[0];
    }

    @Override
    public void remove(int key) {
        internal_bucket.removeKey(key);
    }

    @Override
    public boolean isEmpty() {
        return internal_bucket.isEmpty();
    }
    
}
