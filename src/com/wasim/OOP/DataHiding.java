//Demo of Data Hiding.
package com.wasim.OOP;
class Account{
    private double balance = 50000;
    private long accountNo = 123456789;

    // obviously we will not return like this first we will check identification then we will
    // return the balance.
    public double getBalance(){
        // perform validation
        return balance;
    }
    // like this here also we'll check the identification after confirming identification will
    // return the accountNo.
    public long getAccountNo(){
        // perform validation
        return accountNo;
    }
}
public class DataHiding {
    public static void main(String[] args){
        Account ac = new Account();
//        System.out.println(ac.balance);   ----> Error
//        System.out.println(ac.accountNo); ----> Error
//        Because balance and accountNo is private in Account class we can't access directl
        System.out.println("Balance is:- "+ac.getBalance());    // ---> correct
        System.out.println("Account no is:- "+ac.getAccountNo());    // ---> correct
    }
}
