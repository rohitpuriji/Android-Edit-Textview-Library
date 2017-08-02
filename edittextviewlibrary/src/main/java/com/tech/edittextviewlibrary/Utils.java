package com.tech.edittextviewlibrary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rohitpuri on 1/8/17.
 */

class Utils {


    static String mEmailError = "Type valid email !";
    static String mAlphaError = "Only Alphabets are allowed.";
    static String mAlphaNumericError = "Special character are not allowed.";

    static String setErrorMessage(int aLength){
        return "Type valid password, Minimum "+aLength + " length required !";
    }

    static boolean isValidEmail(String target) {
        return target != null && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }

    static boolean isValidPassword(final String password) {
        Pattern pattern;
        Matcher matcher;
        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{4,}$";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }

    static boolean isValidAlphbets(final String aString){
        Pattern ps = Pattern.compile("^[a-zA-Z ]+$");
        Matcher ms = ps.matcher(aString);
        boolean bs = ms.matches();
        return bs != false;
    }

    static boolean isValidAlphaNumeric(final String aString){
        Pattern ps = Pattern.compile("^[a-zA-Z 0-9]+$");
        Matcher ms = ps.matcher(aString);
        boolean bs = ms.matches();
        return bs != false;
    }

}
