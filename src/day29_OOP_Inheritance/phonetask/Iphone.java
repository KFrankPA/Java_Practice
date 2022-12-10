package day29_OOP_Inheritance.phonetask;

public class Iphone extends Phone{
    public void faceTime(long phoneNumber){
        System.out.println(getModel()+" is face timing with  number "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getModel()+" is face timing with email "+email);
    }

}
