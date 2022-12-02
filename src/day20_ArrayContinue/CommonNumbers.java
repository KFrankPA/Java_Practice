package day20_ArrayContinue;

public class CommonNumbers {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5};
        int[] arr2= {4,5,6,7,8};

        for (int each : arr1) {
            for (int element : arr2) {
                if(each == element){
                    System.out.print(each + " ");
                }
            }

        }

    }
}
/*
ite a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}
          output:
              4 5
 */