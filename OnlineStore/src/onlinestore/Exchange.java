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
    
    public Exchange(int transID, Inventory inv, ArrayList<Item> custItems)
    {
        super(transID, inv, custItems);
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
        for(int i = 0; i < customerItems.size(); i++)
        {
            for(int k = 0; k < inventory.getItems().size(); k++)
            {
                
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
}
