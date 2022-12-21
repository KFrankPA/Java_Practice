package day28_OOP_Encapsulation.personTask;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    public Person(String name) { // creates person object by setting the name
        this.name = name;
    }

    public Person(String name, int age) { // Allows us to create Person object by setting name and age of the person object
        this(name);
        this.age = age;
    }

    public Person(String name, String language) { // Allows us to creat Person object just by setting the name and language of the person
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) { // Allows us to creat Person object just by setting the name and gender of the person
        this(name);
        this.gender = gender;
    }

    public Person(String name, int age, char gender) { // Allows us to creat Person object just by setting the name, age and gender of the person
        this(name, age);
        this.gender = gender;
    }

    public Person(String name, int age, char gender, String language) {  // Allows us to creat Person object just by setting the name, age, gender  and language of the person
        this(name, age, gender);
        this.language = language;

    }

    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
    }

    public static void printPlanetNAme() {
        System.out.println("Planet name is: " + planet);
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
