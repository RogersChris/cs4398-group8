/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package group8;

/**
 *
 * @author cosmicray
 */
public class Item {
    
    float itemSellPrice;
    float itemBuyPrice;
    float itemWeight;
    int itemID;
    int itemCount;
    String itemName;
    
    // constructor
    public Item(float sellPrice, float buyPrice, int ID, String name, float weight,int count) {
        itemSellPrice = sellPrice;
        itemBuyPrice = buyPrice;
        itemWeight = weight;
        itemID = ID;
        itemCount = count;
        itemName = name;
    }
   
    public Item() {
        itemSellPrice = 1.25f;
        itemBuyPrice = 1.10f;
        itemWeight = 3.35f;
        itemID = 1;
        itemCount = 1;
        itemName = "Random Item";
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public void addCount() {
        itemCount++;
        System.out.println(itemCount);
    }
    
    
}
