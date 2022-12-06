package day28_OOP_Encapsulation;

public class Pizza {

    private char size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniToppings;

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        if (size == '\u0000') {
            System.err.println("Invalid size : " + size);
            System.exit(1);
        }
        if (!(size == 'M' || size == 'm' || size == 'S' || size == 's' || size == 'L' || size == 'l')) {
            System.err.println("Invalid size : " + size);
            System.exit(1);
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0) {
            System.err.println("Number of toppings can not be zero: " + numberOfCheeseTopping);
            System.exit(1);
        }
        if ((size == 's' || size == 'S') && numberOfCheeseTopping <= 3) {
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        } else if ((size == 'M' || size == 'm') && numberOfCheeseTopping <= 4) {
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        } else if ((size == 'L' || size == 'l') && numberOfCheeseTopping <= 5) {
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        } else {
            System.out.println("Invalid number of cheese topping: " + numberOfCheeseTopping);
            System.exit(1);
        }
    }


    public int getNumberOfPepperoniToppings() {
        return numberOfPepperoniToppings;
    }

    public void setnumberOfPepperoniToppings(int numberOfPepperoniToppings) {
        if (numberOfPepperoniToppings < 0) {
            System.err.println("Number of toppings can not be zero: " + numberOfPepperoniToppings);
            System.exit(1);
        }
        if ((size == 's' || size == 'S') && numberOfPepperoniToppings <= 3) {
            this.numberOfPepperoniToppings = numberOfPepperoniToppings;
        } else if ((size == 'M' || size == 'm') && numberOfPepperoniToppings <= 4) {
            this.numberOfPepperoniToppings = numberOfPepperoniToppings;
        } else if ((size == 'L' || size == 'l') && numberOfPepperoniToppings <= 5) {
            this.numberOfPepperoniToppings = numberOfPepperoniToppings;
        } else {
            System.out.println("Invalid number of cheese topping: " + numberOfPepperoniToppings);
            System.exit(1);
        }
    }

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniToppings) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setnumberOfPepperoniToppings(numberOfPepperoniToppings);
    }

    public double calCost() {
        if (size == 's' || size == 'S') {
            return 10 + 2 * (numberOfPepperoniToppings + numberOfCheeseTopping);
        } else if (size == 'M' || size == 'm') {
            return 12 + 2 * (numberOfPepperoniToppings + numberOfCheeseTopping);
        } else {
            return 14 + 2 * (numberOfPepperoniToppings + numberOfCheeseTopping);
        }
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ", calculate cost=" + calCost() +
                '}';
    }

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('s', 0, 3);
        System.out.println(pizza1);
    }
}
/*
Create class named Pizza:
                private variables:
                    size, numberOfCheeseTopping, numberOfPepperoniTopping

                Encapsulate all the fields
                        Conditions:
                            size of the pizza can only be small, medium, large. case-insensitive

                            Number of cheese topping can not be negative, the maximum number of cheese topping is:
                                        small: 3
                                        medium: 4
                                        large: 5

                            Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

                                        small: 4
                                        medium: 5
                                        large: 6

                Add a constructor that allows user to set all the fields when the object is created.
                                (If the arguments not valid it should not be set to the instances)


                Methods:
                    calcCost(): returns the totalCost of the pizza
                    toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */