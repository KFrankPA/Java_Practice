package day12_CustomMethods;

public class Salary {
    public static void main(String[] args) {

        salary(27.5, 40);

    }
    public static void salary(double hourlyRate, int weeklyHours){


        double totalGross= hourlyRate *weeklyHours;

        System.out.println(totalGross);

    }
}
