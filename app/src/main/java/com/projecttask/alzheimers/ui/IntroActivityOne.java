package com.projecttask.alzheimers.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.projecttask.alzheimers.R;
import com.projecttask.alzheimers.ui.auth.RegisterActivity;

public class IntroActivityOne extends AppCompatActivity {
    protected Button intButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_one);
        intButton = findViewById(R.id.introBtn);

        intButton.setOnClickListener(View -> {
            Intent intent = new Intent(IntroActivityOne.this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}