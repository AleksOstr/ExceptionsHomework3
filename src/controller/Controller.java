package controller;

import model.DataSaver;
import model.StringParser;
import model.exceptions.*;

public class Controller {
    private StringParser stringParser;
    private DataSaver dataSaver;

    public Controller(StringParser stringParser, DataSaver dataSaver) {
        this.stringParser = stringParser;
        this.dataSaver = dataSaver;
    }

    public void saveData(String input) throws InvalidCharactersException, WrongDateException,
            InvalidGenderException, ExtraDataException, NotEnoughDataException {
        dataSaver.saveData(stringParser.parseString(input));
    }
}
