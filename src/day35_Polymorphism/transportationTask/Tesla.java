package day35_Polymorphism.transportationTask;

public class Tesla extends Car implements Electric, AutoPilot{

    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " can Auto Park");

    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " can self drive");

    }

    @Override
    public void charge() {

    }
}
