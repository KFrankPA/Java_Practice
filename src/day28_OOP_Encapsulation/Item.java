package day28_OOP_Encapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty() || name == null) {
            System.err.println("Name can not be empty or blank: " + name);
            System.exit(1);
        }
        String specialChars = ""; // to get all special chars other than space
        for (char each : name.toCharArray()) {
            if (!Character.isLetterOrDigit(each) && each != ' ') {  // getting all special character except for space
                specialChars += each;
            }
        }

        if (specialChars.length() > 0) { // if contains special characters other than space
            System.err.println("Invalid Name: " + name);
            System.exit(1);
        }

        if (!Character.isLetter(name.charAt(0))) { // if name does not start with letter
            System.err.println("Invalid Name: " + name);
            System.exit(1);
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.err.println("Price can not be zero");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.err.println("Quantity can not be zero: " + quantity);
            System.exit(1);
        }
        if (name.equalsIgnoreCase("Toilet paper")) {
            this.quantity = 1;
        }
        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }

    public double calcCost() {
        return quantity * unitPrice;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", calculate cost=" + calcCost() +
                '}';
    }
}
/*
create a class called Item
        private variables:
            name, unitPrice, quantity

        Encapsulate all the fields:
            Conditions:
                name can not be empty or blank
                name can not contain any special characters other than space
                name must start with letters
                unit price can not be negative
                quantity can not be negative
                if the Item name is toilet paper (case-insensitive) then the quantity can not be more than 1


        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Methods:
            calcCost(): returns the total cost
            toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

 */