package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");
        map.put("A04", "Tatiana");
        map.put("A05", "Tatiana");
        map.put("A06", "Tatiana");
        map.put("A07", "Tatiana");

        System.out.println(map);
        System.out.println("map size = " + map.size());
        System.out.println(map.get("A05"));

        map.put("A05", "Anjella");

        System.out.println(map.get("A05"));
        System.out.println(map);

        map.replace("A07", "Julia");
        System.out.println(map);

        map.remove("A02");
        System.out.println(map);

        System.out.println( map.containsKey("A03") );
        System.out.println( map.containsKey("H78") );

        System.out.println(map.containsValue("Julia"));
        System.out.println(map.containsValue("Vasya"));

        System.out.println(map.isEmpty());
        System.out.println(map.equals(map));
        map.clear();
        System.out.println(map);





    }
}
/*
pair:id - name
 */