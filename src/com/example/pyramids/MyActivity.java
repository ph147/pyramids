package com.example.pyramids;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

public class MyActivity extends Activity
{
    Deck deck;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        deck = new Deck(this);
        deck.setBackgroundColor(Color.WHITE);

        setContentView(deck);
        //setContentView(R.layout.main);
    }
}
