package day19_Arrays;

public class item {
    public static void main(String[] args) {
        String[] items  = {"Gloves", "Shoes", "Jacket",  "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        String itemList = "";
        boolean iPad = false;
        int idNum = 0;
        double price = 0;
        int indexOFGLoves = 0;
        String report = "";

        for (int i = 0; i < items.length; i++) {
            itemList = items[i];
            idNum = itemIDs[i];
            price =  prices[i];

            if(itemList.equals("Gloves")){
                indexOFGLoves = i;
            }

            if(itemList.equals("iPad")){
                iPad = true;
            }

            report+= itemList + " - " + price + " - #" + idNum + "\n";


        }
        System.out.println("Index num of Gloves " + indexOFGLoves);
        System.out.println("has iPad " + iPad);
        System.out.println(report);



    }
}
/*
 Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID

 */