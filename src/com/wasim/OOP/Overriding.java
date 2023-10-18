package com.wasim.OOP;

class OverrindingDemo {
    public void property(){
        System.out.println("Cash + Gold + Land");
    }
    public void marry(){
        System.out.println("Subhalakhmi");
    }

//    public final void marry(){  // now parent decision is final then child can't override this method
//        System.out.println("Subhalakhmi");
//    }
}

class ChildOver extends OverrindingDemo{
    public void marry(){
        System.out.println("Priya");
    }
}
public class Overriding {
    public static void main(String[] args){
        ChildOver c = new ChildOver();
        c.marry();  // This will override the parent methode
        c.property();

        OverrindingDemo o = new OverrindingDemo();
        o.marry();
        o.property();
    }
}
