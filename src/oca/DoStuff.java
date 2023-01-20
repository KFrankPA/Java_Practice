package oca;

public class DoStuff {
    int x;
    int y;
    public void doStuff(int x, int y){

        y=this.y;

    }
    public void display(){
        System.out.println(x + " " + y + " " + " : ");
    }

    public static void main(String[] args) {
        DoStuff m1 = new DoStuff();
        System.out.println(m1.x + " printing x");
        m1.x=100;
        System.out.println(m1.x + " printing x");
        m1.y=200;
        System.out.println(m1.y + " printing y");
        DoStuff m2 = new DoStuff();
        m2.doStuff(m1.x , m1.y);
        m1.display();
        m2.display();


    }
}
