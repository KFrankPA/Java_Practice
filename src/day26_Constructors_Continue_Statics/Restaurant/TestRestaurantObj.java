package day26_Constructors_Continue_Statics.Restaurant;

import java.time.LocalDate;
import java.util.Arrays;

public class TestRestaurantObj {
    public static void main(String[] args) {

        Chefs chf1 = new Chefs("Alex", 147, 17.75, true);
        Chefs chf2 = new Chefs("Andrea", 109, 17.75, true);
        Chefs chf3 = new Chefs("Ronaldo", 117, 17.75, true);
        Chefs chf4 = new Chefs("Messi", 27, 17.75, true);
        Chefs chf5 = new Chefs("Xenia", 47, 17.75, true);

        Servers server1 = new Servers("James", 39, 25.75, false, LocalDate.of(2021,8,10));
        Servers server2 = new Servers("Joe", 99, 25.75, false, LocalDate.of(2021,8,10));
        Servers server3 = new Servers("Jamie", 89, 25.75, false, LocalDate.of(2021,8,10));
        Servers server4 = new Servers("Julia", 69, 25.75, false, LocalDate.of(2021,8,10));

        Chefs [] arr = {chf1, chf2, chf3, chf4, chf5};
        Servers [] servers = {server1, server2, server3, server4};

        Restaurant1 olive = new Restaurant1("James", "Dallas", 5);
        olive.hireServer(server1);
        olive.hireServer(servers);
        olive.hireChief(arr);
        System.out.println(olive);
        System.out.println(chf1.name + " " + chf1.hourlyRate);
        System.out.println(Arrays.toString(servers));

        olive.terminateServer(109);
    }
}
