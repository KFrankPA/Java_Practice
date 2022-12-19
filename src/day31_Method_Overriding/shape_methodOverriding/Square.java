package day31_Method_Overriding.shape_methodOverriding;

public class Square extends Shape{

    public double side;

    public Square(double side) {
      setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\t* * * * * *");
        for (int i = 0; i < 3; i++) {
            System.out.println("\t*         *");
        }


        System.out.println("\t* * * * * *");
    }
    public String toString() {

        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", side='" + getSide() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                ", area='" + area() + '\'' +

                '}';
    }
}
