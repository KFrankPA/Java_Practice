package day14_forLoop;

public class forLoopPractice {
    public static void main(String[] args) {

        for(int i=10; i>5; i--){
            System.out.println("Hello cydeo");

        }
          System.out.println("------------------------");

        for(int a = 1; a <= 10; ++a){
            System.out.print((a)+ "= " + (a + a));
        }
        int sum=0;
        for(int b = 1; b >= 10; ++b){ // 1 2 3 4 5 6 7 8 9 10
            sum = sum + b;           // 1, 2 , 4

        }
        System.out.println(sum);

       for(char i = 'A'; i<= 'Z'; ++i ){ // A - 65, Z - 90;
           System.out.print(i + " ");

       }
        System.out.println();
        System.out.println("Hello");

        for(char x = 'Z'; x >= 'A'; x-- ) {
            System.out.print(x+" ");
        }

    }
}
