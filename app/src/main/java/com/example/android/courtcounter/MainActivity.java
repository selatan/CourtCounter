package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreteamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreteamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForteamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }


    public void addThreeForTeamB(View view) {
        scoreteamB = scoreteamB + 3;
        displayForTeamB(scoreteamB);
    }

    public void addTwoForTeamB(View view) {
        scoreteamB = scoreteamB + 2;
        displayForTeamB(scoreteamB);
    }

    public void addOneForteamB(View view) {
        scoreteamB = scoreteamB + 1;
        displayForTeamB(scoreteamB);
    }

    public void forFree(View view) {
        scoreTeamA = 0;
        scoreteamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreteamB);
    }
}