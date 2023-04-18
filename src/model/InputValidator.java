package model;

import model.exceptions.ExtraDataException;
import model.exceptions.NotEnoughDataException;
import model.exceptions.WrongDateException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class InputValidator {
    public boolean validateInput(String str) throws ExtraDataException, NotEnoughDataException, WrongDateException {
        String[] strArray = str.split(" ");
        if (strArray.length > 6) {
            throw new ExtraDataException("Extra data entered");
        } else if (strArray.length < 6) {
            throw new NotEnoughDataException("Insufficient data entered");
        }
        if (!validateDate(strArray[3])) {
            throw new WrongDateException("Wrong date entered");
        }
        return true;
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
