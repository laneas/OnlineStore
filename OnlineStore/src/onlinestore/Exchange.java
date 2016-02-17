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
public class Exchange extends Transaction implements Runnable
{
    private Item returnItem;
    private Item exchangeItem;
    
    public Exchange(int transID, Inventory inv, ArrayList<Item> custItems, Item rItem, Item eItem)
    {
        super(transID, inv, custItems);
        returnItem = rItem;
        exchangeItem = eItem;
    }
    
    @Override
    public void run()
    {
        adjustInventory();
        //adjustMoney();
    }

    @Override
    public void adjustInventory()
    {
        /*
        Note, we should be prepared to handle the exception
        where the replacement/exchange item is not in stock.
        In which case, the transaction should not process.
        This current method does not handle that exception.
        */
        for(int i = 0; i < inventory.getItems().size(); i++)
        {
            if(returnItem.equals(inventory.getItems().get(i)))
            {
                int temp = inventory.getQuantity().get(i);
                inventory.getQuantity().set(i, temp++);
            }
       }
        
       for(int i = 0; i < inventory.getItems().size(); i++)
       {
           if(exchangeItem.equals(inventory.getItems().get(i)))
           {
               int temp = inventory.getQuantity().get(i);
               inventory.getQuantity().set(i, temp--);
           }
       }
    }

    @Override
    public void adjustMoney()
    {
        /*
        In a normal case, we shouldn't have to change tender.
        However, there might be special cases.
        Unless explicitly stated, we should be prepared to handle these.
        */
    }

    /**
     * @return the returnItem
     */
    public Item getReturnItem()
    {
        return returnItem;
    }

    /**
     * @param returnItem the returnItem to set
     */
    public void setReturnItem(Item returnItem)
    {
        this.returnItem = returnItem;
    }

    /**
     * @return the exchangeItem
     */
    public Item getExchangeItem()
    {
        return exchangeItem;
    }

    /**
     * @param exchangeItem the exchangeItem to set
     */
    public void setExchangeItem(Item exchangeItem)
    {
        this.exchangeItem = exchangeItem;
    }
}
