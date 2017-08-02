package com.tech.edittextviewlibrary;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;

import com.tech.edittextviewlibrary.Enumerators.FontSizeTypes;
import com.tech.edittextviewlibrary.Enumerators.FontTypes;
import com.tech.edittextviewlibrary.Enumerators.PasswordLength;
import com.tech.edittextviewlibrary.Enumerators.ValidationType;
import com.tech.edittextviewlibrary.Interfaces.EdittextSpecificListener;
import com.tech.edittextviewlibrary.Interfaces.ViewCommonListener;

import static com.tech.edittextviewlibrary.Utils.isValidAlphaNumeric;
import static com.tech.edittextviewlibrary.Utils.isValidAlphbets;
import static com.tech.edittextviewlibrary.Utils.isValidEmail;
import static com.tech.edittextviewlibrary.Utils.isValidPassword;

/**
 * Created by rohitpuri on 1/8/17.
 */

public class EdittextField extends AppCompatEditText implements ViewCommonListener,EdittextSpecificListener, TextWatcher {

    private String mValidationType;
    private int mPasswordLength;
    private String mValidationMessage;

    public EdittextField(Context context) {
        super(context);
        init();

    }

    public EdittextField(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EdittextField(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        setBgColor(Color.WHITE);
        setTextStringcolor(Color.GRAY);
        setTextPadding(20,20,20,20);
        setEdittextHintColor(Color.LTGRAY);
        setFontSize(FontSizeTypes.mid);
        setBackgroundView(R.drawable.edittext_bg);
        mValidationType =ValidationType.None.toString();
        setValidationLength(PasswordLength.Eight);
    }

    @Override
    public void setTextString(String aText) {
        setText(aText);

    }

    @Override
    public void setBgColor(int colorId) {
        setBackgroundColor(colorId);

    }

    @Override
    public void setTextStringcolor(int colorId) {
        setTextColor(colorId);

    }

    @Override
    public void setTextPadding(int l, int r, int t, int b) {
        setPadding(l,t,r,b);
    }


    @Override
    public void setEdittextHint(String aHintText) {
        setHint(aHintText);
    }

    @Override
    public void setEdittextHintColor(int aColorId) {
        setHintTextColor(aColorId);
    }


    @Override
    public void setTextTypeFaceNormal(FontTypes aFontType, Context aContext) {
        Typeface type = Typeface.createFromAsset(aContext.getAssets(),"fonts/"+aFontType+"-normal.ttf");
        setTypeface(type);
    }

    @Override
    public void setTextTypeFaceBold(FontTypes aFontType, Context aContext) {
        Typeface type = Typeface.createFromAsset(aContext.getAssets(),"fonts/"+aFontType+"-bold.ttf");
        setTypeface(type);
    }

    @Override
    public void setFontSize(FontSizeTypes aFontSizeTypes) {
        setTextSize(TypedValue.COMPLEX_UNIT_SP,aFontSizeTypes.getNumVal());

    }

    @Override
    public void setBackgroundView(int aViewId) {
        setBackgroundResource(aViewId);
    }

    @Override
    public void setValidationType(ValidationType aValidationType,String aErrorMessage) {
        mValidationType = aValidationType.toString();
        mValidationMessage = aErrorMessage;
    }

    @Override
    public void setValidationLength(PasswordLength aPasswordLength) {
        mPasswordLength = aPasswordLength.getNumVal();
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        Log.e("onTextChanged :",mValidationType+" type");
        if (mValidationType != null) {
            switch (mValidationType) {

                case "EmailType":
                    if (!isValidEmail(getText().toString())) {
                        if (mValidationMessage.isEmpty()){
                            setError(Utils.mEmailError);
                        }else {
                            setError(mValidationMessage);
                        }
                    }
                    break;

                case "PasswordType":
                    if(getText().toString().length()<mPasswordLength &&!isValidPassword(getText().toString())){
                        if (mValidationMessage.isEmpty()){
                            setError(Utils.setErrorMessage(mPasswordLength));
                        }else {
                            setError(mValidationMessage);
                        }
                    }
                    break;

                case "OnlyAlphabetsType":
                    if (!isValidAlphbets(getText().toString())){
                        if (mValidationMessage.isEmpty()){
                            setError(Utils.mAlphaError);
                        }else {
                            setError(mValidationMessage);
                        }
                    }
                    break;

                case "AlphaNumericTypes":
                    if (!isValidAlphaNumeric(getText().toString())){
                        if (mValidationMessage.isEmpty()){
                            setError(Utils.mAlphaNumericError);
                        }else {
                            setError(mValidationMessage);
                        }
                    }
                    break;

                default:

                    break;

            }
        }
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }

}
