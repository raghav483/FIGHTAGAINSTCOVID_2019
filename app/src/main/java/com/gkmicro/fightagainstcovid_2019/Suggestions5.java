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

public class Suggestions5 extends AppCompatActivity {
    private Button button20;
    Button clk;
    VideoView videov;
    MediaController mediaC;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suggestions5);
        button20 = findViewById(R.id.button20);
        clk=(Button)findViewById(R.id.button19);
        videov = (VideoView)findViewById(R.id.videoView);
        mediaC = new MediaController(this);

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSuggestions4();

            }
        });

    }
    public void openSuggestions4(){
        Intent intent = new Intent(this, Suggestions4.class);
        startActivity(intent);
    }




    public void videoplay(View v){
        String videopath="android.resource://com.gkmicro.fightagainstcovid_2019/"+R.raw.surface;
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.start();

    }


}