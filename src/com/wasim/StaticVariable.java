package com.wasim;
public class StaticVariable {
    static int x = 10;
    public static void main(String[] args) {
        StaticVariable s = new StaticVariable();
        // All are correct...
        System.out.println(x);       
        System.out.println(s.x);
        System.out.println(StaticVariable.x);   // recommended to use this this method..

    }
}
