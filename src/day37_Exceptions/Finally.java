package day37_Exceptions;

public class Finally {
    public static void main(String[] args) {


        try {
            System.out.println(9 / 0);
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception has been caught");
            e.printStackTrace();
            //   System.exit(1);
        } finally {
            System.out.println("Finally Block");
        }
    }
}