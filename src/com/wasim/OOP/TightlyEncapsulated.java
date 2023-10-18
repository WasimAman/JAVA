package com.wasim.OOP;
// Example of tightly encapsulated.
class A{
    // This class is Tightly Encapsulated
    private int x = 10;
}
class B extends  A{
    // This class is not Tightly Encapsulated Because variable should be private.
    int y = 20;
}
class C extends A{
    // This class is Tightly Encapsulated
    private int z = 40;
}

// Another Example of tightly encapsulated.
class A1{
    // This class is not Tightly Encapsulated
    int a = 10;
}
class B1 extends  A1{
    // This class is not Tightly Encapsulated Because parent class is not Tightly Encapsulated
    private int b = 20;
}
class C1 extends B1{
    // This class is not Tightly Encapsulated Because parent class is not Tightly Encapsulated
    private int c = 40;
}
public class TightlyEncapsulated {
    public static void main(String[] args){
        A a = new A();  // creating an object of class A.
    }
}
