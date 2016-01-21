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
public class Customer
{
    private String firstName;
    private String lastName;
    private String address; // this will probably be broken apart later
    private ArrayList<Transaction> transactionHistory;
    
    public Customer(String theFirstName, String theLastName, String theAddress)
    {
        firstName = theFirstName;
        lastName = theLastName;
        address = theAddress;
        transactionHistory = new ArrayList<Transaction>();
    }

    /**
     * @return the firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * @return the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * @return the transactionHistory
     */
    public ArrayList<Transaction> getTransactionHistory()
    {
        return transactionHistory;
    }

    /**
     * @param transactionHistory the transactionHistory to set
     */
    public void setTransactionHistory(ArrayList<Transaction> transactionHistory)
    {
        this.transactionHistory = transactionHistory;
    }
}
