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
public class Sale extends Transaction {

    private ArrayList<Item> items;

    Sale(int transNum, Inventory inv, double tender) 
    {
        super(transNum, inv);
    }

    //adding item back to inventory 
    @Override
    public void adjustInventory() 
    {
       for(int i = 0; i < items.size(); i++)
        {
            for(int j = 0; j < inventory.getItems().size(); j++)
            {
                if(items.get(i).equals(inventory.getItems().get(j)) && inventory.getQuantity().get(j) != 0)
                {
                    int temp = inventory.getQuantity().get(j);
                    inventory.getQuantity().set(j, temp--);
                }
                
                if(items.get(i).equals(inventory.getItems().get(j)) && inventory.getQuantity().get(j) == 0)
                {
                    System.out.println("This item is out of stock");
                    //perhaps consider removing the item from the customer's item ArrayList before charging
                }
            }
        }
    }


    /*
     adjustMoney should increase funds according to the bill
     */
    public void adjustMoney() 
    {
        double bill = 0.0;
        
        for(int i = 0; i < items.size(); i++)
        {
            bill = bill + items.get(i).getPrice();
        }
        
        storeLedgerBalance = storeLedgerBalance + bill;
    }

}
