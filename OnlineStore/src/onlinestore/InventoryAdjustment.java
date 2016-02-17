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
public class InventoryAdjustment extends Transaction
{
    private Item adjustItem;
    private int quantity;
    
    public InventoryAdjustment(int transID, Inventory inv, ArrayList<Item> custItems, int theQuantity)
    {
        super(transID, inv, custItems);
        quantity = theQuantity;
    }

    /**
     * @return the adjustItem
     */
    public Item getAdjustItem()
    {
        return adjustItem;
    }

    /**
     * @param adjustItem the adjustItem to set
     */
    public void setAdjustItem(Item adjustItem)
    {
        this.adjustItem = adjustItem;
    }

    /**
     * @return the quantity
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    @Override
    public void adjustInventory()
    {
        throw new UnsupportedOperationException("Not supported yet."); 
        //find item and adjust accordingly
    }

    @Override
    public void adjustMoney()
    {
        throw new UnsupportedOperationException("Not supported yet.");
        //no change to money needed
    }
}
