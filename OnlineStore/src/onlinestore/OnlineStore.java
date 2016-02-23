package onlinestore;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OnlineStore
{
    public static TransactionHandler handler;
    
    public static void main(String[] args)
    {
        Item bread = new Item(1, 2.00, "bread");
        Item milk = new Item(2, 3.00, "milk");
        Item eggs = new Item(3, 2.50, "eggs");
        
        ArrayList<Item> customerItems = new ArrayList<Item>();
        customerItems.add(bread);
        customerItems.add(bread);
        
        Inventory i = new Inventory();
        i.getItems().add(bread);
        i.getQuantity().add(100);
        i.getItems().add(milk);
        i.getQuantity().add(6);
        i.getItems().add(eggs);
        i.getQuantity().add(7);
        
        i.listInventory();
        System.out.println();
        
        for(int k = 0; k < 50; k++)
        {
            Transaction s = new Sale(1, i, customerItems);
            s.start();
        }
        
//        Transaction s1 = new Sale(1, i, customerItems);
//        s1.start();
        
            try
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException ex)
            {
                System.out.println(ex);
            }

        i.listInventory();
        //....add more stuff
        //handler = new TransactionHandler();
    }
    
}
