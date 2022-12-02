package day25_Constructors;

public class Pizza {

    public String size;
    public int numberOfCheeseTopping;
    public int numberOFPepperoniTopping;


    public Pizza(String size, int numberOfCheeseTopping, int numberOFPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOFPepperoniTopping = numberOFPepperoniTopping;
    }

    public double calcCost(){
       double statingPrice = (size.equalsIgnoreCase("small"))? 10 : (size.equalsIgnoreCase("medium"))?
               12 : 14;
       double totalprice = statingPrice + 2 * (numberOFPepperoniTopping + numberOfCheeseTopping);
               return totalprice;
    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOFPepperoniTopping=" + numberOFPepperoniTopping +
                ", Total Price=" + calcCost() +
                '}';
    }

    public static void main(String[] args) {

        Pizza p1 = new Pizza("mediuM",2,2);
        System.out.println(p1);

    }
}
