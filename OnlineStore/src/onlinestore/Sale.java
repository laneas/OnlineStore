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
public class Sale extends Transaction implements Runnable
{

    private ArrayList<Item> items;

    public Sale(int transNum, Inventory inv, ArrayList<Item> custItems) 
    {
        super(transNum, inv, custItems);
        items = custItems;
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
                if(items.get(i).equals(inventory.getItems().get(j)) && inventory.getQuantity().get(j) != 0)
                {
                    inventory.removeItem(items.get(i));
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
