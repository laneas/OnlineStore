/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore;

import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author jakesemple
 */
public interface TransactionDAO {
    /** 
    * This is the method to initialize
    * database resources ie. connection.
    */
   public void setDataSource(DataSource ds);
   /** 
    * This is used to create
    * a record in the Transaction table.
    */
   public void createTransaction(Integer id, String date_Time, String transactionType, Integer InventoryID);
   /** 
    * This is the method to be used to list down
    * a record from the Transaction table corresponding
    * to a passed Transaction id.
    */
   public Transaction getTransaction(Integer id);
   /** 
    * This is the method to be used to list down
    * all the records from the Transaction table.
    */
   public List<Transaction> listTransaction();
   /** 
    * This is the method to be used to delete
    * a record from the Transaction table corresponding
    * to a passed transaction id.
    */
   public void delete(Integer id);
   /** 
    * This is the method to be used to update
    * a record into the Transaction table.
    */
   public void update(Integer id, String date_Time, String transactionType, Integer InventoryID);
}
