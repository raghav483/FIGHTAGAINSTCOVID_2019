package com.gkmicro.fightagainstcovid_2019;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Impfacts3 extends AppCompatActivity {
    Button clk;
    VideoView videov1;
    MediaController mediaC;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.impfacts3);
        Button button110 = (Button)findViewById(R.id.button110);
        Button button111 = (Button)findViewById(R.id.button111);
        clk=(Button)findViewById(R.id.button109);
        videov1 = (VideoView)findViewById(R.id.videoView);
        mediaC = new MediaController(this);

        button110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImpfacts2();

            }
        });
        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImpfacts4();

            }
        });
    }
    public void openImpfacts2(){
        Intent intent = new Intent(this, Impfacts2.class);
        startActivity(intent);
    }


    public void openImpfacts4(){
        Intent intent = new Intent(this, Impfacts4.class);
        startActivity(intent);
    }


    public void videoplay(View v){
        String videopath="android.resource://com.gkmicro.fightagainstcovid_2019/"+R.raw.racism;
        Uri uri = Uri.parse(videopath);
        videov1.setVideoURI(uri);
        videov1.setMediaController(mediaC);
        mediaC.setAnchorView(videov1);
        videov1.start();

    }


}
