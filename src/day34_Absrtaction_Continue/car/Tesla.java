package day34_Absrtaction_Continue.car;

public class Tesla extends Car implements AutoPark{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    protected void start() {
        System.out.println("use voice control to start " + getMake()+ " " + getModel());
    }

    public void autoPilot(){
        System.out.println(getMake() + " " + getModel() + " has an auto pilot function");
    }

    @Override
    public void canAutoPark() {
        System.out.println("Can autoPark");
    }
}
