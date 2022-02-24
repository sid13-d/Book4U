package com.example.book4u;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class OTPActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    LinearLayout linearLayout;
    LottieAnimationView lottieAnimationView;
    TextView textView;
    EditText digit1, digit2, digit3, digit4, digit5, digit6;
    Button verifyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpactivity);
    }

    public void loginMethod(View view){
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
    }
}