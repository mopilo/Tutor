package com.vyrenmedia.tutor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by acer on 9/1/2016.
 */

public class Instruction extends Activity {
    Button button;
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.instruction);

        button = (Button) findViewById(R.id.instruction);
        button.setOnClickListener (new View.OnClickListener() {
                                       public void onClick(View v) {
                                           Intent intent = new Intent(Instruction.this, MainActivity.class);
                                           startActivity(intent);
                                       }
                                   }
        );
    }

}