package day16_DoWhileLoop;

public class Shape {
    public static void main(String[] args) {
/*
        for (int i = 0; i < 1; i++) {

            System.out.println(" * ");
            System.out.println(" * * ");
            System.out.println(" * * *");
            System.out.println(" * * * *");

            for (int j = 0; j < 1; j++) {
                System.out.println(" * * * * * ");
                System.out.println(" * * * * * * ");
                System.out.println(" * * * * * * * ");
                for (int k = 0; k < 1; k++) {
                    System.out.println(" * * * * * * * * ");
                    System.out.println(" * * * * * * * * *");
                }
            }
        }*/
        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
          System.out.println("");
        }
    }
}
