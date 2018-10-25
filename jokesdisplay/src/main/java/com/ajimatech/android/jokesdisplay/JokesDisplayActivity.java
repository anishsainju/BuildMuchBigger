package com.ajimatech.android.jokesdisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesDisplayActivity extends AppCompatActivity {

    public static final String JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokesdisplay);
        Intent intent = getIntent();

        if(intent != null){
            TextView jokeTextView = (TextView) findViewById(R.id.joke_text2);
            jokeTextView.setText(intent.getStringExtra(getString(R.string.jokeIntentId)));
        }
    }
}
