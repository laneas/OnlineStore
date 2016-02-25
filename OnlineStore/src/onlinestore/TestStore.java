/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore;

import java.util.ArrayList;

/**
 *
 * @author Ardjen
 */
public class TestStore
{
    ArrayList<Item> masterList;
    Inventory testInventory;
    ArrayList<Customer> customers;
    ArrayList<Item> customerItems;
    
    public TestStore()
    {
        masterList = new ArrayList<Item>();
        testInventory = new Inventory();
        customers = new ArrayList<Customer>();
        customerItems = new ArrayList<Item>();
    }
    
    public void setup()
    {
        itemSetup();
        inventorySetup();
        customerSetup();
    }
    
    public void itemSetup()
    {
        Item bread   = new Item(1, 2.00, "bread");
        Item milk    = new Item(2, 3.00, "milk");
        Item eggs    = new Item(3, 2.00, "eggs");
        Item butter  = new Item(4, 3.00, "butter");
        Item chicken = new Item(5, 5.00, "chicken");
        Item gum     = new Item(6, 1.00, "gum");
        
        masterList.add(bread);
        masterList.add(milk);
        masterList.add(eggs);
        masterList.add(butter);
        masterList.add(chicken);
        masterList.add(gum);
    }
    
    public void inventorySetup()
    {
        for(int i = 0; i < masterList.size(); i++)
        {
            testInventory.addItem(masterList.get(i), 200);
        }
    }
    
    public void customerSetup()
    {
        
    }
    
    public void generateSale()
    {
        int numOfSales = 1 + (int)(Math.random() * ((20 - 1) + 1));
        
        for(int i = 0; i < numOfSales; i++)
        {
            int itemIndex = 0 + (int)(Math.random() * (masterList.size() - 0) + 1);
            
        }
    }
}
