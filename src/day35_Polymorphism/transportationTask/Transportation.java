package day35_Polymorphism.transportationTask;

public abstract class Transportation{

private final String make, model;

private String color;

private final int year;

private double price;

    public Transportation(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
       setColor(color);
        this.year = year;
        setPrice(price);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public abstract void transportPeople();

    public abstract void start();

    public void stop(){
        System.out.println("Shut of the engine");
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
