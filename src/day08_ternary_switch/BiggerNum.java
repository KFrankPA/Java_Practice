package day08_ternary_switch;

public class BiggerNum {
    public static void main(String[] args) {




        int n1=6,
                n2=2,
                n3=3;

        String biggest ;
        biggest= (n1>n2 && n1 > n3)? n1 + " Biggest" : (n2>n1 && n2>n3 )? n2 + " Biggest" : ( n3 > n1 && n3> n2)?
                n3 + " Biggest" : " invalid";
        System.out.println(biggest);



    }


}
/*
Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
 */