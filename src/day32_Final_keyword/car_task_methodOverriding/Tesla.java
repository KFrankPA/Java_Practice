package day32_Final_keyword.car_task_methodOverriding;

import day19_Arrays.ArraysLiterals;
import day23_ArrayListContinue.ArrayArrayListConvertion;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }
    public void autoPilot(){
        System.out.println(getMake() + " " + getModel() + " is in self drive mode");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " starts with voice command");
    }

    @Override
    public void setModel(String model) {
   /*   String[] models ={"Model S", "Model Y", "Model x", "Model 3"};

      if(!Arrays.asList(models).contains(model)){ // if model is not valid, converting to collection
          System.err.println("Invalid Tesla model: " + model);
          System.exit(1);
      }*/
        ArrayList<String> models = new ArrayList<>();
       models.addAll(Arrays.asList("Model S", "Model Y", "Model x", "Model 3"));
       if(!models.contains(model)){
           System.err.println("Invalid Tesla model: " + model);
           System.exit(1);
       }
      super.setModel(model);

    }

    @Override
    public void setColor(String color) {
        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("White", "Black", "Red", "Silver", "Brown", "Green"));
        if(!colors.contains(color)){
            System.err.println("Invalid Tesla color: " + color);
            System.exit(1);
        }
        super.setColor(color);
    }

    @Override
    public void setPrice(double price) {
        if(price < 40000){
            System.err.println("Invalid Tesla price: " + price);
            System.exit(1);
        }
        super.setPrice(price);
    }
}
