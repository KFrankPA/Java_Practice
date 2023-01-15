package replits;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        String[] input = {"race", "car", "care", "house"};
        HashMap<String, String> anagrams = new HashMap<>();

        for (String each : input) {
            char[] chars = each.toCharArray();
            Arrays.sort(chars);
            String sortedeach = new String(chars);

            if (anagrams.containsKey(sortedeach)) {
                anagrams.put(sortedeach, anagrams.get(sortedeach) + " " + each);
            } else {
                anagrams.put(sortedeach, each);
            }
        }

        for (String anagram : anagrams.values()) {
            System.out.println(anagram);
        }
    }
}

