package com.example.pyramids;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

public class Pyramids extends Activity
{
    Deck deck;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        deck = new Deck(this);
        deck.setBackgroundColor(0xff999966);

        setContentView(deck);
        //setContentView(R.layout.main);
    }
}
