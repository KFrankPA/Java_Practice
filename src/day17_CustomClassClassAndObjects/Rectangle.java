package day17_CustomClassClassAndObjects;

public class Rectangle {

    public int length;
    public int width;

    public void setInfo(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double area(){
        return this.length * this.width;

    }
    public double perim(){
        return  2 * (this.length+this.width);

    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                " perimeter=" + perim()+
                " area=" + area() +
                '}';
    }
}
/*
create a custom class named Rectangle
		Attributes:
		    length, width

		Actions:
		    setInfo(): sets the length and width of the rectangle object
		    calculateArea(): calculates the area of the rectangle, returns it as double
		    calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
		    toString(): when a rectangle object is passed in print statement
		    		it should display the length, width, area and perimeter of the Rectangle object
 */