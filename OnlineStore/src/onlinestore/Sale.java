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
    private double refund;
    // i will represent index of items
    private int i;
    private int returnQuantity;
    private Item item;
    private Inventory inventory;
    
    Sale(int transNum, double refund){
        super(transNum);
        this.refund = refund;
        
        inventory.setQuantity(null);
        
    }
    
    //adding item back to inventory 
    @Override
    public void adjustInventory(){
        //should return type in getQuantity be an integer?
        //Ardjen: this method *shouldn't* have to return an integer. This will directly interact with Inventory's getters and setters
//       return inventory.getQuantity() - purchaseQuantity;
        //return 0;
    }
    
    /*
    adjustMoney should increase funds according to the bill
    */
    public void adjustMoney()
    {
        
    }
    
    }
