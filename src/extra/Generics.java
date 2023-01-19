package extra;

import java.util.List;

public class Generics <T>{
//public class Generics <T> {
    public static <T> void printEach(T[] t){
        for(T each : t){
            System.out.println(each);

        }
    }

    public  static  <T> void printEach(List<T> list){
        for(T each : list){
            System.out.println(each);

        }
    }

    public <T> void printEachInstance(T[] t){
        for(T each : t){
            System.out.println(each);

        }
    }

}
