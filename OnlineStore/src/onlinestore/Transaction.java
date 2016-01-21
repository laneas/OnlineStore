package onlinestore;

public abstract class Transaction
{
    //private Customer customer;
    private int transactionID;
    
    public Transaction(int transNum)
    {
        transactionID = transNum;
    }
    
    /*
    Generic methods for altering the inventory and funds
    Child classes should handle this differently
    */
    public abstract void adjustInventory();
    public abstract void adjustMoney();
    
}
