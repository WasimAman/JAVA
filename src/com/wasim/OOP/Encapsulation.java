package com.wasim.OOP;
class Account2{
    // Encapsulation = Data members+ methods
    // in other word we can say that it is data hiding + abstraction.
    // The process of binding data members and behaviours is nothing but encapsulation
    private double balance;     // Data member
    public double getBalance(){    // Behaviour 1
        // validate
        return balance;
    }

    public void setBalance(double balance){    // Behaviour 2
        // validate
        this.balance = balance;
    }

}
// Starting point of this program.
public class Encapsulation {
    public static void main(String[] args){
        Account2 SBI = new Account2();
        System.out.println(SBI.getBalance());
        SBI.setBalance(10000);
        System.out.println(SBI.getBalance());
    }
}
