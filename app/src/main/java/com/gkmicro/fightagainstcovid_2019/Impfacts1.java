package com.gkmicro.fightagainstcovid_2019;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Impfacts1 extends AppCompatActivity {
    Button clk;
    VideoView videov1;
    MediaController mediaC;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.impfacts1);
        Button button104 = (Button)findViewById(R.id.button104);
        Button button105 = (Button)findViewById(R.id.button105);
        clk=(Button)findViewById(R.id.button103);
        videov1 = (VideoView)findViewById(R.id.videoView);
        mediaC = new MediaController(this);

        button104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImpfacts();

            }
        });
        button105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImpfacts2();

            }
        });
    }
    public void openImpfacts(){
        Intent intent = new Intent(this, Impfacts.class);
        startActivity(intent);
    }


    public void openImpfacts2(){
        Intent intent = new Intent(this, Impfacts2.class);
        startActivity(intent);
    }


    public void videoplay(View v){
        String videopath="android.resource://com.gkmicro.fightagainstcovid_2019/"+R.raw.lockdown1;
        Uri uri = Uri.parse(videopath);
        videov1.setVideoURI(uri);
        videov1.setMediaController(mediaC);
        mediaC.setAnchorView(videov1);
        videov1.start();

    }


}
