package com.karolina.appproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.karolina.appproject.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){
    Intent intent = new Intent(this, DisplayMessageActivity.class);
    EditText name = (EditText) findViewById(R.id.name);
        EditText surname = (EditText) findViewById(R.id.surname);
    String message = (name.getText()+" "+surname.getText()).toString();

    intent.putExtra(EXTRA_MESSAGE, message);
    startActivity(intent);
    }

    }
