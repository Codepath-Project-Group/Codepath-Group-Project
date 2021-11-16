package com.example.ncatmap2.ui.notes;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
       ParseObject.registerSubclass(Note.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("5jDgwePkKNP26O6iUHiqVd91W7ZB6lOAdOkfFJqZ")
                .clientKey("hGmNEHeOH50EdFx1rMJKFmlpilT7Sjbltn4nzQpE")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
