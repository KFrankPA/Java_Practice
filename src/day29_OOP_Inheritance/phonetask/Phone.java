package day29_OOP_Inheritance.phonetask;

public class Phone {
    private String brand, model, color;
    private double price, size;

    public String getBrand() {
        return brand;
    }

    public void setInfo(String brand, String model, String color, double price, double size) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
    }

    public void setBrand(String brand) {
        if(brand.isEmpty() || brand.isBlank()){
            System.err.println("Brand name can not be empty " + brand);
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.isEmpty() || model.isBlank()){
            System.err.println("Brand name can not be empty " + model);
            System.exit(1);
        }
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty() || color.isBlank()){
            System.err.println("color name can not be empty " + color);
            System.exit(1);
        }
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.out.println("price can not be negative " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
        public void call(long phoneNumber){
            System.out.println(model+" is calling "+phoneNumber);
        }

        public void text(long phoneNumber){
            System.out.println(model+" is texting to "+phoneNumber);
        }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
