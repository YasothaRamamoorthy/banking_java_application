/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author yasot
 */
class Learning{
    private final int initial_balance=1000;
    private int account_balance = initial_balance;
    
    Learning()
    {
        System.out.println("account created sucessfully");
        System.out.println("YOUR ACCOUNT INITAIAL BALANCE IS " + account_balance);
    }
    
    public void putting_money(int amount)
    {
        account_balance=account_balance+amount;
  
    }
    
    public void getting_money(int amount)
    {
       account_balance=account_balance-amount; 
       
    }
    
    public void display_money()
    {
        System.out.println("YOUR ACCOUNT BALANCE IS " + account_balance);
    }
}
public class Mavenproject2 {

    public static void main(String[] args) {
        Learning obj1 = new Learning();
        
        obj1.putting_money(50000);
        obj1.display_money();
        
    }
}
