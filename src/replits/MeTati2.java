package replits;
import java.util.Stack;
public class MeTati2 {


        public static String unloadLuggage(String weights) {
            Stack<Stack<Integer>> containers = new Stack<>(); // stack of stacks to hold all baggage
            String[] individualWeights = weights.split(","); // array of individual weights
            Stack<Integer> currentContainer = new Stack<>(); // container currently being filled
            int containerWeight = 0; // weight of current container

            for (String weight : individualWeights) {
                int luggageWeight = Integer.parseInt(weight);
                containerWeight += luggageWeight;

                if (containerWeight <= 40) {
                    currentContainer.push(luggageWeight);
                } else {
                    // if container is full, add it to the stack of containers
                    containers.push(currentContainer);
                    currentContainer = new Stack<>(); // reset current container
                    currentContainer.push(luggageWeight);
                    containerWeight = luggageWeight;
                }
            }
            // add remaining container to stack of containers
            containers.push(currentContainer);

            StringBuilder output = new StringBuilder(); // use StringBuilder to build output string
            while (!containers.isEmpty()) {
                Stack<Integer> container = containers.pop();
                while (!container.isEmpty()) {
                    output.append(container.pop());
                    if (!container.isEmpty() || !containers.isEmpty()) {
                        output.append(",");
                    }
                }
            }

            return output.toString();
        }

        public static void main(String[] args) {
            String weights = "30,5,6";
            System.out.println(unloadLuggage(weights));
        }
    }

