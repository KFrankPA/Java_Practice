package day18_GarbageCollection;

public class Contact {

    public String name;
    public int phoneNum;
    public String email;

    public void Call(){
        System.out.println("Calling " + name + " now");

    }
    public void sendMsg(){
        System.out.println("sending message to " + phoneNum + " now");
    }
    public void sendEmail(){
        System.out.println("sending email to " + email + " now");
    }
    public void setInfo(String name, int phoneNum, String email){
       this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String toString() {
        return "Contact{" +
        "name " + name + '\'' +
                "Phone Num " + phoneNum + '\'' +
                "Email " + email +
    '}';

    }

    public static void main(String[] args) {

    Contact person1 = new Contact();
    person1.setInfo("Mike", 717555000, "cydeo@gmail.com");
        System.out.println(person1);

    }

}
/*
Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email

		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"

 */