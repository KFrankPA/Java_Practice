package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("========================");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs", "Rice", "Tomatoes", "Oranges", "Milk", "Bread", "Meat", "Apples"));
        Collections.sort(items);
        System.out.println(items);

        Collections.reverse(items);
        System.out.println(items);

        System.out.println("============================");

        ArrayList<String> items2 = new ArrayList<>(
                Arrays.asList("Potato", "Tomato", "Salt", "Green Peppers", "Ketchup"));
        System.out.println(items2);
        Collections.swap(items2, 2, 0);
        System.out.println(items2);

        Collections.swap(items2,0, items2.size()-1);
        System.out.println("items2 = " + items2);

    }
}
