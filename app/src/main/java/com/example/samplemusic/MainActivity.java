package com.example.samplemusic;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(MainActivity.this, R.raw.music);
        mp.start();
    }

    @Override
    protected void onPause() {
        super.onPause();

        mp.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();

        mp.start();

    }
}
