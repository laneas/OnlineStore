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
    private Item item;
    
    ReturnItem(int transNum, double refund){
        super(transNum);
        this.refund = refund;
        
        
    }
    
    //adding item back to inventory 
    public Item addItem(){
        
        item = new Item(item.getId(), item.getPrice(), item.getName());
        
        return item;
    }
}
