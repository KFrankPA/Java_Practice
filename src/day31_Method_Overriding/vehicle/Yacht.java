package day31_Method_Overriding.vehicle;

public class Yacht extends Boat{

    public Yacht(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void sail(){
        System.out.println(getBrand() + " is sailing");

    }

}