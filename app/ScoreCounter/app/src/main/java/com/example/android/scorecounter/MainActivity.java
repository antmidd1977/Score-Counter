package com.example.android.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int homeScore = 0;


    int visitorScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public void displayForHome(int score) {
        TextView scoreView = findViewById(R.id.score_home);
        scoreView.setText(String.valueOf(score));
    }

    public void touchdownForHome(View v) {
        homeScore = homeScore + 7;
        displayForHome(homeScore);
    }
    public void fieldGoalForHome(View v) {
        homeScore = homeScore + 3;
        displayForHome(homeScore);
    }

    public void extraPointForHome(View v) {
        homeScore = homeScore + 1;
        displayForHome(homeScore);
    }

    public void setVisitorScore(int visitorScore) {
        this.visitorScore = visitorScore;
    }

    public void displayForVisitor(int score) {
        TextView scoreView = findViewById(R.id.score_visitor);
        scoreView.setText(String.valueOf(score));
    }

    public int getVisitorScore() {
        return visitorScore;
    }

    public int getHomeScore() {

        return homeScore;
    }

    public void touchdownForVisitor(View v) {
        visitorScore = visitorScore + 7;
        displayForVisitor(visitorScore);
    }
    public void fieldGoalForVisitor(View v) {
        visitorScore = visitorScore + 3;
        displayForVisitor(visitorScore);
    }

    public void extraPointForVisitor(View v) {
        visitorScore = visitorScore + 1;
        displayForVisitor(visitorScore);

    }

    public void restart(View v) {
        homeScore = 0;
        visitorScore = 0;
        displayForHome(homeScore);
        displayForVisitor(visitorScore);
    }
}
