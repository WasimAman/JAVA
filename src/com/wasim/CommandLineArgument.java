package com.wasim;
public class CommandLineArgument {
    public static void main(String[] args) {
        String s = "";
        // int total = 0;
        for(int i=0;i<args.length;i++){
            s+=args[i];
            /*
                // total+=args[i];
                we can't do like this because command line argument is in the 
                form of string then + operator will treate as the string concatenation
                not arithmetic operator...
            */
        }
        System.out.println(s);
    }
}
