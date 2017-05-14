package com.vyrenmedia.tutor;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by acer on 6/24/2016.
 */
public class Proverbs extends Activity implements View.OnClickListener {
    MediaPlayer mp;
    Context context = this;
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proverbs);

        Button mai = (Button) findViewById(R.id.letter);
        Button ruwa = (Button) findViewById(R.id.letter1);
        Button maka = (Button) findViewById(R.id.letter2);
        Button idan = (Button) findViewById(R.id.letter3);
        Button ba = (Button) findViewById(R.id.letter4);
        Button bashi = (Button) findViewById(R.id.letter5);
        Button kunkuru = (Button) findViewById(R.id.letter6);
        Button wuni = (Button) findViewById(R.id.letter7);
        Button samun = (Button) findViewById(R.id.letter8);
        Button raba = (Button) findViewById(R.id.letter9);
        Button dauka = (Button) findViewById(R.id.letter10);
        Button Shanu = (Button) findViewById(R.id.letter11);
        Button kaji = (Button) findViewById(R.id.letter12);
        Button gora = (Button) findViewById(R.id.letter13);
        Button kai = (Button) findViewById(R.id.letter16);

        mai.setOnClickListener(this);
        ruwa.setOnClickListener(this);
        maka.setOnClickListener(this);
        idan.setOnClickListener(this);
        ba.setOnClickListener(this);
        bashi.setOnClickListener(this);
        kunkuru.setOnClickListener(this);
        wuni.setOnClickListener(this);
        samun.setOnClickListener(this);
        raba.setOnClickListener(this);
        dauka.setOnClickListener(this);
        Shanu.setOnClickListener(this);
        kaji.setOnClickListener(this);
        gora.setOnClickListener(this);
        kai.setOnClickListener(this);
            }
    public void onClick(View v) {

        int resId;
        switch (v.getId()) {
            case R.id.letter:
                resId = R.raw.mai;
                break;
            case R.id.letter1:
                resId = R.raw.ruwa;
                break;
            case R.id.letter2:
                resId = R.raw.maka;
                break;
            case R.id.letter3:
                resId = R.raw.idan;
                break;
            case R.id.letter4:
                resId = R.raw.tsawo;
                break;
            case R.id.letter5:
                resId = R.raw.tam;
                break;
            case R.id.letter6:
                resId = R.raw.kunkuru;
                break;
            case R.id.letter7:
                resId = R.raw.wani;
                break;
            case R.id.letter8:
                resId = R.raw.samon;
                break;
            case R.id.letter9:
                resId = R.raw.bashi;
                break;
            case R.id.letter10:
                resId = R.raw.danka;
                break;
            case R.id.letter11:
                resId = R.raw.kashi;
                break;
            case R.id.letter12:
                resId = R.raw.kaji;
                break;
            case R.id.letter13:
                resId = R.raw.gora;
                break;
            case R.id.letter16:
                resId = R.raw.wuya;
                break;

            default:
                resId = R.raw.mai;
                break;
        }
        // Release any resources from previous MediaPlayer
        if (mp != null) {
            mp.release();
        }
        // Create a new MediaPlayer to play this sound
        mp = MediaPlayer.create(this, resId);
        mp.start();
    }

    protected void onDestroy() {
        if (null != mp) {
            mp.release();
        }
        super.onDestroy();
    }
}

