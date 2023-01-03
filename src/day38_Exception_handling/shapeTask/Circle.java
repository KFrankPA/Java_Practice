package day38_Exception_handling.shapeTask;

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new InvalidShapeException("Invalid " + getClass().getSimpleName() + " radius");
        }
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(0);
    }
}
