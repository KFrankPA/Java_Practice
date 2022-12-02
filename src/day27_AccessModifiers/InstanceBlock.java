package day27_AccessModifiers;

public class InstanceBlock {
    {
        System.out.println("Instance block");
    }

    public InstanceBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args){

        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();

    }

}
