package com.gkmicro.fightagainstcovid_2019;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.gkmicro.fightagainstcovid_2019.MainActivity;
import com.gkmicro.fightagainstcovid_2019.R;
import com.gkmicro.fightagainstcovid_2019.Suggestions1;

public class Impfacts6 extends AppCompatActivity {
    private  Button button160;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.impfacts6);
        button160 = findViewById(R.id.button160);

        button160.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImpfacts5();

            }
        });

    }

    public void openImpfacts5() {
        Intent intent = new Intent(this, Impfacts5.class);
        startActivity(intent);

    }
}