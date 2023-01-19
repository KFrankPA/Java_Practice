package oca;

public class vehicle {

    char abc;

    static int a = 0;
int g =0;
public void change(){
    while(g < 5){
g++;
a ++;

    }


    }


    public void start() {
        System.out.println("Initialize");


    }

    public void second() {
        System.out.println("finish");
        //  start();


    }

    public static void main(String[] args) {

        vehicle veh = new vehicle();
        vehicle veh2 = veh;


        veh2.abc = 'f';
        veh.abc = 'i';

        System.out.println(veh.a + " , " + veh2.a);

    }

}