package com.wasim.OOP;
class Parent{
    public void m1(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    public void m2(){
        System.out.println("Child");
    }
}
public class Inheritance {
    public static void main(String[] args){
        Parent p = new Parent();
        p.m1();
       // p.m2();   ---> Error Because child class method is not available
       //                to the parent class

        Child c = new Child();
        c.m2();
        c.m1();

        Parent p1 = new Child();
        p.m1();
       // p.m2();   ---> Error Parent refrence can be used to hold child object
        //               but, we can't call child class methods using parent refrence

       // Child C1 = new Parent();  --->Error
    }
}
