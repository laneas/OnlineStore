/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    ArrayList<Transaction> transactions;
    int numOfSales = 0;
    int numOfReturns = 0;
    
    public TestStore()
    {
        masterList = new ArrayList<Item>();
        testInventory = new Inventory();
        customers = new ArrayList<Customer>();
        customerItems = new ArrayList<Item>();
        transactions = new ArrayList<Transaction>();
        
        setup();
        testInventory.listInventory();
        
        for(int i = 0; i < 100; i++)
        {
            generateSale();
            //generateReturn();
        }
        
        for(int i = 0; i < transactions.size(); i++)
        {
            try
        {
            Thread.sleep(20);
        } catch (InterruptedException ex)
        {
            Logger.getLogger(TestStore.class.getName()).log(Level.SEVERE, null, ex);
        }
            transactions.get(i).start();
        }
        
        testInventory.listInventory();
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
        testInventory.setBalance(50000.00);
        
        for(int i = 0; i < masterList.size(); i++)
        {
            testInventory.addItem(masterList.get(i), 500);
        }
    }
    
    public void customerSetup()
    {
        
    }
    
    public void generateSale()
    {
        numOfSales++;
        customerItems = new ArrayList<Item>();
        Double cartValue = 0.0;
        int numOfItems = 1 + (int)(Math.random() * ((10 - 1) + 1));
        
        for(int i = 0; i < numOfItems; i++)
        {
            int itemIndex = 0 + (int)(Math.random() * (masterList.size() - 0) + 1);
            customerItems.add(masterList.get(itemIndex - 1));
            
        }
        
        Sale s = new Sale(numOfSales, testInventory, customerItems);
        transactions.add(s);
        System.out.print("Sale #"+numOfSales+": ");
        for(int i = 0; i < customerItems.size(); i++)
        {
            System.out.print(customerItems.get(i).getName()+": "+customerItems.get(i).getPrice()+", ");
            cartValue = cartValue + customerItems.get(i).getPrice();
            
        }
        testInventory.setBalance(testInventory.getBalance()+cartValue);
        System.out.print(" cart price: "+cartValue+" added to store:"+testInventory.getBalance());
        System.out.println();
    }
    
    public void generateReturn()
    {
        numOfReturns++;
        customerItems = new ArrayList<Item>();
        Double cartValue = 0.0;
        int numOfItems = 1 + (int)(Math.random() * ((1 - 1) + 1));
        
        for(int i = 0; i < numOfItems; i++)
        {
            int itemIndex = 0 + (int)(Math.random() * (masterList.size() - 0) + 1);
            customerItems.add(masterList.get(itemIndex - 1));
        }
        
        ReturnItem r = new ReturnItem(numOfReturns, testInventory, customerItems);
        transactions.add(r);
        System.out.print("Return #"+numOfReturns+": ");
        for(int i = 0; i < customerItems.size(); i++)
        {
            System.out.print(customerItems.get(i).getName()+", "+customerItems.get(i).getPrice()+", ");
            cartValue = cartValue - customerItems.get(i).getPrice();
        }
        testInventory.setBalance(testInventory.getBalance()+cartValue);
        System.out.print(" cart price: "+cartValue+" subtracted from store:"+testInventory.getBalance());
        System.out.println();
    }
}
