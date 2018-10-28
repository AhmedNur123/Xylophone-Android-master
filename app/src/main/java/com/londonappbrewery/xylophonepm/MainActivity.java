package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundpool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSoundpool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);



        // TODO: Load and get the IDs to identify the sounds

        mCSoundId = mSoundpool.load(getApplicationContext(),R.raw.note1_c,1);mCSoundId = mSoundpool.load(getApplicationContext(),R.raw.note2_d,1);
        mDSoundId = mSoundpool.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId = mSoundpool.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId = mSoundpool.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId = mSoundpool.load(getApplicationContext(),R.raw.note5_g,1);
        mASoundId = mSoundpool.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundId = mSoundpool.load(getApplicationContext(),R.raw.note7_b,1);

    }

    // TODO: Add the play methods triggered by the buttons

    public void playC(View v) {
        Log.d("Xylophone" , "Red Button Clicked!");
        mSoundpool.play(mCSoundId, 1.0f, 1.0f , 0, 0, 1.0f);

    }

    public void playD (View v) {
        Log.d("Xylophone", "Orange Button Clicked!");
        mSoundpool.play(mDSoundId, 1.0f, 1.0f , 0, 0, 1.0f);


    }

    public void playE (View v) {
        Log.d("Xylophone", "Yellow Button Clicked");
        mSoundpool.play(mESoundId, 1.0f, 1.0f , 0, 0, 1.0f);

    }

    public void playF (View v) {
        Log.d("Xylophone" ,"Light Green Button Clicked!");
        mSoundpool.play(mFSoundId, 1.0f, 1.0f , 0, 0, 1.0f);


    }

    public void playG (View v) {
        Log.d("Xylophone" , "Green Button Clicked!");
        mSoundpool.play(mGSoundId, 1.0f, 1.0f , 0, 0, 1.0f);


    }

    public void playA (View v) {
        Log.d("Xylophone" , "Light Blue Button Clicked!");
        mSoundpool.play(mASoundId, 1.0f, 1.0f , 0, 0, 1.0f);


    }
    public void playB (View v) {
        Log.d("Xylophone" , "Purple Button Clicked!");
        mSoundpool.play(mBSoundId, 1.0f, 1.0f , 0, 0, 1.0f);

    }

}
