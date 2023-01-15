package day42_MAPs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MAP_practice1 {
    public static void main(String[] args) {


        Map<String, String> employeeMap = new LinkedHashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("---------------------------------------------");
        int females = 0;
        int males = 0;
        for (Map.Entry<String, String> each : employeeMap.entrySet()){

            if(each.getValue().equals("F")){
                females ++ ;
            }else{
                males ++;
            }
        }
        System.out.println("males = " + males);
        System.out.println("females = " + females);

        System.out.println("--------------------------");
int m = 0;
int f = 0;
        for (String each : employeeMap.keySet()) {

            if(employeeMap.get(each).equals("F")){
                f ++;
                System.out.println(each);
            }else{
                m ++;
               // System.out.println(each);
            }

        }
        System.out.println("m = " + m);
        System.out.println("f = " + f);

        System.out.println("--------------------");

        int ma = 0;
        int fe = 0;
      for(String each3 : employeeMap.values()){

          if (each3.equals("F")){
              fe ++ ;
          }else{
              ma ++ ;
          }

      }
        System.out.println("ma = " + ma);
        System.out.println("fe = " + fe);

        System.out.println("-------------------------");

        for(Map.Entry<String, String> eachName : employeeMap.entrySet()){

            if(eachName.getValue().equals("F")){
                System.out.println(eachName.getKey());
            }

        }

        System.out.println("_____________update M to F________F to Fermale_______");

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {

            if(eachEntry.getValue().equals("F")){
                eachEntry.setValue("Female");
            }else{
                eachEntry.setValue("F");
            }

        }
        System.out.println(employeeMap);


    }
}
