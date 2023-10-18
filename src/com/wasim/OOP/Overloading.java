package com.wasim.OOP;

public class Overloading {
    public void methode1(){
        // NO arg methode
        System.out.println("No arg methode!");
    }
    public void methode1(int a){
        // one int arg methode
        System.out.println("Int arg methode");
    }
    public void methode1(int a,int b){
        // two int arg methode
        System.out.println("Int a,b arg methode");
    }
    public void methode1(double a){
        // one double arg methode
        System.out.println("double arg methode");
    }

    // main methode
    public static void main(String[] args){
        Overloading o = new Overloading();
        o.methode1();   // here I'm passing nothing so No arg methode will call.
        o.methode1(10); // here int arg methode will call
        o.methode1(12,65);  // int a,b arg methode will call.
        o.methode1(10.5);   //and here double arg methode will call.
    }
}
