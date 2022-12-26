package day36_Polymorphism_practice.iPhone;

import java.util.Arrays;

public class IPhone {
    private String brand, model, size, color;
    private double price;

    public IPhone(String brand, String model, String size, String color, double price) {
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
        String[] brands = {"Nokia", "Samsung", "Apple"};
        if (Arrays.asList(brands).contains(brand)) {
            this.brand = brand;
        } else {
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
        if (price < 0) {
            System.err.println("Price can not be negative: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public void call(long phoneNumber) {
        System.out.println(getBrand() + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(getBrand() + " " + getModel() + " is calling " + phoneNumber);
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

    if (!(obj instanceof IPhone)) { // if the given object is IPhone
            System.err.println("Invalid object, Object must be IPhone");
            System.exit(1);
        }
            if (model.equals(((IPhone) obj).model)) { // if the model of IPhone is equal to the given IPhones model
             /* if(color.equals(((IPhone) obj).color)){ // if the color of the Iphone is equal to the given iphone color
                    return true;
            }*/
                System.out.println("Ho Ho Ho");
                return true;
    }

        return false;
}
}
