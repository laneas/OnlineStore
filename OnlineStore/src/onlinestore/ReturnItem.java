/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore;

import java.util.ArrayList;

/**
 *
 * @author jakesemple
 */
public class ReturnItem extends Transaction{
    private ArrayList<Item> items;
    private double refund;
    // i will represent index of items
    private int i;
    private int returnQuantity;
    private Item item;
    private Inventory inventory;
    
    ReturnItem(int transNum, double refund){
        super(transNum);
        this.refund = refund;
        
        
        inventory.setQuantity(null);
        
    }
    
    //adding item back to inventory 
    public int adjustInventory(){
        //should return type in getQuantity be an integer?
//       return inventory.getQuantity() + returnQuantity;
        return 0;
       
    }
}
