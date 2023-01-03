package day38_Exception_handling;

class CustomCheckedException extends Exception {

}

class CustomUncheckedExceptions extends RuntimeException {

}

public class CustomExceptions {

    public static void main(String[] args) {

        try {
            throw new CustomCheckedException();
        }catch (CustomCheckedException e){
            e.printStackTrace();
        }
        System.out.println("==========-----------=================");

        throw new CustomUncheckedExceptions();

    }

}
