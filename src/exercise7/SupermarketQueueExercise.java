/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise7;

import BBK.PiJ01.common.Exercise;
import BBK.PiJ01.common.IOGeneric;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Sam Wright <swrigh11@dcs.bbk.ac.uk>
 */
public class SupermarketQueueExercise implements Exercise {
    List<PersonQueue> q_lst = new ArrayList<PersonQueue>();

    public SupermarketQueueExercise() {
        init();
    }
    
    @Override
    public String getTitle() {
        return "Test implementations of PersonQueue";
    }

    @Override
    public String getDescription() {
        StringBuffer sbuf = new StringBuffer("Implementations to be tested:\n");
        for (ListIterator<PersonQueue> itr = q_lst.listIterator(); itr.hasNext();) {
            sbuf.append("\t* ");
            sbuf.append(itr.next().getDescription());
            sbuf.append("\n");
        }
        return sbuf.toString();
    }

    @Override
    public void run() {
        PersonQueue q;
        
        for (ListIterator<PersonQueue> itr = q_lst.listIterator(); itr.hasNext();) {
            q = itr.next();
            IOGeneric.printTitle(q.getDescription(), "-");
            
            for (int i=0; i<15; i++) {
                q.insert(new Person(15+i*4));
            }
            
            for (int i=0; i<15; i++) {
                System.out.println("Retrieved: " + q.retrieve());
            }
        }
    }
    
    private void init() {
        q_lst.clear();
        q_lst.add(new Supermarket());
        q_lst.add(new Supermarket2());
        q_lst.add(new UnfairQueueSimple());
        q_lst.add(new UnfairQueueClustered());
    }

}
