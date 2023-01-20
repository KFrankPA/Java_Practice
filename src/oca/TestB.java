package oca;

import java.util.stream.DoubleStream;

public class TestB {
    int al ;
    public static int  doProduct(int a ){

        a = a * a ;
        return a;
    }

    public static String doString(String s ){
     s.concat  (" " + s +" test" );
        return s;
    }

    public static void main(String[] args) {

        TestB item = new TestB();
        item.al = 11;
        String sb = "Hello";
        Integer i = 10;
        i = doProduct(i);
      sb = doString(sb);
        doProduct(item.al);
        System.out.println(i + " " + sb + " " + item.al );

        String test1 = "Hello";
        String test2 = "Morning";

      test1 = test1.concat(test2);

        System.out.println(test1);


    }
}
