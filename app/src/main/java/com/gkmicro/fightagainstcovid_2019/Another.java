package com.gkmicro.fightagainstcovid_2019;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Another extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.another);



                Button button90 = (Button)findViewById(R.id.button90);
                Button button91 = (Button)findViewById(R.id.button91);
                tv = findViewById(R.id.textView_explain);

                button90.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openOther();

                    }
                });
                button91.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openFirstPage();

                    }
                });
            }
            public void openOther(){
                Intent intent = new Intent(this, Other.class);
                startActivity(intent);
            }


            public void openFirstPage(){
                Intent intent = new Intent(this, FirstPage.class);
                startActivity(intent);
            }
            public void onRadioButtonClicked(View view )
            {
                boolean checked = ((RadioButton) view).isChecked();

                switch (view.getId())
                {
                    case R.id.radio_button34:
                        if(checked)
                            tv.setText("Get yourself checked by a doctor");
                        break;
                    case R.id.radio_button35:
                        if(checked)
                            tv.setText("Salute!Please take precautions");
                        break;
                    case R.id.radio_button36:
                        if(checked)
                            tv.setText("Stay well, stay quarantined");
                        break;

                }

            }
        }



