package com.gkmicro.fightagainstcovid_2019;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Impfacts2 extends AppCompatActivity {
    Button clk;
    VideoView videov1;
    MediaController mediaC;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.impfacts2);
        Button button107 = (Button)findViewById(R.id.button107);
        Button button108 = (Button)findViewById(R.id.button108);
        clk=(Button)findViewById(R.id.button106);
        videov1 = (VideoView)findViewById(R.id.videoView);
        mediaC = new MediaController(this);

        button107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImpfacts1();

            }
        });
        button108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImpfacts3();

            }
        });
    }
    public void openImpfacts1(){
        Intent intent = new Intent(this, Impfacts1.class);
        startActivity(intent);
    }


    public void openImpfacts3(){
        Intent intent = new Intent(this, Impfacts3.class);
        startActivity(intent);
    }


    public void videoplay(View v){
        String videopath="android.resource://com.gkmicro.fightagainstcovid_2019/"+R.raw.workers;
        Uri uri = Uri.parse(videopath);
        videov1.setVideoURI(uri);
        videov1.setMediaController(mediaC);
        mediaC.setAnchorView(videov1);
        videov1.start();

    }


}
