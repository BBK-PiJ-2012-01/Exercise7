/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise7;


public class UnfairQueueSimple implements PersonQueue {
    private Person first;
    
    @Override
    public void insert(Person person) {
        if (first == null) {
            first = person;
            return;
        }
        
        Person test_person = first;
        Person previous_person = null;
        
        while (test_person != null) {
            if (person.getAge() > test_person.getAge()) {
                try {
                    previous_person.setNext(person);
                } catch (NullPointerException err) {}
                person.setNext(test_person);
                if (test_person == first)
                    first = person;
                return;
            }
            
            previous_person = test_person;
            test_person = test_person.getNext();
        }
        
        previous_person.setNext(person);
    }

    @Override
    public Person retrieve() {
        Person retrieved = first;
        try {
            first = first.getNext();
        } catch (NullPointerException err) {}
        return retrieved;
    }

    @Override
    public String getDescription() {
        return "Ordered queue with oldest at the front";
    }

}
