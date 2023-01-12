package day40_collection_continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2,4,5,6,7,8,9,10,12,15,18,20));

       // list.removeIf(p -> p < 5);

        System.out.println(list);
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            Integer each = it.next();
            if(each < 5){
                it.remove();
            }
        }
        System.out.println(list);

        System.out.println("==========-----------------=======================");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(2,4,5,6,7,8,9,10,12,15,18,20));

        System.out.println(list2);

        for (Iterator<Integer> i = list2.iterator(); i.hasNext() ;) {

            Integer each = i.next();

            if(each < 5){
                i.remove();
            }
        }

        System.out.println(list2);

        System.out.println("==========-----------------=======================");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(2,4,10,12,15,18,20,3,4,1,2,1,0,3,4,5,0,1,4));

        list3.removeIf(each -> each < 5);

        System.out.println(list3);

        System.out.println("==========-----------------=======================");

        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(2,4,10,12,15,18,20,3,4,1,2,1,0,3,4,5,0,1,4));

        list4.removeIf(p -> p < 5); // remove.if is shortcut of remove through Iterable

        System.out.println(list3);



    }
}
