package extra;

public class MyFunctionTest {
    public static void main(String[] args) {

        MyFunfction<Integer> cube = (a) -> {
            System.out.println(a*a*a);
        };

        cube.function(5);


    }
}
