package com.gkmicro.fightagainstcovid_2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Button;

public class Finer extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finer);

        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        tv = findViewById(R.id.textView_explain);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openquestionnaire();

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOther();

            }
        });
    }
    public void openquestionnaire(){
        Intent intent = new Intent(this, questionnaire.class);
        startActivity(intent);
    }


    public void openOther(){
        Intent intent = new Intent(this, Other.class);
        startActivity(intent);
    }
    public void onRadioButtonClicked(View view )
    {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId())
        {
            case R.id.radio_button4:
                if(checked)
                    tv.setText("Get yourself checked");
                break;
            case R.id.radio_button5:
                if(checked)
                    tv.setText("Get yourself checked");
                break;
            case R.id.radio_button6:
                if(checked)
                    tv.setText("Get yourself checked");
                break;
            case R.id.radio_button7:
                if(checked)
                    tv.setText("Get yourself checked");
                break;
            case R.id.radio_button79:
                if(checked)
                    tv.setText("Stay well, stay quarantined");
                break;


        }

    }
}


