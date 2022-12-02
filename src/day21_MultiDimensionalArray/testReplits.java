package day21_MultiDimensionalArray;

public class testReplits {
    public static void main(String[] args) {

        int [] a ={1, 2, 3, 4, 3, 4, 1, 5, 9};
        int unique = 0;

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            int ip = a[i];
            for (int j = 0; j < a.length; j++) {
                int ab = a[j];
                if(ip == ab){
                    count ++;
                }
            }
            while(count ==1){
                unique = ip;
                break;
            }
        }
        System.out.println(unique);
    }
}
