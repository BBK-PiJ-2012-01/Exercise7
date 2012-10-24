/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise7;

/**
 *
 * @author Sam Wright <swrigh11@dcs.bbk.ac.uk>
 */
public class Person {
    private int age;
    Person next;
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setNext(Person next) {
        this.next = next;
    }
    
    public Person getNext() {
        return next;
    }
}