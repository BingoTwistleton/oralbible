package oralbible.kairos.com.oralbible;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

// why does releasing mediaPlayer crash app?????
// Make both < and "Oral Bible" on player page activate return to ActivityMain.


    public class PlaySound extends android.app.Activity {

    private android.widget.Button pausebutton,playbutton;
    private MediaPlayer mediaPlayer;
    private double startTime = 0;
    private double finalTime = 0;
    private Handler myHandler = new Handler();
    private SeekBar seekbar;
    private TextView tx1,tx2;

    public static int oneTimeOnly = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(oralbible.kairos.com.oralbible.R.layout.activity_play_sound);

         pausebutton = findViewById(R.id.button_pause);
         playbutton = findViewById(R.id.button_play);
         tx1 = findViewById(R.id.elapsedTime);
         tx2 = findViewById(R.id.timeText);

        android.content.Intent intent = getIntent();
        String titlemessage = intent.getStringExtra(oralbible.kairos.com.oralbible.MainActivity.FILETITLE);
        String filename_message = intent.getStringExtra(oralbible.kairos.com.oralbible.MainActivity.AUDIO_FILE);

        TextView tx3;
        tx3 = findViewById(R.id.audioFileName);
        tx3.setText(titlemessage);

        int resID = getResources().getIdentifier(filename_message, "raw", getPackageName());

        mediaPlayer = MediaPlayer.create(this, resID);
        seekbar = findViewById(R.id.seekBar);
        seekbar.setClickable(false);

        //pausebutton.setEnabled(false);
        pausebutton.setVisibility(View.GONE);

        seekbar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        if (fromUser) {
                            mediaPlayer.seekTo(progress);
                            seekBar.setProgress(progress);
                        }
                    }
                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                }
        );

        //Play
        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(), "Playing sound",Toast.LENGTH_SHORT).show();
                mediaPlayer.start();

                finalTime = mediaPlayer.getDuration();
                startTime = mediaPlayer.getCurrentPosition();

                if (oneTimeOnly == 0) {
                    seekbar.setMax((int) finalTime);
                    oneTimeOnly = 1;
                }

                tx2.setText(String.format("%d min, %d sec",
                        TimeUnit.MILLISECONDS.toMinutes((long) finalTime),
                        TimeUnit.MILLISECONDS.toSeconds((long) finalTime) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) finalTime)))
                );

                tx1.setText(String.format("%d min, %d sec",
                        TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                        TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) startTime)))
                );

                seekbar.setProgress((int)startTime);
                myHandler.postDelayed(UpdateSongTime,100);
                pausebutton.setEnabled(true);
                playbutton.setEnabled(false);
                pausebutton.setVisibility(View.VISIBLE);
                playbutton.setVisibility(View.GONE);
            }
        });

        // Pause
        pausebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(), "Pausing sound",Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
                pausebutton.setEnabled(false);
                playbutton.setEnabled(true);
                pausebutton.setVisibility(View.GONE);
                playbutton.setVisibility(View.VISIBLE);
            }
        });

        // Return progress bar to beginning at end of audio
        mediaPlayer.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {
              @Override
              public void onCompletion(MediaPlayer mediaPlayer) {
                  mediaPlayer.seekTo(0);
                  mediaPlayer.pause();
                  pausebutton.setEnabled(false);
                  playbutton.setEnabled(true);
                  pausebutton.setVisibility(View.GONE);
                  playbutton.setVisibility(View.VISIBLE);
              }
        });
    }

    private Runnable UpdateSongTime = new Runnable() {
        public void run() {
            startTime = mediaPlayer.getCurrentPosition();
            tx1.setText(String.format("%d min, %d sec",
                    TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                    TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) startTime)))
            );
            seekbar.setProgress((int)startTime);
            myHandler.postDelayed(this, 100);
        }
    };

        public void goHome(android.view.View view) {
            android.content.Intent intentHome = new android.content.Intent(this, MainActivity.class);
           if (mediaPlayer != null) {
               // mediaPlayer.pause();
               mediaPlayer.stop();
               // mediaPlayer.release(); //causes screen to go black
           }

            startTime = 0;
            finalTime = 0;
            oneTimeOnly = 0;
            finish();
            startActivity(intentHome);

        }
}



