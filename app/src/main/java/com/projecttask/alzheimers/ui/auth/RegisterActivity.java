package com.projecttask.alzheimers.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.projecttask.alzheimers.R;

public class RegisterActivity extends AppCompatActivity {
    EditText RegisterUserName , RegisterEmail, RegisterPhone, RegisterPassword, RegisterConfirmPassword;
    TextView register_text_login;
    ProgressBar progressBar;
    Button signUpBtn;

    @Override
    // Find view
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        RegisterUserName.findViewById(R.id.RegisterUserName);
        RegisterEmail.findViewById(R.id.RegisterEmail);
        RegisterPhone.findViewById(R.id.RegisterPhone);
        RegisterPassword.findViewById(R.id.RegisterPassword);
        RegisterConfirmPassword.findViewById(R.id.RegisterConfirmPassword);
        register_text_login.findViewById(R.id.register_text_login);
        progressBar.findViewById(R.id.RegisterProgresBar);
        signUpBtn.findViewById(R.id.signUpBtn);

        //Firebase Auth
        FirebaseAuth firebase = FirebaseAuth.getInstance();
        //on Click
        signUpBtn.setOnClickListener(v -> {

        });


    }
    private void ValidationData(){
        String name =RegisterUserName.getText().toString().trim();
        String email =RegisterEmail.getText().toString().trim();
        String phone =RegisterPhone.getText().toString().trim();
        String password =RegisterPassword.getText().toString().trim();
     //   String confirmPassword =RegisterConfirmPassword.getText().toString().trim();

        if (name.isEmpty()) {
            Toast.makeText(this, "Please Enter Your UserName", Toast.LENGTH_SHORT).show();
            RegisterUserName.findFocus();
            return;
        }if (email.isEmpty()) {
            Toast.makeText(RegisterActivity.this, "Please Enter Your Email", Toast.LENGTH_SHORT).show();
            RegisterEmail.findFocus();
            return;

        }if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            Toast.makeText(RegisterActivity.this, "Please Enter Valid Email", Toast.LENGTH_SHORT).show();
            RegisterEmail.findFocus();
            return;

        }if (phone.isEmpty()){
            Toast.makeText(RegisterActivity.this, "Please Add Your Phone", Toast.LENGTH_SHORT).show();
            RegisterPhone.findFocus();
            return;
        }if (phone.length() <11){
            Toast.makeText(RegisterActivity.this, "Phone Should be a 11 Char", Toast.LENGTH_SHORT).show();
            RegisterPhone.findFocus();
            return;
        }if (password.isEmpty()){
            Toast.makeText(RegisterActivity.this, "Please Enter Your Password" ,Toast.LENGTH_SHORT).show();
            RegisterPassword.findFocus();
            return;
        }if (password.length() <6){
            Toast.makeText(RegisterActivity.this, "Password Should be a 6 Char" ,Toast.LENGTH_SHORT).show();
            RegisterPassword.findFocus();
            return;
        }
        register(email,password);
    }
    private void register(String email,String password){
        progressBar.setVisibility(View.VISIBLE);


    }
}