package day31_Method_Overriding.fieldHide;


class A{
    public int a = 100;
}



public class FieldHiding  {

    public int a = 200;

    public static void main(String[] args) {
        System.out.println(new FieldHiding().a);
    }
}

