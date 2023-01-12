package day41_maps;

import java.util.*;

public class test55 {

        public static void main(String[] args) {
            String text = "Please use this phone to call me. Please use this phone to call me.";
            int k = 2;

            //  sozdaem hashmap dly hraneniya frequency
            HashMap<String, Integer> wordCount = new HashMap<>();

            // delim text na slova
            String[] words = text.split("\\W+");

            //chistota kajdogo slovo
            for (String word : words) {
                word = word.toLowerCase();
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }

            // sozdaem list dlya entry set
            List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());

            //sortiruem list po chastote
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });

            // Print the top k frequently occurring words
            for (int i = 0; i < k; i++) {
                System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
            }
        }
    }

