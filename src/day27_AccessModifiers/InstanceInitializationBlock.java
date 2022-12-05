package day27_AccessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;
    public static String yoy;

    /* {
        name = "James";
        age = 20;
    } */

    public InstanceInitializationBlock(String name, int age){
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("James", 25);

        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Ashley", 29 );

        System.out.println(obj1.name);



    }

}
