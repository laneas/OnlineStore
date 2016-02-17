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
public class ReturnItem extends Transaction implements Runnable{
    private ArrayList<Item> items;
    private double refund;

    
    ReturnItem(int transNum, Inventory inv, ArrayList<Item> custItems){
        super(transNum, inv, custItems);
        this.refund = refund;
        
        
        inventory.setQuantity(null);
        
    }
    
    @Override
    public void run()
    {
        adjustInventory();
        //adjustMoney();
    }
    
    //adding item back to inventory 
    @Override
    public void adjustInventory()
    {
        for(int i = 0; i < items.size(); i++)
        {
            for(int j = 0; j < inventory.getItems().size(); j++)
            {
                if(items.get(i).equals(inventory.getItems().get(j)))
                {
                    int temp = inventory.getQuantity().get(j);
                    inventory.getQuantity().set(j, temp++);
                }
            }
        }
    }
    
    /*
        Should decrease money according to item price
    */
    @Override
    public void adjustMoney()
    {
        storeLedgerBalance = storeLedgerBalance - refund;
    }
}
