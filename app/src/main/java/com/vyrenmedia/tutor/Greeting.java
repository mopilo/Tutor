package com.vyrenmedia.tutor;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by acer on 6/24/2016.
 */
public class Greeting extends Activity implements View.OnClickListener {
    MediaPlayer mp;
    Context context = this;

    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.greetings);

        TextView morning = (TextView) findViewById(R.id.morning);
        TextView evening = (TextView) findViewById(R.id.evening);
        TextView noon = (TextView) findViewById(R.id.noon);
        TextView nite = (TextView) findViewById(R.id.nite);
        TextView sannu = (TextView) findViewById(R.id.sannu);
        TextView no = (TextView) findViewById(R.id.no);
        TextView yes = (TextView) findViewById(R.id.yes);
        TextView mallam = (TextView) findViewById(R.id.man);
        TextView mallama = (TextView) findViewById(R.id.woman);
        TextView well = (TextView) findViewById(R.id.well);
        TextView welcome = (TextView) findViewById(R.id.welcom);
        TextView wella = (TextView) findViewById(R.id.wella);
        TextView lafiya = (TextView) findViewById(R.id.fine);
        TextView lau = (TextView) findViewById(R.id.lau);
        TextView kalau = (TextView) findViewById(R.id.kalau);
        TextView biyu = (TextView) findViewById(R.id.biyu);
        TextView wata = (TextView) findViewById(R.id.wata);
        TextView ban = (TextView) findViewById(R.id.ban);
        TextView dan = (TextView) findViewById(R.id.dan);
        TextView sauka = (TextView) findViewById(R.id.sauka);
        TextView nagode = (TextView) findViewById(R.id.nagode);
        TextView ina = (TextView) findViewById(R.id.ina);
        TextView barna = (TextView) findViewById(R.id.barna);
        TextView tsaya = (TextView) findViewById(R.id.tsaya);
        TextView wuta = (TextView) findViewById(R.id.wuta);
        TextView sanda = (TextView) findViewById(R.id.sanda);
        TextView barka = (TextView) findViewById(R.id.barka);
        TextView ni = (TextView) findViewById(R.id.ni);
        TextView ki = (TextView) findViewById(R.id.ki);



        morning.setOnClickListener(this);
        evening.setOnClickListener(this);
        noon.setOnClickListener(this);
        nite.setOnClickListener(this);
        sannu.setOnClickListener(this);
        no.setOnClickListener(this);
        yes.setOnClickListener(this);
        mallam.setOnClickListener(this);
        mallama.setOnClickListener(this);
        well.setOnClickListener(this);
        wella.setOnClickListener(this);
        welcome.setOnClickListener(this);
        lafiya.setOnClickListener(this);
        lau.setOnClickListener(this);
        kalau.setOnClickListener(this);
        biyu.setOnClickListener(this);
        wata.setOnClickListener(this);
        ban.setOnClickListener(this);
        dan.setOnClickListener(this);
        sauka.setOnClickListener(this);
        nagode.setOnClickListener(this);
        ina.setOnClickListener(this);
        ki.setOnClickListener(this);
        barna.setOnClickListener(this);
        barka.setOnClickListener(this);
        sanda.setOnClickListener(this);
        tsaya.setOnClickListener(this);
        wuta.setOnClickListener(this);
        ni.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int resId;
        switch (v.getId()) {
            case R.id.morning:
                resId = R.raw.asuba;
                break;
            case R.id.evening:
                resId = R.raw.nite;
                break;
            case R.id.noon:
                resId = R.raw.noon;
                break;
            case R.id.nite:
                resId = R.raw.nitte;
                break;
            case R.id.sannu:
                resId = R.raw.sannu;
                break;
            case R.id.no:
                resId = R.raw.no;
                break;
            case R.id.yes:
                resId = R.raw.yes
                ;
                break;
            case R.id.man:
                resId = R.raw.mallam;
                break;
            case R.id.woman:
                resId = R.raw.mallama;
                break;
            case R.id.well:
                resId = R.raw.kana;
                break;
            case R.id.welcom:
                resId = R.raw.welcome;
                break;
            case R.id.wella:
                resId = R.raw.kina;
                break;
            case R.id.fine:
                resId = R.raw.lafiya;
                break;
            case R.id.lau:
                resId = R.raw.lau;
                break;
            case R.id.kalau:
                resId = R.raw.kalau;
                break;
            case R.id.biyu:
                resId = R.raw.biyu;
                break;
            case R.id.wata:
                resId = R.raw.wata;
                break;
            case R.id.ban:
                resId = R.raw.ban;
                break;
            case R.id.dan:
                resId = R.raw.dan;
                break;
            case R.id.sauka:
                resId = R.raw.sauka;
                break;
            case R.id.nagode:
                resId = R.raw.nagode;
                break;
            case R.id.ina:
                resId = R.raw.ina;
                break;
            case R.id.ki:
                resId = R.raw.ki;
                break;
            case R.id.barna:
                resId = R.raw.barnan;
                break;
            case R.id.barka:
                resId = R.raw.barka;
                break;
            case R.id.sanda:
                resId = R.raw.sanda;
                break;
            case R.id.wuta:
                resId = R.raw.wuta;
                break;
            case R.id.tsaya:
                resId = R.raw.tsaya;
                break;
            case R.id.ni:
                resId = R.raw.ni;
                break;


            default:
                resId = R.raw.asuba;
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

