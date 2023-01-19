package extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGenerics {

    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30, 40, 50, 60};

        Double[] decimals = {10.5, 20.5, 30.21, 40.4, 50.6, 60.8};

        Character [] characters = {'A', 'B', 'C', 'D', 'E'};

        String[] str = {"Java", "SQL", "Python"};

        Generics.printEach(characters);

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30));

     //  Generics.printEach(list);

        Generics<Integer> obj = new Generics();

        obj.printEachInstance(str);

        Generics.printEach(str);




    }
}
