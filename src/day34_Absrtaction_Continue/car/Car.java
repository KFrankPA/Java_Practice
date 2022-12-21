package day34_Absrtaction_Continue.car;

public abstract class Car { // meant to be inherited, van not be in instantiated

    private final String make, model;

    private String color;

    private final int year;

    private double price;

    public Car(String model, String color, int year, double price) {
        this.make = getClass().getSimpleName(); // sets the class name to the make of the car
        this.model = model;
        this.color = color;
        if(year < 1886){
            System.err.println("Wrong car year: " + year);
            System.exit(1);
        }
        this.year = year;
       setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.out.println("Price can not be 0 or negative: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    protected final void stop(){
        System.out.println("Press the break to stop " + make + " " + model);
    }
protected abstract void start(); // meant to be overriden

    @Override
    public String toString() {
        return  make + " {" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
