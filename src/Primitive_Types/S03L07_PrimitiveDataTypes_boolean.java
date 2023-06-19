package Primitive_Types;

import java.math.BigDecimal;

public class S03L07_PrimitiveDataTypes_boolean {
    public static void main (String args[]){
        boolean var1 = true;
        boolean var2 = false;


        char ch1 = 'u';
        char ch2 = 'o';

        System.out.println(ch1);

        double x = 1.05;
        double y = 2.55;
        System.out.println(x + y);

        BigDecimal d1 = new BigDecimal("1.05");
        BigDecimal d2 = new BigDecimal("2.55");

        System.out.println(d1.add(d2));

        String hello = "Hello world \u00BB";
        String num1 = "10";
        String  num2 = "20";

        System.out.println(num1 + num2);

        System.out.println(hello);



        //Type Casting:
        int val1 = 1000000000;
        short val2 = (short) val1;
        System.out.println(val2);



    }

}
