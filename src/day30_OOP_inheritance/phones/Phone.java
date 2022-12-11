package day30_OOP_inheritance.phones;

import java.util.ArrayList;
import java.util.Arrays;

public class Phone {

    private String brand, model, size, color;
    private double price;

    public Phone(String brand, String model, String size, String color, double price){
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        String[] brands ={"Nokia", "Samsung", "Apple"};
        if(Arrays.asList(brands).contains(brand)) {
            this.brand = brand;
            }else{
            System.err.println("Invalid brand name " + brand);
            System.exit(1);
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink", "Blue", "Red", "Gray"};
        if (Arrays.asList(colors).contains(color)) {
            this.color = color;
        } else {
            System.err.println("Invalid color: " + color);
            System.exit(1);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.err.println("Price can not be negative: "  + price);
            System.exit(1);
        }
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(getBrand() + " is calling " + phoneNumber);
    }

    public String toString() {
        return getClass().getSimpleName() +  "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
