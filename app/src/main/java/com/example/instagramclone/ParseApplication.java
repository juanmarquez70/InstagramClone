package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LlEphDvDACJ6RTiKtPrFAZYFfWWKIaXMZI2qTCDO")
                .clientKey("Hm4L6Y19eNM6KV6JR3oS4DHLRYAj0pqzRTJ5IUj6")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
