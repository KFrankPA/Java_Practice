package day36_Polymorphism_practice;

import day30_OOP_inheritance.phones.*;

import day30_OOP_inheritance.phones.Phone;


public class PolymorphismPractice {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {



        Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new IPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new IPhone("Iphone 6", "Smalle", "Gold", 400),
                new IPhone("Iphone 7", "Smalle", "White", 500)
        };
        System.out.println("==================================");



        for (Phone each : phones) {
            System.out.println(each.getModel() + " - " + each.getColor() + " - " + each.getPrice());
        }

        int iphoneCount = 0;
        int samsungCount = 0;


        for (Phone each : phones) {
            if(each instanceof IPhone){
                iphoneCount ++;
            }else if(each instanceof Samsung){
                samsungCount ++;
            }

        }
        System.out.println("samsungCount = " + samsungCount);
        System.out.println("iphoneCount = " + iphoneCount);

        System.out.println("===================================");

        for (Phone each : phones) {

            if(each instanceof IPhone || each instanceof Samsung) {
                if (each.getPrice() >= 700) {
                    System.out.println(each.getBrand() + " - " + each.getModel() + " - " + each.getPrice());
                }
            }
        }

    }
}
