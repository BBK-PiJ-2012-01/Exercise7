/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author Sam Wright <swrigh11@dcs.bbk.ac.uk>
 */
public interface PersonQueue {
    /**
    * Adds another person to the queue.
    */
    void insert(Person person);
    
    /**
    * Removes a person from the queue. */
    Person retrieve();
}



