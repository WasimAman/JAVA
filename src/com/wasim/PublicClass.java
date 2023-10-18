package com.wasim;
public class PublicClass {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}

/*
    We can't create public class PublicClass as private class PublicClass
    because top class must be public it can't be private

    public means accessible from anywhere means anyone can access this class from other package or other
    program...

    Default class is nothing but class with no access modifier

    ex:-
        class PublicClass{
              public static void main(String[] args){
                    System.out.println("Hello");
              }
         }
*/