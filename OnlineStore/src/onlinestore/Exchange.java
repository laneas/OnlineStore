/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore;

/**
 *
 * @author Ardjen
 */
public class Exchange extends Transaction
{
    private Item returnItem;
    private Item exchangeItem;
    
    public Exchange(int transID, Item rItem, Item eItem)
    {
        super(transID);
        returnItem = rItem;
        exchangeItem = eItem;
    }

    @Override
    public void adjustInventory()
    {
        throw new UnsupportedOperationException("Not supported yet.");
        //Add return Item to Inventory
        //Remove exchangeItem to Inventory
    }

    @Override
    public void adjustMoney()
    {
        throw new UnsupportedOperationException("Not supported yet.");
        //Should not have to change Tender
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
