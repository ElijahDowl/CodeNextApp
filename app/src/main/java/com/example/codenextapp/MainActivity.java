package com.example.codenextapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void coaches(View view) {
        Intent intent = new Intent(MainActivity.this, CoachesActivity.class);
        startActivity(intent);

    }
    public void questions(View view) {
        Intent intent = new Intent(MainActivity.this, QandA.class);
        startActivity(intent);
    }
}


