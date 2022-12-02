package day08_ternary_switch;

public class CydeoBatches {
    public static void main(String[] args) {

        String Batch = "EUs";
        String cydeoClass = "";

        if (Batch == "US morning") {
            cydeoClass = "US Class times are 10-5 EST. M, T, Th, F.";
        }
        if (Batch == "US evening") {
            cydeoClass = " Class times are 7-10 EST. M, T, W, Th, S, S.";
        }
        if (Batch == "EU") {
            cydeoClass = " Class times are 10-5 EST. M, T, W, Th, F.";
        }
        if (Batch != "EU" && Batch != "US morning" && Batch != "US evening") {

            cydeoClass ="Invalid Batch";
        }
        System.out.println(cydeoClass);

        System.out.println("==============================================");

        switch (Batch){
            case "US morning":
                System.out.println("US Class times are 10-5 EST. M, T, Th, F.");
                break;
            case "EU":
                System.out.println(" Class times are 10-5 EST. M, T, W, Th, F.");
                break;
            case "US evening" :
                System.out.println(" Class times are 7-10 EST. M, T, W, Th, S, S.");
                break;
            default:
                System.out.println( "Invalid Batch");
        }

        System.out.println("==============================================");

        if (Batch == "EU" || Batch == "US morning" || Batch == "US evening"){
            switch (Batch) {
                case "US morning":
                    System.out.println("US Class times are 10-5 EST. M, T, Th, F.");
                    break;
                case "EU":
                    System.out.println(" Class times are 10-5 EST. M, T, W, Th, F.");
                    break;
                default:

                    System.out.println(" Class times are 7-10 EST. M, T, W, Th, S, S.");
            }
            }else{
            System.out.println("Invalid Batch");

        }


    }
}

/*
10. Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */