package com.gkmicro.fightagainstcovid_2019;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdPage extends AppCompatActivity {
    private Button button87;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdpage);

        button87 = findViewById(R.id.button87);
        button87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondPage();
            }
        });

    }
    public void openSecondPage(){

        Intent intent= new Intent(this, SecondPage.class);
        startActivity(intent);

    }
}
