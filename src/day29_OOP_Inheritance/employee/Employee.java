package day29_OOP_Inheritance.employee;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private String ID;
    private String jobTitle;
    private double salary;


    public void setInfo(String name, char gender, int age, String ID, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    public String getName(){
        return name;
    }
    public void setName(String name){

    }

    public  char getGender(){
        return gender;
    }
    public void setGender(char gender){
        if(gender != 'F' || gender != 'M'){
            System.err.println("Invalid gender entry: " +  gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age < 0){
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }else if(age < 18 || age > 65){
            System.err.println("Age must be between 18 - 65: " + age);
            System.exit(1);
        }
        this.age = age;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        if(salary < 0){
            System.err.println("Invalid salary: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
/*
employeeTask:
	1. Create a custom Class named Tester
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 and 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				testing()
				toString(): prints tester object info when the object is passed in the print statement

 */