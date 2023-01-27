package oca;

public class Casting {
    public static void main(String[] args) {

        Short s1=200;
        Integer s2= 400;
        Long s3 = (long) s1 + s2;
        String s4 = "" + (s3 *s2);
        System.out.println(s4);
        System.out.println(s3);
    }
}
