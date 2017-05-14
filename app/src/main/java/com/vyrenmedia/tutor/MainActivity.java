package com.vyrenmedia.tutor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


/**
 * Created by acer on 6/20/2016.
 */
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        //onclick listener for alphabet button
        ImageButton  alpha = (ImageButton) findViewById(R.id.letter);
        alpha.setOnClickListener
                (new View.OnClickListener() {
                     public void onClick(View v) {
                       Intent intent = new Intent(MainActivity.this, Alphabet.class);
                       startActivity(intent);
                     }
                 }
                );

        // onclick listener for dish button
        ImageButton food = (ImageButton) findViewById(R.id.dish);
        food.setOnClickListener
            (new View.OnClickListener()
             {
                 public void onClick(View v)
                 {
                  Intent intent = new Intent(MainActivity.this, Dish.class);
                  startActivity(intent);
                 }
             }
            );
        //onclick listener for greetings button
        ImageButton greet = (ImageButton) findViewById(R.id.greet);
        greet.setOnClickListener
        (new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, Greeting.class);
                startActivity(intent);
            }
        }
        );
        ImageButton poem =(ImageButton) findViewById(R.id.poem);
        poem.setOnClickListener
        (new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    Intent intent = new Intent(MainActivity.this, Proverbs.class);
                    startActivity(intent);
                }
            }
        );

        ImageButton dict =(ImageButton) findViewById(R.id.dict);
        dict.setOnClickListener
                (new View.OnClickListener()
                 {
                     public void onClick(View v)
                     {
                         Intent intent = new Intent(MainActivity.this, Dictionary.class);
                         startActivity(intent);
                     }
                 }
                );

    }

}
