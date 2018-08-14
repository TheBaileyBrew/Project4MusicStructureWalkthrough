package com.thebaileybrew.project4musicstructurewalkthrough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        songList songs = new songList();
        final ArrayList<song> SongItems = songs.getSongList();;
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        SongAdapter adapter = new SongAdapter(this, SongItems, new CustomClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                song currentSong = SongItems.get(position);
                String artistName = currentSong.getArtistName();
                String artistSong = currentSong.getArtistSong();
                String artistFeatured = currentSong.getArtistFeatured();
                int artistImage = currentSong.getArtistImage();

                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlaying.class);
                nowPlayingIntent.putExtra("artist", artistName);
                nowPlayingIntent.putExtra("artistSong", artistSong);
                nowPlayingIntent.putExtra("artistFeat", artistFeatured);
                nowPlayingIntent.putExtra("artistImage", artistImage);
                startActivity(nowPlayingIntent);

            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }


    //github.com/TheBaileyBrew
}
