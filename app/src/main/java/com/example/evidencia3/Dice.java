package com.example.evidencia3;

import java.util.Random;

public class Dice
{
    private int numSidess;

    public Dice(int numSides)
    {
        this.numSidess = numSides;
    }

    public int roll()
    {
        Random random = new Random();
        int numberDetermined;

        numberDetermined = random.nextInt(numSidess);

        while(numberDetermined == 0)
        {
            numberDetermined = random.nextInt(numSidess);
        }

        return numberDetermined;
    }
}
