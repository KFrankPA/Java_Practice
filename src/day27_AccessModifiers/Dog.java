package day27_AccessModifiers;

public class Dog {

    public String breed, size, color;
    public char gender;
    public int age;
    public boolean isFriendly;
    public static int numberOfEYes, numberOfLegs, numberOfWings;

   public Dog(String breed, String size, String color, char gender, int age, int numberOFLegs, int numberOfWings, boolean isFriendly) {
       this.breed = breed;
       this.size = size;
       this.color = color;
       this.gender = gender;
       this.age = age;
       this.isFriendly = isFriendly;
   }
    static{
        numberOfEYes = 2;
        numberOfLegs = 4;
        numberOfWings = 0;
    }

    public void east(){
        System.out.println(breed + "is eating");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", isFriendly=" + isFriendly +
                '}';
    }
}
/*
Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()


 */