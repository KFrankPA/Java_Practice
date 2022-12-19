package day32_Final_keyword.car_task_methodOverriding;

public class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void start(){
        System.out.println("Press start button to start " + getMake() + " " +getModel());
    }

}
