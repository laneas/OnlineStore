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
        
        ArrayList<Item> customerItems2 = new ArrayList<Item>();
        customerItems2.add(gum);
        
        Inventory i = new Inventory();
          i.setBalance(1000000.00);
          i.addItem(bread, 200);
          i.addItem(milk, 200);
          i.addItem(eggs, 200);
          i.addItem(butter, 200);
          i.addItem(chicken, 200);
          i.addItem(gum, 200);
        i.listInventory();
        System.out.println();
        
        for(int k = 0; k < 100; k++)
        {
            Transaction s = new Sale(1, i, customerItems);
            Transaction r = new ReturnItem(1, i, customerItems2);
            s.start();
            r.start();
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
    }
    
}
