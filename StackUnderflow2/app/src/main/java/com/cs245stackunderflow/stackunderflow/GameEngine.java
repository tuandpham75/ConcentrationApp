package com.cs245stackunderflow.stackunderflow;

import java.util.ArrayList;

/**
 * Created by Nick on 11/17/2016.
 */

public class GameEngine {


    private int points;
    private boolean match;
    private int amountOfCards;
    private int matchCount;




    public GameEngine(int amount)
    {
        match = false;
        points = 0;
        matchCount = 0;
        amountOfCards = amount;


    }



    public boolean isMatch(Card c1,Card c2)
    {
        if(c1.isFaceUp() == true && c2.isFaceUp() == true && c1.getCardID() == c2.getCardID())
        {
            points+=2;
            matchCount++;
            return true;
        }
        else
        {
            if (points > 0) {
                points -= 1;
            }
            return false;
        }
    }

    public boolean isOver()
    {
        if(matchCount ==  amountOfCards/2)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public int getScore()
    {
        return points;
    }

    public int getAmountOfCards()
    {
        return amountOfCards;
    }

}
