package com.example.pyramids;
import java.io.*;

public class Pyramids
{
    /*
    public static void main(String[] args)
    {
        InputStreamReader conv = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(conv);
        Deck deck = new Deck();
        String line = "";
        boolean gameOver = false;

        while (!gameOver)
        {
            try
            {
                deck.print();
                System.out.print("% ");
                line = in.readLine();
                switch (deck.move(line))
                {
                    case Deck.WON:
                        System.out.println("\n *** You won ***");
                        deck = new Deck(
                                deck.currentRound()+1,
                                deck.currentScore()
                                );
                        break;
                    case Deck.LOST:
                        System.out.println("\nYou lost.");
                        gameOver = true;
                        break;
                }
            } catch (IOException e) {}
        }
    }
    */
}
