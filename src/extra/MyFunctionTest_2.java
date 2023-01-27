package extra;

public class MyFunctionTest_2 {

    public static void main(String[] args) {

        MyFunction_2 cube = (a) -> {
            System.out.println(a*a*a);
        };

        cube.test(4);

        System.out.println("-----------------------------");

        MyFunction_2 oddOrEven = a -> {

            if(a % 2 == 0){
                System.out.println(a + " Even");
            }else{
                System.out.println(a + " Odd");
            }
        };

        oddOrEven.test(3);

    }
}
