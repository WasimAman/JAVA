package com.wasim;
//class Parent{
//    public void property(){
//        System.out.println("GOLD+LAND+CASH");
//    }
//    public final void marry(){
//        System.out.println("Subhalaksmi");
//    }
//}
//class Child extends Parent{
//    public void marry(){
//        System.out.println("Tamanna");
//    }
//}
public class FinalExample {
    public static void main(String[] args){
        System.out.println("Hello");
//        Child c = new Child();
//        c.marry();
//        c.property();
    }
}

/*
    This program will through an error because in parent class marry method is final
    and child class can't override the method because of final keyword...
*/

/*
    one more thing we have to understand that if we declare a class as final
    we can't inherit that class in somewhere means inheritance will not be possible.
*/
