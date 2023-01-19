package extra;

import java.util.Arrays;

public class TestEnum {

    public static void main(String[] args) {

        Day_ENUM day = Day_ENUM.TUESDAY;
        Day_ENUM day2 = Day_ENUM.WEDNESDAY;

        System.out.println(day);

        switch(day){
            case MONDAY:
                System.out.println("Its Monday");
                break;
            case TUESDAY:
                System.out.println("Its " + day);
        }

        Day_ENUM[] weekdays = Day_ENUM.values();

        System.out.println(Arrays.toString(weekdays));

    }
}
