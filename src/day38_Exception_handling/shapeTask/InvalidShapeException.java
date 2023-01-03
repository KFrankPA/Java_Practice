package day38_Exception_handling.shapeTask;

public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException(String message){
        super(message);

    }

    public InvalidShapeException(){
        super("Yoooo Happy NEw YEar");
    }


}
