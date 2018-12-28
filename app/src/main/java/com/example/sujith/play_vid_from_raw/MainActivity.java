package com.example.sujith.play_vid_from_raw;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoviewp;
    Button playp;
    MediaController mediac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoviewp=findViewById(R.id.videoView);
        playp=findViewById(R.id.button);
        mediac=new MediaController(this);




        playp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String video_path = "android.resource://" + getPackageName() + "/"
                                + R.raw.vid;
                videoviewp.setVideoURI(Uri.parse(video_path));
                videoviewp.setMediaController(mediac);
                mediac.setAnchorView(videoviewp);
                videoviewp.start();

            }
        });
    }
}
