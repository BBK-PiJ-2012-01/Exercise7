/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise7;


public class Supermarket implements PersonQueue {
    private Person first;
    private Person last;
    
    @Override
    public void insert(Person person) {
        if (last == null) {
            first = person;
            last = person;
        } else {
            last.setNext(person);
            last = person;
        }
    }

    @Override
    public Person retrieve() {
        Person retrieved = first;
        
        try {
            first = first.getNext();
        } catch (NullPointerException err) {
            last = null;
        }
        
        return retrieved;
    }

    @Override
    public String getDescription() {
        return "Simple one-way linked list queue";
    }

}
