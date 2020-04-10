package com.gkmicro.fightagainstcovid_2019;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Impfacts extends AppCompatActivity {
    Button clk;
    VideoView videov1;
    MediaController mediaC;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.impfacts);
        Button button101 = (Button)findViewById(R.id.button101);
        Button button102 = (Button)findViewById(R.id.button102);
        clk=(Button)findViewById(R.id.button100);
        videov1 = (VideoView)findViewById(R.id.videoView);
        mediaC = new MediaController(this);

        button101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();

            }
        });
        button102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImpfacts1();

            }
        });
    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void openImpfacts1(){
        Intent intent = new Intent(this, Impfacts1.class);
        startActivity(intent);
    }


    public void videoplay(View v){
        String videopath="android.resource://com.gkmicro.fightagainstcovid_2019/"+R.raw.developments;
        Uri uri = Uri.parse(videopath);
        videov1.setVideoURI(uri);
        videov1.setMediaController(mediaC);
        mediaC.setAnchorView(videov1);
        videov1.start();

    }


}

