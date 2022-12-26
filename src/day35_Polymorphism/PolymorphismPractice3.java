package day35_Polymorphism;

import day33_Abstraction.employeeTask.*;
import day34_Absrtaction_Continue.car.Tesla;

public class PolymorphismPractice3 {
    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Hamza", 32, 'M', "QA", 110000),
                new Developer("Lucy", 27, 'F', "Developer", 128000, "Java"),
                new Tester("George", 28, 'M', "QA", 120000),
                new Developer("Yulia", 23, 'F', "Developer", 135000, "Python"),
                new Tester("Cihad", 30, 'M', "QA", 105000),
                new Developer("Gulistan", 26, 'F', "Developer", 130000, "Python"),
                new Tester("Nora", 28, 'F', "QA", 120000),
                new Driver("Aaron", 48, 'M', "uber driver", 90000),
                new Developer("Diana", 29, 'F', "Developer", 140000, "C#"),
                new Tester("Tatiana", 25, 'F', "QA", 130000),
                new Developer("Alena", 26, 'F', "Developer", 150000, "Java")};




        for (Employee each : employees) {
            System.out.println(each.getName() + " : " + each.getJobTitle());
        }
        int developers = 0,
                testers = 0,
                drivers=0;
        for (Employee each : employees) {
            if(each instanceof Developer){
                developers++;
            }else if(each instanceof Tester){
                testers ++;
            }else{
                drivers ++;
            }

        }
        System.out.println("Number of Devs " + developers);
        System.out.println("Number of Testers " + testers);
        System.out.println("Number of Drivers " + drivers);

        for (Employee each : employees) {
            if(! (each instanceof Developer)){
                System.out.println(each.getName());
            }

        }


    }
    }





