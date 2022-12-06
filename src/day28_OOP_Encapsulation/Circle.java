package day28_OOP_Encapsulation;

public class Circle {

    private double radius;

    public static double pi = 3.14;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.err.println("Radius can not be negative or zero: " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
       setRadius(radius);
    }

    public double calcArea(double radius) {
        return (radius * radius) * pi;
    }

    public double calcPerimeter(double radius) {
        return 2 * radius * pi;
    }

    public String toString() {
        return "Circle{" +
                " radius=" + getRadius() +
                " area=" + calcArea(radius) +
                " perimeter=" + calcPerimeter(radius) +
                '}';
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        //  System.out.println(circle1.calcArea(5));
        // System.out.println(circle1.calcPerimeter(5));
        System.out.println(circle1);
    }
}
/*
. Create a class named Circle

        private variables:
            radius

        public variable:
            pi

         Encapsulate all the private fields

                 1. radius of the circle can not be zero or negative

         Add a constructor that can set the radius of circle when circle object is created
                 (If the arguments not valid it should not be set to the instances)

         Methods:
             calcArea()
             calcPerimeter()
             toString(): displays the radius, area and perimeter of the circle when the circle object is passed in the print statement

 */