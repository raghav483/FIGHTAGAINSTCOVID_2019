package com.gkmicro.fightagainstcovid_2019;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Impfacts5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.impfacts5);

        Button button180 = (Button)findViewById(R.id.button180);
        Button button182 = (Button)findViewById(R.id.button182);

        button180.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImpfacts4();

            }
        });
        button182.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImpfacts6();

            }
        });
    }
    public void openImpfacts4(){
        Intent intent = new Intent(this, Impfacts4.class);
        startActivity(intent);
    }


    public void openImpfacts6(){
        Intent intent = new Intent(this, Impfacts6.class);
        startActivity(intent);
    }

}
