package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        LinearLayout rootView = findViewById(R.id.root_view);
        TextView wordView = new TextView(this);
        wordView.setText(words.get(0));
        rootView.addView(wordView);

        TextView wordView1 = new TextView(this);
        wordView1.setText(words.get(1));
        rootView.addView(wordView1);

        TextView wordView2 = new TextView(this);
        wordView2.setText(words.get(2));
        rootView.addView(wordView2);
    }
}
