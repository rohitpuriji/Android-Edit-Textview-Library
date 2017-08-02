package com.tech.edittextviewlibrary.Enumerators;

/**
 * Created by rohitpuri on 2/8/17.
 */

public enum PasswordLength {
    four(4),
    five(5),
    Six(6),
    Seven(7),
    Eight(8),
    Nine(9),
    Ten(10),
    Eleven(11),
    Twelve(12);

    private int numVal;

    PasswordLength(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}
