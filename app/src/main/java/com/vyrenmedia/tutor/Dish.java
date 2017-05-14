package com.vyrenmedia.tutor;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by acer on 6/24/2016.
 */
public class Dish extends Activity implements View.OnClickListener {
    MediaPlayer mp;
    Context context = this;
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.dish);

        ImageButton kilishi = (ImageButton) findViewById(R.id.letter);
        ImageButton alele = (ImageButton) findViewById(R.id.dish);
        ImageButton danwake = (ImageButton) findViewById(R.id.greet);
        ImageButton suya = (ImageButton) findViewById(R.id.poem);
        ImageButton koko = (ImageButton) findViewById(R.id.dict);
        ImageButton kosai = (ImageButton) findViewById(R.id.proverb);
        ImageButton masa = (ImageButton) findViewById(R.id.masa);
        ImageButton masara = (ImageButton) findViewById(R.id.masara);
        ImageButton nama = (ImageButton) findViewById(R.id.nama);
        ImageButton kuka = (ImageButton) findViewById(R.id.kuka);
        ImageButton fakasua = (ImageButton) findViewById(R.id.fakasua);
        ImageButton zogale = (ImageButton) findViewById(R.id.zogale);

        kilishi.setOnClickListener(this);
        alele.setOnClickListener(this);
        danwake.setOnClickListener(this);
        suya.setOnClickListener(this);
        koko.setOnClickListener(this);
        kosai.setOnClickListener(this);
        masa.setOnClickListener(this);
        masara.setOnClickListener(this);
        nama.setOnClickListener(this);
        kuka.setOnClickListener(this);
        fakasua.setOnClickListener(this);
        zogale.setOnClickListener(this);



    }
    public void onClick(View v) {

        int resId;
        switch (v.getId()) {
            case R.id.letter:
                resId = R.raw.kilishi;
                break;
            case R.id.dish:
                resId = R.raw.alale;
                break;
            case R.id.greet:
                resId = R.raw.danwake;
                break;
            case R.id.poem:
                resId = R.raw.suya;
                break;
            case R.id.dict:
                resId = R.raw.koko;
                break;
            case R.id.proverb:
                resId = R.raw.kosai;
                break;
            case R.id.masa:
                resId = R.raw.masa;
                break;
            case R.id.masara:
                resId = R.raw.masara;
                break;
            case R.id.nama:
                resId = R.raw.danbun;
                break;
            case R.id.fakasua:
                resId = R.raw.fankasa;
                break;
            case R.id.zogale:
                resId = R.raw.zogale;
                break;
            case R.id.kuka:
                resId = R.raw.tuwo;
                break;



            default:
                resId = R.raw.kilishi;
                break;}

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

