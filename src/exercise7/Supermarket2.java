/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise7;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Sam Wright <swrigh11@dcs.bbk.ac.uk>
 */
public class Supermarket2 implements PersonQueue {
    private LinkedList<Person> q = new LinkedList<Person>();
    
    @Override
    public void insert(Person person) {
        q.add(person);
    }

    @Override
    public Person retrieve() {
        if (q.isEmpty())
            return null;
        return q.pop();
    }
    
    @Override
    public String getDescription() {
        return "Inbuilt java.util.LinkedList";
    }
    
}
