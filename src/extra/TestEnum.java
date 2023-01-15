package extra;

public class TestEnum {

    public static void main(String[] args) {

        Day day = Day.TUESDAY;

        System.out.println(day);

        switch(day){
            case MONDAY:
                System.out.println("Its Monday");
                break;
            case TUESDAY:
                System.out.println("Its " + day);
        }


    }
}
