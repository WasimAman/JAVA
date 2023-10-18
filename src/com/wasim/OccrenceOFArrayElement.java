package com.wasim;
import java.util.Scanner;
public class OccrenceOFArrayElement {
    public static void main(String[] args) {
        int[] arr = {5,2,65,3,4,5,8,2,3,7,5,5,3,4,9,98};
        sortArray(arr);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number whose occrence you want to search:- ");
        int n = sc.nextInt();
        getOccrence(arr, n);
        sc.close();
    }
    public static void sortArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            int index = i;
            for(int j=i+1;j<(arr.length)-1;j++){
                if(arr[index]>arr[j]){
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public static void getOccrence(int[] arr,int n){
        int fisrt=0,last=0;
        boolean find = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n && find==false){
                fisrt = i;
                find = true;
            }
            else if(arr[i]==n && find==true){
                last = i;
            }
        }
        System.out.println("First occrence of "+n+" is "+fisrt);
        System.out.println("Last occrence of "+n+" is "+last);

    }
}
