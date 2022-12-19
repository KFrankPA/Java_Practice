package day31_Method_Overriding.shape_methodOverriding;

public class Shape {

    public String name;

    public Shape(){
     setName(getClass().getSimpleName());
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    public void draw(){
        System.out.println("Drawing a " + getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
