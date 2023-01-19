package extra;

import java.util.function.Consumer;

public class Consumer_interface {

    public static void main(String[] args) {

        Consumer<int[]> printEach = a -> {
            for (int each : a) {
                System.out.println(each);
            }
        };

        int [] j = {1,2,4,5,6,8,55};

        printEach.accept(j);

    }
}
