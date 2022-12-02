package day16_DoWhileLoop;
import java.util.Locale;
import java.util.Scanner;
public class replit {
    public static void main(String[] args) {
int num = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello" + (num++));
            for (int j = 0; j < 5; j++) {
                System.out.println("hey" + (num++));

            }
        }



    }
}





       /* String email = s.next();

        //WRITE YOUR CODE BELOW

        String fName = email.substring(0, email.indexOf('_'));
        fName = fName.substring(0,1).toUpperCase() + fName.substring(1).toLowerCase();

        String lName = email.substring(email.indexOf('_')+1, email.indexOf('@'));
        lName = lName.substring(0,1).toUpperCase() + lName.substring(1).toLowerCase();

        String domain = email.substring(email.indexOf('@')+1, email.indexOf('.'));
        domain = domain.substring(0,1).toUpperCase() + domain.substring(1).toLowerCase();

        System.out.println(fName  + " " + lName);

    }
}
//fahajun_kalonov@gmail.com

        */