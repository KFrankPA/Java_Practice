package replits;
import java.util.Stack;
public class MeTati {


        public static void main(String[] args) {
            String weights = "30,5,6,7,15,85"; // given weights of individual luggage in a string

            Stack<Integer> container1 = new Stack<>();
            Stack<Integer> container2 = new Stack<>();
            int containerWeight = 0;
            String[] individualWeight = weights.split(","); // getting array of individual weights
            for (String each : individualWeight) {
                // konvertiruem kajdiy ves bagaja iz String v Integer object
                int weight = Integer.parseInt(each);
                containerWeight += weight;
                // smotrim tut esli ves bagaja v predelah limita
                if (containerWeight <= 40) {
                    container1.add(weight);
                } else {
                    //  esli ves konteynera bolshe 40, to tut dobavlyaem ves vo vtoroy kontainer
                    // and reset containerWeight
                    container2.add(weight);
                    containerWeight = weight;
                }
            }

            // create a stack of stacks chtobi hranit vse bagaji
            Stack<Stack<Integer>> allBaggage = new Stack<>();
            allBaggage.add(container1);
            allBaggage.add(container2);

            // loop through all baggage and print out the top element of each container
            for (Stack<Integer> eachContainer : allBaggage) {
                if (!eachContainer.isEmpty()) {
                    System.out.println(eachContainer.pop());
                }
            }
        }
    }

