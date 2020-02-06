package com.example.venadostest.retrofit.Model;

import android.widget.ImageView;

import java.util.Date;

public class Games {

    private boolean local;
    private String Opponent;
    private ImageView opponent_image;
    private Date datetime;
    private String league;
    private ImageView image;
    private int home_score;
    private int aways_core;


    public boolean getlocal() {
        return local;
    }

    public String getOpponent() {
        return Opponent;
    }

    public ImageView getOpponent_image() {
        return opponent_image;
    }

    public Date getDatetime(){ return  datetime;}


    public String getLeague() {
        return league;
    }

    public ImageView getImagea() {
        return image;
    }

    public int getHome_score() {
        return home_score;
    }

    public int aways_core() {
        return aways_core;
    }
}
