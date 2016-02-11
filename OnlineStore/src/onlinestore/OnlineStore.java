package onlinestore;

public class OnlineStore
{
    public static TransactionHandler handler;
    
    public static void main(String[] args)
    {
        Inventory i = new Inventory();
        i.getItems().add(new Item(1, 10.00, "bread"));
        //....add more stuff
        handler = new TransactionHandler();
    }
    
}
