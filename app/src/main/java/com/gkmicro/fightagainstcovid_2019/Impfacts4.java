package com.gkmicro.fightagainstcovid_2019;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Impfacts4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.impfacts4);

        Button button190 = (Button)findViewById(R.id.button190);
        Button button191 = (Button)findViewById(R.id.button191);

        button190.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImpfacts3();

            }
        });
        button191.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImpfacts5();

            }
        });
    }
    public void openImpfacts3(){
        Intent intent = new Intent(this, Impfacts3.class);
        startActivity(intent);
    }


    public void openImpfacts5(){
        Intent intent = new Intent(this, Impfacts5.class);
        startActivity(intent);
    }

}


