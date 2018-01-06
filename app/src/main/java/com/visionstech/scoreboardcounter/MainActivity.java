package com.visionstech.scoreboardcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreA = 0;
    private int scoreB = 0;
    private int yellowA = 0;
    private int yellowB = 0;
    private int redA = 0;
    private int redB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addGoalA(View view) {
        scoreA += 1;
        scoreForTeamA(scoreA);
    }

    public void addGoalB(View view) {
        scoreB += 1;
        scoreForTeamB(scoreB);
    }

    public void addYellowCardA(View view) {
        yellowA += 1;
        cardYellowA(yellowA);
    }

    public void addYellowCardB(View view) {
        yellowB += 1;
        cardYellowB(yellowB);
    }

    public void addRedCardA(View view) {
        redA += 1;
        cardRedA(redA);
    }

    public void addRedCardB(View view) {
        redB += 1;
        cardRedB(redB);
    }


    public void scoreForTeamA(int score) {
        TextView scoreA = (TextView) findViewById(R.id.team_a_score);
        scoreA.setText(String.valueOf(score));
    }

    public void scoreForTeamB(int score) {
        TextView scoreB = (TextView) findViewById(R.id.team_b_score);
        scoreB.setText(String.valueOf(score));
    }

    public void cardYellowA(int score) {
        TextView yellowCardA = (TextView) findViewById(R.id.team_a_yellow);
        yellowCardA.setText(String.valueOf(score));
    }

    public void cardYellowB(int score) {
        TextView yellowCardB = (TextView) findViewById(R.id.team_b_yellow);
        yellowCardB.setText(String.valueOf(score));
    }

    public void cardRedA(int score) {
        TextView redCardA = (TextView) findViewById(R.id.team_a_red);
        redCardA.setText(String.valueOf(score));
    }

    public void cardRedB(int score) {
        TextView redCardB = (TextView) findViewById(R.id.team_b_red);
        redCardB.setText(String.valueOf(score));
    }


    /**
     * Method for saving data.
     */
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
        // Save the user's current game state
        savedInstanceState.putInt("StateScoreA", scoreA);
        savedInstanceState.putInt("StateScoreB", scoreB);
        savedInstanceState.putInt("StateYellowA", yellowA);
        savedInstanceState.putInt("StateYellowA", yellowB);
        savedInstanceState.putInt("StateRedA", redA);
        savedInstanceState.putInt("StateRedA", redB);
    }


    /**
     * Method for restoring and displaying data after switching device orientation.
     */
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        if (savedInstanceState != null) {
            scoreA = savedInstanceState.getInt("StateScoreA");
            scoreB = savedInstanceState.getInt("StateScoreB");
            yellowA = savedInstanceState.getInt("StateYellowA");
            yellowB = savedInstanceState.getInt("StateYellowB");
            redA = savedInstanceState.getInt("StateRedA");
            redB = savedInstanceState.getInt("StateRedB");
        }
        scoreForTeamA(scoreA);
        scoreForTeamB(scoreB);
        cardYellowA(yellowA);
        cardYellowB(yellowB);
        cardRedA(redA);
        cardRedB(redB);

    }

    public void resetScore(View view) {
        scoreA = 0;
        scoreB = 0;
        yellowA = 0;
        yellowB = 0;
        redA = 0;
        redB = 0;
        scoreForTeamA(scoreA);
        scoreForTeamB(scoreB);
        cardYellowA(yellowA);
        cardYellowB(yellowB);
        cardRedA(redA);
        cardRedB(redA);
    }
}
