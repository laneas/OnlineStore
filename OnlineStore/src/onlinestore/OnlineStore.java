package onlinestore;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OnlineStore
{
    public static TransactionHandler handler;
    
    public static void main(String[] args)
    {
        Item bread   = new Item(1, 2.00, "bread");
        Item milk    = new Item(2, 3.00, "milk");
        Item eggs    = new Item(3, 2.00, "eggs");
        Item butter  = new Item(4, 3.00, "butter");
        Item chicken = new Item(5, 5.00, "chicken");
        Item gum     = new Item(6, 1.00, "gum");
        
        ArrayList<Item> customerItems = new ArrayList<Item>();
        customerItems.add(bread);
        
        Inventory i = new Inventory();
          i.addItem(bread, 20);
          i.addItem(milk, 20);
          i.addItem(eggs, 20);
          i.addItem(butter, 20);
          i.addItem(chicken, 20);
          i.addItem(gum, 20);
        i.listInventory();
        System.out.println();
        
        Transaction s = new Sale(1, i, customerItems);
        s.start();
        
        
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
    }
    
}
