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
public class SimpleMapImplTest {
    
    public SimpleMapImplTest() {
    }

    /**
     * Test of put, get, isEmpty and remove methods, of class SimpleMapImpl.
     */
    @Test
    public void testPut() {
        System.out.println("put and get");
        SimpleMapImpl instance = new SimpleMapImpl();
        
        instance.put(-10, "minus10");
        instance.put(5, "5_1");
        instance.put(5, "5_2");
        instance.put(165, "165");
        
        assertNull(instance.get(40));
        assertNull(instance.get(-40));
        assertNull(instance.get(160));
        
        assertEquals(instance.get(5), "5_1");
        assertEquals(instance.get(165), "165");
        assertEquals(instance.get(-10), "minus10");
        
        assertFalse(instance.isEmpty());
        
        instance.remove(5);
        assertNull(instance.get(5));
        
        instance.remove(-10);
        
        assertFalse(instance.isEmpty());
        instance.remove(165);
        assertTrue(instance.isEmpty());
        
    }

}
