package day25_Constructors;

public class TestRectangleObjects {
    public static void main(String[] args) {


       /* Rectangle rect1 = new Rectangle();
        rect1.setInfo(3,4);

        Rectangle rect2 = new Rectangle();
rect2.setInfo(4,5);
        Rectangle rect3 = new Rectangle();
rect3.setInfo(6,3);
        Rectangle rect4 = new Rectangle();
rect4.setInfo(3,8);
        Rectangle rect5 = new Rectangle();
rect5.setInfo(6,7);
*/

        Rectangle rect1 = new Rectangle(3, 5);
        Rectangle rect2 = new Rectangle(2, 9);
        Rectangle rect3 = new Rectangle(7, 2);
        Rectangle rect4 = new Rectangle(6, 6);
        Rectangle rect5 = new Rectangle(4, 5);

        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);
        System.out.println(rect4);
        System.out.println(rect5);

    }

}
