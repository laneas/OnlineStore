package onlinestore;

public abstract class Transaction extends Thread
{
    //private Customer customer;
    protected int transactionID;
    protected Inventory inventory;
    protected double storeLedgerBalance;

//    protected Customer customer;
    
    public Transaction(int transNum, Inventory theInventory)
    {
        transactionID = transNum;
        inventory = theInventory;
    }
    
    /*
    Generic methods for altering the inventory and funds
    Child classes should handle this differently
    */
    public abstract void adjustInventory();
    public abstract void adjustMoney();

    public Inventory getInventory()
    {
        return inventory;
    }

    public void setInventory(Inventory inventory)
    {
        this.inventory = inventory;
    }
    
}
