package com.wasim;
public class Operator {
    public static void main(String[] args) {
        // Increment and deacrement operator
        // int x = 10;
        // int y = ++x;
        // System.out.println(x);        
        // System.out.println(y);

        // x = 10;
        // y = x++;
        // System.out.println(x);        
        // System.out.println(y);

        // x = 10;
        // y = --x;
        // System.out.println(x);        
        // System.out.println(y);

        // x = 10;
        // y = x--;
        // System.out.println(x);        
        // System.out.println(y);
        
        /*
            Where we can't apply increment or deacrement operator
            1). on boolean value
            2). on constant
            2). on final variable
        */

        /*
            Diffrence between x++ and x+1
            x++ :- result will be (typeof x)(x+1)
                    whatever will be the type of x it wil be the same
            x+1 :- result will be max(int,typeof a,typeof b)
                    whatever will be the type of expression it will be
                    check by the above formula after that final type will be 
                    assign...
            
        */

        // Arithmetic operator.
        // int x = 10;
        // int y = 20;
        // int z = x+y;
        // System.out.println(z);

        // byte a = 10;
        // byte b = 20;
        // byte c = a+b;    // Error because result will be int type and how we
                            // can assign int value into the byte data type variable

        // int a = 10;
        // int b = 0;
        // System.out.println(a+b);
        // System.out.println(a-b);
        // System.out.println(a*b);
        // System.out.println(a/b);    // This line will give Exception because in for decimal value there in no way to repersent INFINITY    
        // System.out.println(a%b);    // This line will throw same exception
        

        // double x = 10.0;
        // double y = 0.0;

        // System.out.println(x+y);    // 10.0
        // System.out.println(x-y);    // 10.0
        // System.out.println(x*y);    // 0.0
        // System.out.println(x/y);    // INFINITY
        // System.out.println(x%y);    // NaN (not a number)


        // System.out.println(-10.0/0.0);  // -Infinity


        // String concatination operator.

        String a = "wasim";
        int b = 10,c = 20,d = 30;
        System.out.println(a+b+c+d);     // wasim102030   
        System.out.println(b+c+d+a);     // 60wasim
        System.out.println(b+a+c+d);     // 10wasim2030
        System.out.println(c+b+a+d);     // 30wasim30

        /*
            Conclusion
            if atleast one operand is string type then + operator will acts as a 
            string concatination operator
            
            if all are numbers then + operator will acts as a arthmetic operator
        */
    }
}
