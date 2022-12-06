package day28_OOP_Encapsulation.candy;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public double getPrice(){

        return price;
    }

    public void setPrice(double price){
        if(price < 0 ){
            System.err.println("Price can not be negative: "  + price);
            System.exit(1);
        }
        this.price = price;
    }

  public int getQuantity(){
        return quantity;
  }

  public void setQuantity(int quantity){
        if(quantity <= 0){
            System.err.println("Quantity cant be zero or negative: " + quantity);
            System.exit(1);
        }
        this.quantity = quantity;
  }

  public String getBrand(){
        if(price == 0){
            System.out.println("Free");
            return brand;
        }
        return brand;
  }
  public void setBrand(String brand){
        this.brand = brand;
  }

}
/*
. Create a custom class named Candy
        private variables:
            brand (String), quantity (int), price (double), hasPeanuts (boolean)

        Encapsulate All the private fields
                (price of candy can not be set to negative)
                (quantity of candy can not be set to zero or negative)

        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Extra methods:
            toString():
                if the price is zero, print "free" instead of 0

        5.1 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy


 */