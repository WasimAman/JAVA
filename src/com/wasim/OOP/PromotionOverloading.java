package com.wasim.OOP;

public class PromotionOverloading {
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
    public static void main(String[] args) {
        PromotionOverloading p = new PromotionOverloading();
        p.methode1();   // NO arg methode
        p.methode1('w');    // Int arg methode
        p.methode1(10f);    // double arg methode
        p.methode1(65L);    // double arg methode
        p.methode1(65,'a'); // Two int arg methode
    }
}
