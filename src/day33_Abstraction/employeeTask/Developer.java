package day33_Abstraction.employeeTask;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int age, char gender, String jobTitle, double salary, String programmingLanguage) {
        super(name, age, gender, jobTitle, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding in " + programmingLanguage);
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", programming language='" + programmingLanguage + "}";
    }
}