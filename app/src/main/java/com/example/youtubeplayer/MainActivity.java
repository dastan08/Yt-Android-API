package com.example.youtubeplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends YouTubeBaseActivity {
    private static final String TAG="MainActivity";
    YouTubePlayerView ytdplay;
    Button btnplay;
    YouTubePlayer.OnInitializedListener Onlisten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Oncreate : Starting");
        btnplay=(Button)findViewById(R.id.btnplay);
        ytdplay=(YouTubePlayerView)findViewById(R.id.ytPlay);
        Onlisten= new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG,"Onclick: Done Initilizing");
                List<String> videoList = new ArrayList<>();
                videoList.add("RFENduA7xsw");
                videoList.add("PHJv5O07dLk");
                youTubePlayer.loadVideos(videoList);

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG,"Onclick: Failed to Initilize");

            }
        };
        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"Onclick: Initializing YouTube Player");
                ytdplay.initialize(YoutubeConfig.getApiKey(), Onlisten);

            }
        });
    }
}
