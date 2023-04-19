package model;

import model.exceptions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class InputValidator {
    public boolean validate(String str) {
        // FIXME: 19.04.2023
    }

    private boolean validateDataCount(String[] strArray) throws NotEnoughDataException, ExtraDataException {
        if (strArray.length > 6) {
            throw new ExtraDataException("Extra data was entered");
        } else if (strArray.length < 6) {
            throw new NotEnoughDataException("Insufficient data was entered");
        } else return true;
    }

    private boolean validateName(String str) {
        return str.matches("[a-z]+");
    }

    private boolean validateGender(String str) {
        return str.equals("f") || str.equals("m");
    }

    private boolean validateDate(String strDate) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        format.setLenient(false);
        try {
            Date inputDate = format.parse(strDate);
            if (inputDate.after(new Date())) {
                return false;
            }
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
