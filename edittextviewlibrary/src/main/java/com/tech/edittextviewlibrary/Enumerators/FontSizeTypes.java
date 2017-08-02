package com.tech.edittextviewlibrary.Enumerators;

/**
 * Created by rohitpuri on 1/8/17.
 */

public enum FontSizeTypes {
    small(12),
    mid(15),
    large(17),
    xlarge(20),
    xxlarge(22);

    private int numVal;

    FontSizeTypes(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}
