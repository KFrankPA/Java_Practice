package day18_GarbageCollection;

public class PizzaObjects {

    public char size; // instance variable (means multiple copies can be made)
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    public double calcCost(){
        double totalPrice = 0;
         switch (size){
             case 'S':
             case 's':
                 totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                 break;
             case 'M':
             case 'm':
                 totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                 break;
             case 'L':
             case 'l':
                 totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                 break;
             default:
                 System.err.println("Invalid size: " + size);
         }

        return totalPrice;
    }

    public void setInfo(char size, int numberOfChesseTopping, int numberOfPepperoniTopping){

        this.size = size;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        this.numberOfCheeseTopping = numberOfChesseTopping;

    }


    public String toString() {
        return "PizzaObjects{" +
                "size=" + size +
                ", numberOfChesseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price= " + calcCost() +

                '}';

    }
}
