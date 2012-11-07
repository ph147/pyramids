package com.example.pyramids;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class Pyramids extends Activity
{
    Deck deck;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int height = displaymetrics.heightPixels;
        int width = displaymetrics.widthPixels;

        deck = new Deck(this, width, height);
        deck.setBackgroundColor(0xff999966);

        setContentView(deck);
        //setContentView(R.layout.main);
    }
}
