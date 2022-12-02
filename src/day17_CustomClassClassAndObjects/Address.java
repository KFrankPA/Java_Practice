package day17_CustomClassClassAndObjects;

public class Address {

    public String buildingNum;
    public String street;
    public String city;
    public String State;
    public int zipCode;

    public void setInfo(String buildingNum, String street, String city, String state, int zipCode) {
        this.buildingNum = buildingNum;
        this.street = street;
        this.city = city;
        State = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Address{" +
                "buildingNum='" + buildingNum + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", State='" + State + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

    /*
    Create a class named Address
        Attributes:
            buildingNumber, street, city, state, zipCode

        Actions
                setInfo: sets all the instances
                toString: returns the address
                            EX:
                                7925 Jones Branch Dr
                                McLean Va, 22012
    */
    public static void main(String[] args) {

        Address home1 = new Address();

        home1.setInfo("7925", "Jones Branch Dr", "Mclean", "VA", 22012);
        System.out.println(home1);

    }
}