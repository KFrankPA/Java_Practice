package replits;
import java.util.*;
public class combine {

        public static ArrayList<String> combine(String[] r1, String[] r2){

            // your code here
            ArrayList <String> str = new ArrayList<>();

            for (String each : r1) {
                str.add(each);

            }
            for (String each : r2) {
                str.add(each);
            }


            // str.addAll(Arrays.asList(r1));
            // str.addAll(Arrays.asList(r2));





            return str;


        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String [] strs = new String[in.nextInt()];
            String [] strs2 = new String[in.nextInt()];
            for(int i=0; i < strs.length; i++) {
                strs[i] = in.next();
            }
            for(int i=0; i < strs2.length; i++) {
                strs2[i] = in.next();
            }

            System.out.println(combine(strs,strs2));

        }

    }

