package com.example.book4u;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        imageView = (ImageView) findViewById(R.id.appBG);
        textView = (TextView) findViewById(R.id.appName);
        lottieAnimationView = (LottieAnimationView) findViewById(R.id.splashGIF);

        imageView.animate().translationY(-2500).setDuration(1000).setStartDelay(4000);
        textView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), onboardMain.class);
                startActivity(intent);
                finish();
            }
        },5000);

    }
}