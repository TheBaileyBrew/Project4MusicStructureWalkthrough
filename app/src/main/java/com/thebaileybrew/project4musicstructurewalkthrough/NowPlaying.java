package com.thebaileybrew.project4musicstructurewalkthrough;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        String artistName = getIntent().getStringExtra("artist");
        String artistSong = getIntent().getStringExtra("artistSong");
        String artistFeat = getIntent().getStringExtra("artistFeat");
        int artistImage = getIntent().getIntExtra("artistImage", 0);



    }
}
