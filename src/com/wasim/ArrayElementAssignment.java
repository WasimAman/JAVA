package com.wasim;
public class ArrayElementAssignment {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 97;
        a[1] = 'b';
        byte b = 112;
        a[3] = b;
        short s = 432;
        a[4] = s;
        a[2] = 0xbeef;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
