package com.wasim;
public class primitive {
    public static void main(String[] args){
        int a = 2147483647;
        long b = 2147483647L;
        // float c = 3.5; error
        float c = 3.5f;
        System.out.println(a);        
        System.out.println(b);
        System.out.println(c);
        a = 0xface;
        System.out.println(a);
        char ch = 97;
        System.out.println(ch);
        c = 0xface;
        System.out.println(c);


    }
}
