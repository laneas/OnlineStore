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
public class Sale extends Transaction{
    private ArrayList<Item> items;
    private double tender;
    // i will represent index of items
    private int i;
    private int returnQuantity;
    
    
    
    Sale(int transNum, double tender){
        super(transNum);
        this.tender = tender;
        
        inventory.setQuantity(null);
        
    }
    
    //adding item back to inventory 
    public int adjustInventory(){
//      should return type in getQuantity be an integer?
//      return inventory.getQuantity() - purchaseQuantity;
        return 0;
    }
    
    }
