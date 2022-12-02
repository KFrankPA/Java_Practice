package day25_Constructors;

public class ConstructorsIntro {

    public ConstructorsIntro(){

    }
    public ConstructorsIntro(int a){
        System.out.println("Object is created by using defauld constructor");
    }

    public void add(){

    }

    public static void main(String[] args) {
        ConstructorsIntro obj = new ConstructorsIntro(10);
        System.out.println(obj);

    }
}