package com.gkmicro.fightagainstcovid_2019;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Other extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);

        Button button20 = (Button)findViewById(R.id.button20);
        Button button21 = (Button)findViewById(R.id.button21);
        tv = findViewById(R.id.textView_explain);

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFiner();

            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnother();

            }
        });
    }
    public void openFiner(){
        Intent intent = new Intent(this, Finer.class);
        startActivity(intent);
    }


    public void openAnother(){
        Intent intent = new Intent(this, Another.class);
        startActivity(intent);
    }
    public void onRadioButtonClicked(View view )
    {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId())
        {
            case R.id.radio_button13:
                if(checked)
                    tv.setText("First get a checkup, and stay quarantined");
                break;
            case R.id.radio_button14:
                if(checked)
                    tv.setText("Stay well, stay quarantined");
                break;


        }

    }
}



