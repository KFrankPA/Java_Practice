package day31_Method_Overriding.shape_methodOverriding;

public class TestShapeObjects {
    public static void main(String[] args) {

        Square square = new Square(5);

        System.out.println(square);

      square.draw();

        System.out.println("=================");

        Circle circle1 = new Circle(7);
        circle1.setRadius(45);
        System.out.println(circle1);
    }

}
