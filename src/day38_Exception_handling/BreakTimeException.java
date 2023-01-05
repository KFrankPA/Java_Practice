package day38_Exception_handling;

public class BreakTimeException extends RuntimeException {

    public BreakTimeException(){
     super("It's break time");
    }

    public BreakTimeException(String message){
        super(message);
    }


}
