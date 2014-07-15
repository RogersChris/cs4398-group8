/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package group8;

import java.util.*;

/**
 *
 * @author Chris Rogers
 */
public class toShipList {
    
    ArrayList list;
    
    void toShipList(){
        
        list = new ArrayList();
    }
    
    
    public ArrayList getList() {
        return list;
    }
    
    public int getSize() {
        return list.size();
    }
    
    public void addNewItem (Item item) {
        list.add(item);
    } 
    
    public Item getItemAtIndex (int index){
        Item item = (Item)list.get(index);
        return item;
    }
    
    
}
