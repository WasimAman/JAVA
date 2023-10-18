import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(even(num));
        sc.close();
    }
    public static String even(int num){
        if((num&1)==0){
            return num+" is even";
        }
        return num+" is odd";
    }
 }
