/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise7;


public class Supermarket implements PersonQueue {
    Person first;
    Person last;
    
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
        first = first.getNext();
        if (first == null)
            last = null;
        return retrieved;
    }

}
