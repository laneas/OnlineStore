package onlinestore;

import java.util.ArrayList;

public class Inventory
{
    private ArrayList<Item> items;
    private ArrayList<Integer> quantity;
    private double balance;
    
    public Inventory()
    {
        items = new ArrayList<Item>();
        quantity = new ArrayList<Integer>();
        balance = 0.0;
    }
    
    //prints entire inventory
    public void listInventory()
    {
        for(int i = 0; i < items.size(); i++)
        {
            System.out.println(items.get(i).getName()+": "+quantity.get(i));
        }
    }
    
    //prints the item at index for the time being
    public void listInventoryAt(int index)
    {
        System.out.println(items.get(index).getName()+": "+quantity.get(index));
    }
    
    public Item itemLookup(String itemName)
    {
        int index = -1;
        //a better search method should be used later
        for(int i = 0; i < items.size(); i++)
        {
            if(items.get(i).getName().equals(itemName));
            {
                index = i;
                break;
            }
        }
        if(index == -1)
        {
            return new Item(-1, 0.0, "Item Not Found");
        }
        else
        {
            return items.get(index);
        }
    }
    
    public Item idLookup(int theID)
    {
        int index = -1;
        //a better search method should be used later
        for(int i = 0; i < items.size(); i++)
        {
            if(items.get(i).getId() == theID);
            {
                index = i;
                break;
            }
        }
        if(index == -1)
        {
            return new Item(-1, 0.0, "Item Not Found");
        }
        else
        {
            return items.get(index);
        }
    }
    
    /**
     * @return the items
     */
    public ArrayList<Item> getItems()
    {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(ArrayList<Item> items)
    {
        this.items = items;
    }

    /**
     * @return the quantity
     */
    public ArrayList<Integer> getQuantity()
    {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(ArrayList<Integer> quantity)
    {
        this.quantity = quantity;
    }
    
    public void addItem(Item theItem)
    {
        boolean itemFound = false;
        
        for(int i = 0; i < items.size(); i++)
        {
            if(items.get(i).equals(theItem))
            {
                itemFound = true;
                int temp = quantity.get(i);
                temp++;
                quantity.set(i, temp);
            }
        }
        if(!itemFound)
        {
            items.add(theItem);
            quantity.add(1);
        }
    }
    
    public void addItem(Item theItem, int theQuantity)
    {
        boolean itemFound = false;
        
        for(int i = 0; i < items.size(); i++)
        {
            if(items.get(i).equals(theItem))
            {
                itemFound = true;
                int temp = quantity.get(i);
                temp = temp + theQuantity;
                quantity.set(i, temp);
            }
        }
        if(!itemFound)
        {
            items.add(theItem);
            quantity.add(theQuantity);
        }
    }
    
    public void removeItem(Item theItem)
    {
        for(int i = 0; i < items.size(); i++)
        {
            if(items.get(i).equals(theItem) && quantity.get(i) > 0)
            {
                int temp = quantity.get(i);
                temp--;
                quantity.set(i, temp);
            }
            
            if(items.get(i).equals(theItem) && quantity.get(i) <= 0)
            {
                //notify user than transaction cannot be made
            }
        }
    }
    
    public void removeItem(Item theItem, int theQuantity)
    {
        for(int i = 0; i < items.size(); i++)
        {
            if(items.get(i).equals(theItem) && quantity.get(i) > 0)
            {
                for(int j = 0; j < theQuantity; j++)
                {
                    int current = quantity.get(i);
                    int expected = current - 1;
                    
                    if(expected > 0)
                    {
                        quantity.set(i, expected);
                    }
                    else
                    {
                        //notifiy user that transaction was not possible
                        quantity.set(i, current);
                    }
                }
            }
        }
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }
}
