// we can do this but this i not a good practice overloading methode we should create
// Because argument type may be different. and here all arg type is int.
package com.wasim.OOP;
import java.util.Scanner;

public class OverloadingAdv {
    public static void methode(int... a){
        int sum = 0;
        for(int x:a){
            sum+=x;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("How many number do you want to Enter:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" Number:- ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        methode(arr);
    }
}
