package com.example.android.soccerstatista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalTeamA = 0;
    int shotTeamA = 0;
    int foulTeamA = 0;

    int goalTeamB = 0;
    int shotTeamB = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Increase a goal for Team A.
    public void addGoalForTeamA(View v) {
        goalTeamA = goalTeamA + 1;
        displayGoalForTeamA(goalTeamA);
    }

    //Increase a shot for Team A.
    public void addShotForTeamA(View v) {
        shotTeamA = shotTeamA + 1;
        displayShotForTeamA(shotTeamA);
    }

    //Increase a foul for Team A.
    public void addFoulForTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    //---

    //Increase a goal for Team B.
    public void addGoalForTeamB(View v) {
        goalTeamB = goalTeamB + 1;
        displayGoalForTeamB(goalTeamB);
    }

    //Increase a shot for Team B.
    public void addShotForTeamB(View v) {
        shotTeamB = shotTeamB + 1;
        displayShotForTeamB(shotTeamB);
    }

    //Increase a foul for Team B.
    public void addFoulForTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }

    //---------------------------------------

    // Resets the fields back to 0 for both teams.

    public void resetScore(View v) {
        goalTeamA = 0;
        shotTeamA = 0;
        foulTeamA = 0;

        goalTeamB = 0;
        shotTeamB = 0;
        foulTeamB = 0;

        displayGoalForTeamA(goalTeamA);
        displayShotForTeamA(shotTeamA);
        displayFoulForTeamA(foulTeamA);

        displayGoalForTeamB(goalTeamB);
        displayShotForTeamB(shotTeamB);
        displayFoulForTeamB(foulTeamB);
    }


    //Displays the given goals for Team A.
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goals);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given shots for Team A.
    public void displayShotForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_shots);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given fouls for Team A.
    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }

    //---

    //Displays the given goals for Team B.
    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goals);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given shots for Team B.
    public void displayShotForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_shots);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given fouls for Team B.
    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }


}
