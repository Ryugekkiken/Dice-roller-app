package com.example.evidencia3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button switchActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchActivityButton = findViewById(R.id.change_screen);

        switchActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                switchActivities();
            }
        });

    }

    private void switchActivities()
    {
        Intent switchActivityIntent = new Intent(this, RollActivity.class);
        startActivity(switchActivityIntent);
    }
}
