package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        NumbersClickListener clickListener = new NumbersClickListener();

        TextView numbers = findViewById(R.id.numbers);

        numbers.setOnClickListener(clickListener);
    }

}
