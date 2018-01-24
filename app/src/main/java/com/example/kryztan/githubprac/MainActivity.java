package com.example.kryztan.githubprac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //resolve conflicts
    }

    public void someMethod() {
        int someInt = 1;
        boolean someBoolean = false;
    }
}
