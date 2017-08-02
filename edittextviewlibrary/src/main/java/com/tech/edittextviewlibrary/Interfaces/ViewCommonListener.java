package com.tech.edittextviewlibrary.Interfaces;

import android.content.Context;

import com.tech.edittextviewlibrary.Enumerators.FontSizeTypes;
import com.tech.edittextviewlibrary.Enumerators.FontTypes;

public interface ViewCommonListener {
    void setTextString(String aText);
    void setBgColor(int aColorId);
    void setTextStringcolor(int aColorId);
    void setTextPadding(int l, int r, int t, int b);
    void setTextTypeFaceNormal(FontTypes aFontType, Context aContext);
    void setTextTypeFaceBold(FontTypes aFontType, Context aContext);
    void setFontSize(FontSizeTypes aFontSizeTypes);
    void setBackgroundView(int aViewId);

}
