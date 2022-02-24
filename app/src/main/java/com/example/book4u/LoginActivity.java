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

public class LoginActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    LottieAnimationView lottieAnimationView;
    TextView welcomeText, signupStatement, signupLink, forgotPassword;
    EditText email, pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        constraintLayout = (ConstraintLayout) findViewById(R.id.loginContainer);
        lottieAnimationView = (LottieAnimationView) findViewById(R.id.lottieAnimationView);
        welcomeText = (TextView) findViewById(R.id.welcomeBack);
        signupStatement = (TextView) findViewById(R.id.linkStatement);
        signupLink = (TextView) findViewById(R.id.linkButton);
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.password);
        forgotPassword = (TextView) findViewById(R.id.forgotPassword);
        login = (Button) findViewById(R.id.loginButton);
    }

    public void signUp(View view){
        Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
        startActivity(intent);
    }

    public void homeScreen(View view){
        Intent intent = new Intent(getApplicationContext(), BottomTabActivity.class);
        startActivity(intent);
    }
}