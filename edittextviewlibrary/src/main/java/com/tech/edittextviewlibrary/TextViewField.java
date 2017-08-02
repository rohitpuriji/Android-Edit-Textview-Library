package com.tech.edittextviewlibrary;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.TypedValue;

import com.tech.edittextviewlibrary.Enumerators.FontSizeTypes;
import com.tech.edittextviewlibrary.Enumerators.FontTypes;
import com.tech.edittextviewlibrary.Interfaces.ViewCommonListener;


/**
 * Created by rohitpuri on 1/8/17.
 */

public class TextViewField extends AppCompatTextView implements ViewCommonListener {

    public TextViewField(Context context) {
        super(context);
        init();
    }
    public TextViewField(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextViewField(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        setTextStringcolor(Color.BLACK);
        setTextPadding(20,20,20,20);
        setFontSize(FontSizeTypes.mid);
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

}
