package com.example.book4u;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SignUpActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    LottieAnimationView lottieAnimationView;
    TextView welcomeText, signupStatement, signupLink, forgotPassword;
    EditText name, email, pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sign_up);
        constraintLayout = (ConstraintLayout) findViewById(R.id.loginContainer);
        lottieAnimationView = (LottieAnimationView) findViewById(R.id.signupGIF);
        welcomeText = (TextView) findViewById(R.id.welcomeBack);
        signupStatement = (TextView) findViewById(R.id.linkStatement);
        signupLink = (TextView) findViewById(R.id.linkButton);
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.password);
        forgotPassword = (TextView) findViewById(R.id.forgotPassword);
        login = (Button) findViewById(R.id.loginButton);
    }

    public void loginMethod(View view){
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);

    }

    public void otpMethod(View view) {
        Intent intent = new Intent(getApplicationContext(), OTPActivity.class);
        startActivity(intent);
    }
}