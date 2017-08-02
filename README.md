# EditTextviewLibrary

## This Library can be used to create Textview and Edittext efficiently , this library provides you 16 type of font styles, different type of validation on fields, types of text sizes and some default view like text color,text size, font style, type face etc. you can also change that properties by using Library methods.

Only you have to add jitpack in your root build.gradle : 	

	allprojects { 	
		repositories  	
		{ 	
			... 	
			maven { url 'https://jitpack.io' } 	
		} 	
	} 	
   
  and add the dependency in app.gradle : <br/>
  
  	dependencies {  
	        compile 'com.github.rohitpuriji:EditTextviewLibrary:-SNAPSHOT'
          }
  
    
  This library made with java8 so add the jack option inside defaultCondig in your app gradle file :<br/>
  
        minSdkVersion 16
        targetSdkVersion 25
        versionCode 1
        versionName "1.0"
        jackOptions {
            enabled true
        }
    
  
  and add compile ad dex options :
  
      dexOptions {
        incremental true
    }

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    
    
  ### You can create field in layout file like this :
  
  <?xml version="1.0" encoding="utf-8"?>
  <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
      xmlns:tools="http://schemas.android.com/tools"
      android:layout_width="match_parent"
      android:layout_height="match_parent"
      android:orientation="vertical"
      tools:context="com.tech.edittexttextviewcreator.MainActivity">

      <com.tech.edittextviewlibrary.TextViewField
          android:layout_width="match_parent"
          android:layout_margin="10dp"
          android:id="@+id/tvUsername"
          android:layout_height="wrap_content"/>


      <com.tech.edittextviewlibrary.EdittextField
          android:layout_width="match_parent"
          android:layout_margin="10dp"
          android:id="@+id/etFirstName"
          android:inputType="textPassword"
          android:layout_height="wrap_content"/>

      <com.tech.edittextviewlibrary.EdittextField
          android:layout_width="match_parent"
          android:layout_margin="10dp"
          android:id="@+id/etEmail"
          android:layout_height="wrap_content"/>


      <com.tech.edittextviewlibrary.EdittextField
          android:layout_width="match_parent"
          android:layout_margin="10dp"
          android:id="@+id/etUsername"
          android:inputType="textPassword"
          android:layout_height="wrap_content"/>

      <com.tech.edittextviewlibrary.EdittextField
          android:layout_width="match_parent"
          android:layout_margin="10dp"
          android:id="@+id/etPassword"
          android:inputType="textPassword"
          android:layout_height="wrap_content"/>

      <Button
          android:layout_width="wrap_content"
          android:text="Check"
          android:padding="10dp"
          android:id="@+id/btnCheck"
          android:layout_gravity="center"
          android:layout_height="wrap_content" />
  </LinearLayout>

### Then access Fields like this :

          TextViewField tvUsername = (TextViewField) findViewById(R.id.tvUsername);
          final EdittextField etEmail = (EdittextField) findViewById(R.id.etEmail);
          final EdittextField etPassword = (EdittextField) findViewById(R.id.etPassword);
          EdittextField etFirstName = (EdittextField)findViewById(R.id.etFirstName);
          EdittextField etUsername = (EdittextField)findViewById(R.id.etUsername);

### you can set text by using setTextString Method.

          tvUsername.setTextString("Registration form");  
          
          
### you can set text color by using setTextStringcolor Method otherwise default color will be GRAY.

          tvUsername.setTextStringcolor(Color.BLUE);
    
### you can set view background color by using setBgColor Method otherwise default color will be WHITE.

          tvUsername.setBgColor(Color.BLUE);

### you can set padding by using setTextPadding Method otherwise default padding will be 20dp.

          etFirstName.setTextPadding(10,10,10,10);
          
### We have basic 8 types of font style with regular and bold format like :
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
          * 
          tvUsername.setTextTypeFaceBold(FontTypes.georgia,this);
          etFirstName.setTextTypeFaceNormal(FontTypes.georgia,this);
          
### you can set text font size by using setFontSize Method
          there are many sizes available :
            *
            *      small(12),
            *      mid(15),
            *      large(17),
            *      xlarge(20),
            *      xxlarge(22);
            *
            *
          tvUsername.setFontSize(FontSizeTypes.xxlarge);
          
### you can set some background view or drawable xml by using setBackgroundView Method otherwise a default drawable xml will be use.

          etEmail.setBackgroundView(R.drawable.edittext_bg);
          
### Similarly you can set Edittext hint text,color.

### We have basic 4 types of Field Validations like :
          *
          *       EmailType,
          *       PasswordType,
          *       OnlyAlphabetsType,
          *       AlphaNumericTypes,
          *       None
          *
          etEmail.setValidationType(ValidationType.EmailType,"Not a Valid email!");
          
### you can set password length by using setValidationLength Method otherwise default length will be 6.

            etPassword.setValidationLength(PasswordLength.Five);
            
### you can set error message by passing second parameter as a message if empty then default message will show.

              etPassword.setValidationType(ValidationType.PasswordType,"");

        
## And on button click you can 

    Button btnCheck = (Button)findViewById(R.id.btnCheck);
            btnCheck.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                  //On submit you only need to check getError null if getError==null then field has valid entry.

                  if (etEmail.getError() == null && !TextUtils.isEmpty(etEmail.getText().toString()){
                      Toast.makeText(MainActivity.this,"etUsername valid entry",Toast.LENGTH_LONG).show();
                  }

                  if (etPassword.getError() != null && !TextUtils.isEmpty(etPassword.getText().toString()){
                      Toast.makeText(MainActivity.this,"etPassword invalid entry",Toast.LENGTH_LONG).show();
                  }

              }
          });
  ## For more information please check the code.
  
  # Developed By
   ## Rohit Puri

# License

Copyright  Rohit Puri
Copyright (C) 2011 The Android Open Source Project

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
  
  
