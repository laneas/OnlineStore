/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore;

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
    
    
    Order(){
        
        System.out.println("What type of order ");
        switch (orderType) {
            case ("sale"):
                transaction = new Sale(OrderID, transBill);
                break;

            case ("return"):
                transaction = new ReturnItem(OrderID, transBill);
        }
    }
}
