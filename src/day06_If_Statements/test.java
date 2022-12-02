package day06_If_Statements;

public class test {
    public static void main(String[] args) {
        String firstName = "Noah";
        String lastName = "Smith";
        String companyName = "Apple";
        int salary = 200_000;
        int startDay = 10;
        int startMonth = 1;
        int startYear = 2022;
        boolean fullTime = true;
        String jobTitle = "SDET";
        String officeAdress = "One Apple Park Way, Cupertino, CA 95014";
        String fullName = firstName + " " + lastName;
        int fullStartDate = startMonth + startDay + startYear;
        String email = firstName + startDay + "@" + companyName + ".com";
        double salaryAfter2Years = (salary + (salary * 0.15));
        int salary2 = (int) salaryAfter2Years;

        System.out.println("Employee Information");
        System.out.println("We have " + fullName + " joining " + companyName);
        System.out.println(firstName + " will start on " + startMonth + "/" + startDay + "/" + startYear + " as full time: " + fullTime);
        System.out.println(firstName + " here is some information about your employment");
        System.out.println("Your email is " + firstName + startDay + "@" + companyName + ".com");
        System.out.println("Your base salary is " + "$" + salary + " and after 2 years it will be " + "$" + salary2);
        System.out.println("Welcome aboard, see you at " + officeAdress);
    }
}