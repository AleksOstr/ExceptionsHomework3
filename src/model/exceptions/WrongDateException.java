package model.exceptions;

public class WrongDateException extends IllegalArgumentException{
    public WrongDateException(String message) {
        super(message);
    }
}
