package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {


    VideoView videoView;

    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.TEXT);

        videoView = (VideoView) findViewById(R.id.videoview1);

        mediaController = new MediaController(this);

        switch(text) {
            case "Real Madrid vs Valencia":
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.highlights1);
                break;
            case "Barcelona vs Espanyol":
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.highlights2);
                break;
            case "Liverpool vs Watford":
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.highlights3);
                break;

            case "Chelsea vs Manchester City":
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.highlights4);
                break;

            case "The Good Place Season 1":
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.comedy1);
                break;

            case "The Good Place Season 2":
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.comedy11);
                break;

            case "How I Met Your Mother Season 1":
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.comedy2);
                break;

            case "How I Met Your Mother Season 2":
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.comedy22);
                break;

            case "Black Mirror Season 2":
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.drama22);
                break;

            case "You Season 1":
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.drama11);
                break;

            case "You Season 2":
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.drama12);
                break;

            case "Black Mirror Season 1":
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.drama21);
                break;

            case "Arrow Season 1":
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.adv1);
                break;

            case "Arrow Season 2":
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.adv11);
                break;

            case "Titans Season 1":
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.adv2);
                break;

            case "Titans Season 2":
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.adv22);
                break;

        }
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

    }
}