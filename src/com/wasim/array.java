package com.wasim;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking simple input array and printing the provided array...
        int[] a = new int[5];
        System.out.print("Enter 5 number:- ");
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enterd number's are....");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
        sc.close();

        // Array creation..
        // int[][] x;  // but the recomended is this one...
        // int b[][];
        // int []c[];
        // int [][]d;  // all are valid...
        // int[] []e;
        // int[] f[];
        // just like we can create 3D array as well...

        int[][] arr = new int[5][3];
        System.out.println(arr[0][0]);


        // char type array we can create like this...
        char[] ch = {'w','a','s','i','m'};
        for(int i=0;i<5;i++){
            System.out.println(ch[i]);
        }

        // String type array we can create like this...
        String[] s = {"Wasim","Ansari"};
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
