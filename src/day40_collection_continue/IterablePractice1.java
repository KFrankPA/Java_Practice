package day40_collection_continue;

import java.util.*;

public class IterablePractice1 {

    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "Ali", "Alexia", "Jennifer", "Julia", "Chris", "Yunus", "ahmed", "AHmEd", "AhMEd","aHmed"));

      //  names.removeIf(p-> p.equalsIgnoreCase("ahmed"));
        System.out.println(names);

        Iterator <String> it = names.iterator();
        System.out.println(it.hasNext());
        System.out.println(it.next());

        while (it.hasNext()){

            String each = it.next();

            if(each.equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("-----------------------------------------------");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6));

        int n = 5;

        for (int i = 0; i < n - 1; i++) {

            list.removeIf(p-> Collections.max(list)== p);
        }

        int max = Collections.max(list);

        System.out.println(max);


    }

}
