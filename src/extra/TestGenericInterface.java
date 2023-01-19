package extra;

public class TestGenericInterface {

    public static void main(String[] args) {

        MyFunfction<Integer> displayCube = (a) -> {
            System.out.println(a * a * a);  }; // if one statement only then curly braces are optional

        displayCube.function(5);

        MyFunfction<String> thirdCharacter = a -> System.out.println("Third character of " + a  + " is " + a.charAt(2));

       thirdCharacter.function("Sprint");




    }

}
