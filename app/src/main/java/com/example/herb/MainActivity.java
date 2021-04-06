package com.example.herb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
    ImageView splashimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        splashimage=(ImageView) findViewById(R.id.imageView);


        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.myanimation);
        splashimage.startAnimation(myanim);

        Thread myThread=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    sleep(3000);

                    Intent intent = new Intent(MainActivity.this,mainmenu.class);
                    startActivity(intent);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        myThread.start();



    }
}