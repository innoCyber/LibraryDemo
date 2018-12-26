package com.example.innocyber.librarydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.domodulus.DoModulus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int mod = DoModulus.calculateModulus(4,3);
        Toast.makeText(MainActivity.this,String.valueOf(mod),Toast.LENGTH_SHORT).show();

    }
}
