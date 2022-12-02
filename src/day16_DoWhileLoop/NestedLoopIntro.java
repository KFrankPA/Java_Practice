package day16_DoWhileLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("spoon");
        }
        System.out.println("-----------------------------------------------");
        //========================================================

        for (int i = 0; i < 5; i++) {  //i : 0
            System.out.println("fork");

            for (int j = 0; j < 5; j++) {
                System.out.println("spoon5");

            }
        }


    }
}
