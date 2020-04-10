package com.gkmicro.fightagainstcovid_2019;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Suggestions1 extends AppCompatActivity {
    Button clk;
    VideoView videov;
    MediaController mediaC;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suggestions1);
        Button button68 = (Button)findViewById(R.id.button68);
        Button button69 = (Button)findViewById(R.id.button69);
        clk=(Button)findViewById(R.id.button67);
        videov = (VideoView)findViewById(R.id.videoView);
        mediaC = new MediaController(this);

        button68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSuggestions();

            }
        });
        button69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSuggestions2();

            }
        });
    }
    public void openSuggestions(){
        Intent intent = new Intent(this, Suggestions.class);
        startActivity(intent);
    }


    public void openSuggestions2(){
        Intent intent = new Intent(this, Suggestions2.class);
        startActivity(intent);
    }


    public void videoplay(View v){
        String videopath="android.resource://com.gkmicro.fightagainstcovid_2019/"+R.raw.safety1;
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.start();

    }


}


