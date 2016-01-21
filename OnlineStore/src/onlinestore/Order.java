/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore;

import java.io.IOException;
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
    private boolean flag;

    Order() {
        flag = true;

        while (flag) {

            System.out.println("What type of order ");

            Scanner in = new Scanner(System.in);
            orderType = in.nextLine();

            switch (orderType) {
                case ("sale"):
//                transaction = new Sale(OrderID, transBill);
//                OrderID++;
                    System.out.println("Sale");
                    break;

                case ("return"):
                    //will look up by OrderID when database is built
//                OrderID = in.nextInt();
//                transaction = new ReturnItem(OrderID, transBill);
                    System.out.println("return");
                    break;

                case ("item lookup"):
//                    transaction.inventory.idLookup(0);
                    System.out.println("Looking up item");
                    break;

                case ("inventory adjustment"):
                    transaction.inventory.listInventory();
                    System.out.println("Which item? ");
                    transaction.inventory.idLookup(in.nextInt());
                    break;

                case ("quit"):
                    System.out.println("k bye");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid Entry");

            }
        }

    }
}
