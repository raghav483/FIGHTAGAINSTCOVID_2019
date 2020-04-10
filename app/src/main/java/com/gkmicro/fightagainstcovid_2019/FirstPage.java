package com.gkmicro.fightagainstcovid_2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstPage extends AppCompatActivity{



     @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage);


         Button button23 = (Button)findViewById(R.id.button23);
         Button button24 = (Button)findViewById(R.id.button24);

         button23.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 openAnother();

             }
         });
         button24.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 openSecondPage();

             }
         });
     }
        public void openAnother(){
            Intent intent = new Intent(this, Another.class);
            startActivity(intent);
        }


        public void openSecondPage(){
            Intent intent = new Intent(this, SecondPage.class);
            startActivity(intent);
        }

}





