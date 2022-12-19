package day33_Abstraction.cydeoStudent;

import day32_Final_keyword.person.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {

    private final String id;
    private String batchName;
    private int batchNumber;

    @Override
    public void eat() {
        super.eat();
        System.out.println("also eating plow");
    }

    private final static String programmingLanguage;


    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);
        if(getAge() < 18) { // if the age is less than 18
            System.err.println("Cydeo Developer must be at least 18 years old");
            System.exit(1);
        }
        this.id = id;
      setBatchName(batchName);
      setBatchNumber(batchNumber);

    }

    static {
        programmingLanguage = "Java";
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchName(String batchName) {
        if(batchName.equalsIgnoreCase("Zero to Hero")|| batchName.equalsIgnoreCase("Alumni Dev")){
            this.batchName = batchName;
        }else{
            System.err.println("Invalid batch name");
            System.exit(1);
        }


    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber <= 0){
            System.err.println("Invalid batch number: " + batchNumber + "\nBatch number can not be negative or zero");
       System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public String toString() { // or just copy from parent class and add the subclasses instances, and don't forget to delete super in that case
        return super.toString().replace("}", "") +
                ", id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}
/*
1. Create a subclass of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)
			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative
			Override the eat() & drink() methods and include the programmingLanguage variable in methods body
			Override the toString Method and include the id, batchName, batchNumber variables
 */