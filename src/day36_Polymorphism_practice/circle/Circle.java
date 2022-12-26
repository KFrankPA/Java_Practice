package day36_Polymorphism_practice.circle;

public class Circle {

    private double radius;

    public final static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius * radius * PI;
    }

    public double perimeter(){
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                ", radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Circle)){ // if specified object is not circle then we should not compare them
            System.err.println("Invalid Object");
            System.exit(1);
             }
        if(radius == ((Circle) obj).radius){
            System.out.println("hey radius");
            return true;
        }

        return false;
    }

}
