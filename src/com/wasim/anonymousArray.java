package com.wasim;
public class anonymousArray {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{10,20,30,40,50}));
    }
    public static int sum(int[] a){
        int sum = 0;
        for(int x:a){
            sum+=x;
        }
        return sum;
    }
}
