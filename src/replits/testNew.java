package replits;

import java.util.ArrayList;
import java.util.Arrays;

public class testNew {
    public static void main(String[] args) {


        ArrayList<Integer> list =new ArrayList<> (Arrays.asList(1, 1, 2, 3, 3, 4, 5, 6, 7, 7, 8));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Cherry", "Lemon", "Banana"));
        list.remove(Integer.valueOf(8));
        System.out.println(list);


      //  list.set(2,9);
       // list.set(1,15);

        System.out.println(list);


    }
}

