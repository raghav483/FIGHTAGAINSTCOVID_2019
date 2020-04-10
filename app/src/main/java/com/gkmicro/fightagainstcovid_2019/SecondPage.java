package com.gkmicro.fightagainstcovid_2019;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage);

        Button button90 = (Button)findViewById(R.id.button90);
        Button button91 = (Button)findViewById(R.id.button91);

        button90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFirstPage();

            }
        });
        button91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThirdPage();

            }
        });
    }
    public void openFirstPage(){
        Intent intent = new Intent(this, FirstPage.class);
        startActivity(intent);
    }


    public void openThirdPage(){
        Intent intent = new Intent(this, ThirdPage.class);
        startActivity(intent);
    }

    }


