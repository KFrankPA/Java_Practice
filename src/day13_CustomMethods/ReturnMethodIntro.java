package day13_CustomMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        // int total= sum(20, 40); // sum is void method, does not return any data

        int sum = addition(10,20);

        int ab = square(5);
        System.out.println(addition(50, 20));
        System.out.println(square(3));

        System.out.println(cube(4));




    }

    public static int addition(int n1, int n2){
        int result = n1+n2;
        return result;
    }

        public static int square(int num5){

        int square = num5 * num5;
        return square;
        }

        public static int cube(int num){
        int cube = square(num) * num;
        return cube;
        }




}
