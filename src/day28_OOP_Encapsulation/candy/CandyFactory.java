package day28_OOP_Encapsulation.candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {


    public String factoryName;
   public ArrayList<Candy> candies ;

    public CandyFactory(String factoryName) {
        this.factoryName = factoryName;
       candies = new ArrayList<>();
    }

    public void addCandies(Candy[] brands){
       candies.addAll(Arrays.asList(brands));

   }
    public void addCandy(Candy brand){
        candies.add(brand);

    }

    public String toString() {
        return "CandyFactory{" +
                "factoryName='" + factoryName + '\'' +
                ", candies=" + candies.size()  +
                '}';
    }
}
