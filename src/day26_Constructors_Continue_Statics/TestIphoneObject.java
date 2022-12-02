package day26_Constructors_Continue_Statics;

public class TestIphoneObject {
    public static void main(String[] args) {

        Iphone str1 = new Iphone("Iphone 14 pro", "Space Blue", 1199);
        System.out.println(str1.model);
        System.out.println(str1.color);
        System.out.println(str1.price);

        str1.printPhoneInfo();

      /*  System.out.println(str1.brand);
        System.out.println(str1.OS);          calling static members not recommended through object name
        str1.printOSInfo(); */
        System.out.println(Iphone.brand);
        System.out.println(Iphone.OS);
        Iphone.printOSInfo();


    }
}
