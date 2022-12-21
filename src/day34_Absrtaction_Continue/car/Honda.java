package day34_Absrtaction_Continue.car;

public class Honda extends Car{

    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    protected void start() {
        System.out.println("Twist the key to ignition to start " + getMake() + " " + getModel());

    }


}
