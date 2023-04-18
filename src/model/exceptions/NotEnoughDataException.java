package model.exceptions;

public class NotEnoughDataException extends IllegalArgumentException{
    public NotEnoughDataException(String message) {
        super(message);
    }
}
