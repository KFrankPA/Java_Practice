package replits;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
public class Tatis_Code {


    public static void main(String[] args) {
        String weights = "30,5,6"; // given weights of individual luggage in a string

        Stack<String> container1 = new Stack<>();
        Stack<String> container2 = new Stack<>();
        int containerWeight = 0;
        String[] individualWeight = weights.split(","); // getting array of individual weights
        for (String each : individualWeight) {

            containerWeight += Integer.parseInt(each);
            if (containerWeight <= 40) {
                container1.add(each);
            } else {
                container2.add(each);
            }
        }

        Stack<Stack> allBaggage = new Stack<>();
        allBaggage.add(container1);
        allBaggage.add(container2);

        for (Stack eachContainer : allBaggage) {
            System.out.println(eachContainer.pop());

        }
    }
}


