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
public class Alphabet extends Activity implements View.OnClickListener {
    MediaPlayer mp;
    Context context = this;

    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.alphabets);

        Button a = (Button) findViewById(R.id.A);
        Button b = (Button) findViewById(R.id.B);
        Button ba = (Button) findViewById(R.id.Ba);
        Button c = (Button) findViewById(R.id.C);
        Button d = (Button) findViewById(R.id.D);
        Button dd = (Button) findViewById(R.id.Da);
        Button e = (Button) findViewById(R.id.E);
        Button f = (Button) findViewById(R.id.F);
        Button g = (Button) findViewById(R.id.G);
        Button h = (Button) findViewById(R.id.H);
        Button i = (Button) findViewById(R.id.I);
        Button j = (Button) findViewById(R.id.J);
        Button k = (Button) findViewById(R.id.K);
        Button kk = (Button) findViewById(R.id.Ka);
        Button l = (Button) findViewById(R.id.L);
        Button m = (Button) findViewById(R.id.M);
        Button n = (Button) findViewById(R.id.N);
        Button o = (Button) findViewById(R.id.O);
        Button r = (Button) findViewById(R.id.R);
        Button rr = (Button) findViewById(R.id.Ra);
        Button s = (Button) findViewById(R.id.S);
        Button sh = (Button) findViewById(R.id.Sh);
        Button t = (Button) findViewById(R.id.T);
        Button ts = (Button) findViewById(R.id.Ts);
        Button u = (Button) findViewById(R.id.U);
        Button w = (Button) findViewById(R.id.W);
        Button y = (Button) findViewById(R.id.Y);
        Button ya = (Button) findViewById(R.id.Ya);
        Button z = (Button) findViewById(R.id.Z);


        a.setOnClickListener(this);
        b.setOnClickListener(this);
        ba.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        dd.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        kk.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        r.setOnClickListener(this);
        rr.setOnClickListener(this);
        s.setOnClickListener(this);
        sh.setOnClickListener(this);
        t.setOnClickListener(this);
        ts.setOnClickListener(this);
        u.setOnClickListener(this);
        w.setOnClickListener(this);
        y.setOnClickListener(this);
        ya.setOnClickListener(this);
        z.setOnClickListener(this);



    }

    public void onClick(View v) {

        int resId;
        switch (v.getId()) {
            case R.id.A:
                resId = R.raw.a;
                break;
            case R.id.B:
                resId = R.raw.b;
                break;
            case R.id.Ba:
                resId = R.raw.ba;
                break;
            case R.id.C:
                resId = R.raw.c;
                break;
            case R.id.D:
                resId = R.raw.d;
                break;
            case R.id.Da:
                resId = R.raw.dd;
                break;
            case R.id.E:
                resId = R.raw.e;
                break;
            case R.id.F:
                resId = R.raw.f;
                break;
            case R.id.G:
                resId = R.raw.g;
                break;
            case R.id.H:
                resId = R.raw.h;
                break;
            case R.id.I:
                resId = R.raw.i;
                break;
            case R.id.J:
                resId = R.raw.j;
                break;
            case R.id.K:
                resId = R.raw.k;
                break;
            case R.id.Ka:
                resId = R.raw.kk;
                break;
            case R.id.L:
                resId = R.raw.l;
                break;
            case R.id.M:
                resId = R.raw.m;
                break;
            case R.id.N:
                resId = R.raw.n;
                break;
            case R.id.O:
                resId = R.raw.o;
                break;
            case R.id.R:
                resId = R.raw.r;
                break;
            case R.id.Ra:
                resId = R.raw.rr;
                break;
            case R.id.S:
                resId = R.raw.s;
                break;
            case R.id.Sh:
                resId = R.raw.sh;
                break;
            case R.id.T:
                resId = R.raw.t;
                break;
            case R.id.Ts:
                resId = R.raw.t;
                break;
            case R.id.U:
                resId = R.raw.u;
                break;
            case R.id.W:
                resId = R.raw.w;
                break;
            case R.id.Y:
                resId = R.raw.y;
                break;
            case R.id.Ya:
                resId = R.raw.yy;
                break;
            case R.id.Z:
                resId = R.raw.z;
                break;

            default:
                resId = R.raw.a;
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
