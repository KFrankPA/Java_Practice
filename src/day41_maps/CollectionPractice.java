package day41_maps;

import day33_Abstraction.employeeTask.Employee;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7,8,9,10,11,12,14));

        List<List<Integer>> lists = new ArrayList<>();
        // lists.addAll(Arrays.asList(list1, list2));

        lists.add(list1);
        lists.add(list2);
        System.out.println(lists);

       // List <int[][]> l = new ArrayList<>();

        System.out.println(lists.get(1).get(3));

        for(List<Integer> eachList : lists){
            for(Integer each : eachList){

                if(each == 10 ){
                    System.out.println(each);
                }
            }
        }

        System.out.println("---------------------------");

        List<Set<Integer>> listOfSets = new ArrayList<>();
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());

        System.out.println(listOfSets);

        listOfSets.get(0).addAll(Arrays.asList(10,20,30,10,20,60));
        listOfSets.get(1).addAll(Arrays.asList(1,2,3,4,5,6));
        listOfSets.get(2).addAll(Arrays.asList(100,200,300,400,500));
        listOfSets.get(3).addAll(Arrays.asList(14,597,455,1478));
        System.out.println(listOfSets);

        System.out.println("------------------------------");

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9};

        List<int[]> listOfArrays = new ArrayList<>();

        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

        System.out.println(Arrays.toString(listOfArrays.get(0)));

        listOfArrays.get(0)[2] = 35;

        System.out.println(Arrays.toString(listOfArrays.get(0)));

        System.out.println("----------------------------------------");

        List<List<Employee>> team = new ArrayList<>();





    }

}
