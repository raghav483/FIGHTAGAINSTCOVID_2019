package com.gkmicro.fightagainstcovid_2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Button;

public class questionnaire extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        tv = findViewById(R.id.textView_explain);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFiner();

            }
        });
    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void openFiner(){
        Intent intent = new Intent(this, Finer.class);
        startActivity(intent);
    }
    public void onRadioButtonClicked(View view )
    {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId())
        {
            case R.id.radio_button1:
                if(checked)
                    tv.setText("If cough persists 2-3 days consult your doctor ");
                break;
            case R.id.radio_button2:
                if(checked)
                    tv.setText("It could be a normal fever.But better you consult your doctor first");
                break;
            case R.id.radio_button3:
                if(checked)
                    tv.setText("Drink lukewarm water,if still persists consult doctor");
                break;
            case R.id.radio_button8:
                if(checked)
                    tv.setText("Immediately consult the doctor");
                break;
            case R.id.radio_button9:
                if(checked)
                    tv.setText("Stay well, stay quarantined");
                break;



        }

    }
}
