package day32_Final_keyword.car_task_methodOverriding;

public class Car {

    private String make, model, color;
    private int year;
    private double price;

    public static int numberOfWheels;
    public static boolean hasBattery;

    public Car(String model, String color, int year, double price) {
        setMake(getClass().getSimpleName()); // setting the class name to the make of the car
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);

    }
    static {
        numberOfWheels = 4;
        hasBattery = true;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String name) {
        this.make = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) { // if year is negative or zero
            System.out.println("Invalid year " + year);
            System.exit(1); // terminates the program
        }
        this.year = year;
    }

    public double getPrice() {
        if (price <= 0) { // if price negative or zero
            System.out.println("Invalid price " + price);
            System.exit(1); // exits the program
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void start(){
        System.out.println("Press the brake and twist the key to ignition to start " + make + " " + model);
    }

    //@Override
    public String toString() {
        return make + "{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", number of wheels=" + numberOfWheels +
                ", has a battery=" + hasBattery +
                '}';
    }
}
