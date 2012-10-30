/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sam Wright <swrigh11@dcs.bbk.ac.uk>
 */
public class SimpleBucketTest {
    
    public SimpleBucketTest() {
    }

    /**
     * Test of put and get methods, of class SimpleBucket.
     */
    @Test
    public void testPutGet() {
        System.out.println("put and get");
        SimpleBucket instance = new SimpleBucket(5, 10);
        instance.put(5, "five");
        instance.put(5, "five_overwritten");
        instance.put(6, "six");
        
        assertEquals(instance.get(5), "five");
        assertEquals(instance.get(6), "six");
        assertNull(instance.get(8));
    }

    /**
     * Test of remove and empty methods, of class SimpleBucket.
     */
    @Test
    public void testRemoveEmpty() {
        SimpleBucket instance = new SimpleBucket(5, 10);
        
        instance.put(5, "five");
        assertFalse(instance.isEmpty());
        
        instance.remove(5);
        assertTrue(instance.isEmpty());
        assertNull(instance.get(5));
    }

}
