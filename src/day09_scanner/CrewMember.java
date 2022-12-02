package day09_scanner;

public class CrewMember {

    public static void main(String[] args) {

        int number = 1008;

        String result = (number == 50 || number == 75 || number == 100) ?
                (number == 50) ? "20 crew, 30 passengers"

                      :  (number == 75) ? "25 crew, 50 passengers"

                          :      "30 crew, 70 passengers" :

                "Invalid";
        System.out.println(result);

    }

}

/*
Create a class called CrewAndPassenger, Given a number of people on the ship (int number),
determine how many need to be crew members and how many can be passengers.
 Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT


 */