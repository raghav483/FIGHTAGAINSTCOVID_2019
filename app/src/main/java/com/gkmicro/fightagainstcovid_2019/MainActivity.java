package com.gkmicro.fightagainstcovid_2019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button9 = (Button) findViewById(R.id.button9);
        Button button10 = (Button) findViewById(R.id.button10);
        Button button11 = (Button) findViewById(R.id.button11);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openquestionnaire();

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSuggestions();


            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImpfacts();

            }
        });


    }

    public void openquestionnaire() {
        Intent intent = new Intent(this, questionnaire.class);
        startActivity(intent);
    }


    public void openSuggestions() {
        Intent intent = new Intent(this, Suggestions.class);
        startActivity(intent);
    }

    public void openImpfacts() {
        Intent intent = new Intent(this, Impfacts.class);
        startActivity(intent);
    }
}