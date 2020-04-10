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

public class Suggestions2 extends AppCompatActivity {
    Button clk;
    VideoView videov;
    MediaController mediaC;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suggestions2);
        Button button77 = (Button)findViewById(R.id.button77);
        Button button78 = (Button)findViewById(R.id.button78);
        clk=(Button)findViewById(R.id.button76);
        videov = (VideoView)findViewById(R.id.videoView);
        mediaC = new MediaController(this);

        button77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSuggestions1();

            }
        });
        button78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSuggestions3();

            }
        });
    }
    public void openSuggestions1(){
        Intent intent = new Intent(this, Suggestions1.class);
        startActivity(intent);
    }


    public void openSuggestions3(){
        Intent intent = new Intent(this, Suggestions3.class);
        startActivity(intent);
    }


    public void videoplay(View v){
        String videopath="android.resource://com.gkmicro.fightagainstcovid_2019/"+R.raw.corona;
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.start();

    }


}