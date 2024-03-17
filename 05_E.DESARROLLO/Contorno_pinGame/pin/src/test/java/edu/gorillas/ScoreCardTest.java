package edu.gorillas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScoreCardTest {

    private ScoreCard scoreCard = null;

    /* -------------- TESTING BEHAVIOURS -------------------*/

    @BeforeEach
    public void init() {
        scoreCard = new ScoreCard();
    }

    @Test

    public void calculateScoreTest() {
        scoreCard.setScoreCard("12345123451234512345");
        int totalScore = scoreCard.calculateScore();
        assertEquals(60, totalScore);
    }
    
    @Test

    public void calculatePerfectTest() {
        scoreCard.setScoreCard("XXXXXXXXXXXX");
        int totalScore = scoreCard.calculateScore();
        assertEquals(300, totalScore);
    }


    
}