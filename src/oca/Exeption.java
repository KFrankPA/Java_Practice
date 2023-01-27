package oca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import oca.CarTest;

public class Exeption  {


    public static void main(String[] args) throws Exception{

        System.out.println("Start");

String str = "Java";

        try{
            System.out.println("try start");

            System.out.println(9/0);

            System.out.println("try finish");

        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Catch start");
            System.out.println(9/0);
           // System.out.println(str.charAt(5));
          //  System.out.println(9/0);

            System.out.println("Catch finish");
        }
        catch (Exception a){
           System.out.println("second catch");
            System.out.println(9/0);
            //System.out.println(9/0);
            System.out.println("second catch finish");

        }finally {
            System.out.println("Finally block");
        }



       // System.out.println(9/0);
      //  System.out.println(str.charAt(5));
        System.out.println("finish");







    }
}
