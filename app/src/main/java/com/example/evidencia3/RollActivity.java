package com.example.evidencia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class RollActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll);

        Button rollButton = findViewById(R.id.button);

        rollButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                rollDice();
            }
        });
    }

    private void rollDice()
    {
        Dice dice = new Dice(6);
        int diceRoll = dice.roll();
        int drawableResource = 0;

        ImageView diceImage = findViewById(R.id.imageView);

        switch(diceRoll)
        {
            case 1:
                drawableResource = R.drawable.dice_1;
                break;
            case 2:
                drawableResource = R.drawable.dice_2;
                break;
            case 3:
                drawableResource = R.drawable.dice_3;
                break;
            case 4:
                drawableResource = R.drawable.dice_4;
                break;
            case 5:
                drawableResource = R.drawable.dice_5;
                break;
            case 6:
                drawableResource = R.drawable.dice_6;
                break;
        }

        diceImage.setImageResource(drawableResource);
        diceImage.setContentDescription(String.valueOf(diceRoll));
    }
}
