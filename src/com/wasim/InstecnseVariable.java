package com.wasim;
public class InstecnseVariable {
    int x = 10; // instance variable 
    public static void main(String[] args) {
        // System.out.println(x);  // we can't access instance variable directly
        InstecnseVariable t = new InstecnseVariable();
        System.out.println(t.x);    // we can accsee instance variable like this.
    }
}
