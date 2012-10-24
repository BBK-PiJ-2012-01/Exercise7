/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise7;


public class UnfairQueueClustered implements PersonQueue {
    Supermarket over65 = new Supermarket();
    Supermarket over18 = new Supermarket();
    Supermarket other_ages = new Supermarket();
    
    @Override
    public void insert(Person person) {
        if (person.getAge() >= 65)
            over65.insert(person);
        else if (person.getAge() >= 18)
            over18.insert(person);
        else
            other_ages.insert(person);
    }

    @Override
    public Person retrieve() {
        Person retrieved = over65.retrieve();
        if (retrieved == null)
            retrieved = over18.retrieve();
        if (retrieved == null)
            retrieved = other_ages.retrieve();
        
        return retrieved;
    }

    @Override
    public String getDescription() {
        return "FIFO where over 65s come before over 18s who come before the rest.";
    }

}
