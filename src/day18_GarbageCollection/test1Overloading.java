package day18_GarbageCollection;

public class test1Overloading {
    public static void main(String[] args) {

        System.out.println(sum(3,4,5,5));
    }

    public static int sum(int n1, int n2){

        return n1+n2;
    }
    public static int sum(int n1, int n2, int n3){

        return sum(n1, n2) + n3;
    }

    public static int sum(int n1, int n2, int n3, int n4){
        return  sum(n1,n2, n3) -n4;

    }
    }

