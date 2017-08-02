package com.tech.edittexttextviewcreator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tech.edittextviewlibrary.EdittextField;
import com.tech.edittextviewlibrary.Enumerators.FontSizeTypes;
import com.tech.edittextviewlibrary.Enumerators.FontTypes;
import com.tech.edittextviewlibrary.Enumerators.PasswordLength;
import com.tech.edittextviewlibrary.Enumerators.ValidationType;
import com.tech.edittextviewlibrary.TextViewField;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextViewField tvUsername = (TextViewField) findViewById(R.id.tvUsername);
        final EdittextField etEmail = (EdittextField) findViewById(R.id.etEmail);
        final EdittextField etPassword = (EdittextField) findViewById(R.id.etPassword);
        EdittextField etFirstName = (EdittextField)findViewById(R.id.etFirstName);
        EdittextField etUsername = (EdittextField)findViewById(R.id.etUsername);

        //you can set text by using setTextString Method.
        tvUsername.setTextString("Registration form");

/*        you can set text size by using setFontSize Method
          there are many sizes available :
          *
          *      small(12),
          *      mid(15),
          *      large(17),
          *      xlarge(20),
          *      xxlarge(22);
          *
          *      */

        tvUsername.setFontSize(FontSizeTypes.xxlarge);

        /*We have basic 8 types of font style with regular and bold format like :
        *
        *    arial,
        *    courier,
        *    georgia,
        *    helvetica,
        *    roboto,
        *    tahoma,
        *    times,
        *    verdana
        *
        * */
        tvUsername.setTextTypeFaceBold(FontTypes.georgia,this);

        //you can set text by using setEdittextHint Method.
        etEmail.setEdittextHint("Enter Email");
        etEmail.setTextTypeFaceNormal(FontTypes.georgia,MainActivity.this);
        etEmail.setFontSize(FontSizeTypes.xxlarge);

        /* We have basic 4 types of Field Validations like :
        *
        *       EmailType,
        *       PasswordType,
        *       OnlyAlphabetsType,
        *       AlphaNumericTypes,
        *       None
        *
        * */
        etEmail.setValidationType(ValidationType.EmailType,"Not a Valid email!");

        etPassword.setTextTypeFaceNormal(FontTypes.georgia,MainActivity.this);
        etPassword.setFontSize(FontSizeTypes.xxlarge);

        //you can set password length by using setValidationLength Method.
        etPassword.setValidationLength(PasswordLength.Six);

        /*
            you can set error message by passing second parameter as a message otherwise default message will show.

            etPassword.setValidationType(ValidationType.PasswordType,"Not a Valid password!");

        */
        etPassword.setValidationType(ValidationType.PasswordType,"");

        etFirstName.setTextTypeFaceNormal(FontTypes.georgia,MainActivity.this);
        etFirstName.setFontSize(FontSizeTypes.xxlarge);

//        you can set error message by passing second parameter as a message otherwise default message will show.
        etFirstName.setValidationType(ValidationType.OnlyAlphabetsType,"Only alphabets are allowed!");

        //you can set text color by using setTextStringcolor Method.
        etFirstName.setTextStringcolor(Color.BLUE);

        etFirstName.setEdittextHint("Enter Firstname :");

        etUsername.setTextTypeFaceNormal(FontTypes.tahoma,MainActivity.this);
        etUsername.setFontSize(FontSizeTypes.xlarge);
        etUsername.setValidationType(ValidationType.AlphaNumericTypes,"Only alphabets and numbers are allowed!");
        etUsername.setTextStringcolor(Color.BLACK);
        etUsername.setEdittextHint("Enter Username :");

        //you can set some background view or drawable xml by using setBackgroundView Method.

        Button btnCheck = (Button)findViewById(R.id.btnCheck);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //On submit you only need to check getError null if getError==null then field has valid entry.

                if (etEmail.getError() == null){
                    Toast.makeText(MainActivity.this,"etUsername valid entry",Toast.LENGTH_LONG).show();
                }

                if (etPassword.getError() != null){
                    Toast.makeText(MainActivity.this,"etPassword invalid entry",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
