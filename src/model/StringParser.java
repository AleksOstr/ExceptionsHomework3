package model;

import model.exceptions.*;

public class StringParser {
    private final InputValidator inputValidator = new InputValidator();

    public String[] parseString(String inputString) throws InvalidCharactersException,
            WrongDateException, InvalidGenderException, ExtraDataException, NotEnoughDataException,
            IllegalArgumentException {
        if (inputValidator.validate(inputString)) {
            return inputString.split(" ");
        } else throw new IllegalArgumentException("Invalid data was entered");
    }

}
