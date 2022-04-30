package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
/*
How to add splash Screen :-
Steps 1. right click on package name of MainActivity., look like com.example.splashscreen right click on it.
         create a new Activity com.example.splashscreen->new->Activity->Empty Activity give name to the activity here i given SplashScreen as a name.
         it will generate two file. 1st is .java and 2nd is .xml

      2. In .java file add this code
         //from here
        Thread splash = new Thread() {
            public void run() {
                try {
                    sleep(2 * 1000);
                    Intent intent = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        };
        splash.start();
         //to here

       3. In .xml file add and design any widget or anything what you want in your Splash Screen while opening app.

       4. In Manifest File add this code
           <activity
            android:name=".SplashScreen"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
 */