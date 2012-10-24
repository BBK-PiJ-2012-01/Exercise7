/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise7;

import java.util.ArrayList;
import java.util.LinkedList;


public class SimpleMapImpl implements SimpleMap {
    ArrayList<String> map = new ArrayList<String>();
    
    public SimpleMapImpl() {
        map.ensureCapacity(1000);
        for (int i=0; i<1000; ++i) {
            map.add(null);
        }
    }

    @Override
    public void put(int key, String name) {
        map.set(key, name);
    }

    @Override
    public String get(int key) {
        return map.get(key);
    }

    @Override
    public void remove(int key) {
        map.set(key, null);
    }

    @Override
    public boolean isEmpty() {
        for (int i=0; i<1000; ++i) {
            if (map.get(i) != null)
                return false;
        }
        return true;
    }

}
