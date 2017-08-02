package com.tech.edittextviewlibrary.Interfaces;

import com.tech.edittextviewlibrary.Enumerators.PasswordLength;
import com.tech.edittextviewlibrary.Enumerators.ValidationType;

/**
 * Created by rohitpuri on 2/8/17.
 */

public interface EdittextSpecificListener {
    void setEdittextHint(String aHintText);
    void setEdittextHintColor(int aColorId);
    void setValidationType(ValidationType aValidationType,String aErrorMessage);
    void setValidationLength(PasswordLength aPasswordLength);
}
