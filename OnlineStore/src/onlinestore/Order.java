/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore;

import java.util.Scanner;

/**
 *
 * @author jakesemple
 */
public class Order {
    private Transaction transaction;
    private int OrderID;
    private double transBill;
    private String address;
    private String orderType;
    private Item item;
    
    
    
    
    
    Order(){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("What type of order ");
        switch (orderType) {
            case ("sale"):
                transaction = new Sale(OrderID, transBill);
                OrderID++;
                break;

            case ("return"):
                //will look up by OrderID when database is built
                transaction = new ReturnItem(OrderID, transBill);
                break;
            case ("item lookup"):
                transaction.inventory.idLookup(0);
                break;
                case("inventory adjustment"):
                    transaction.inventory.listInventory();
                    System.out.println("Which item? ");
                    transaction.inventory.idLookup(in.nextInt());
                    break;
        }
    }
}
