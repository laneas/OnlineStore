package onlinestore;

import java.util.ArrayList;

public class Inventory
{
    private ArrayList<Item> items;
    private ArrayList<Integer> quantity;
    
    public Inventory()
    {
        items = new ArrayList<Item>();
        quantity = new ArrayList<Integer>();
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
}
