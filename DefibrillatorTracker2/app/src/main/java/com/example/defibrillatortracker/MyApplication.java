package com.example.defibrillatortracker;

import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {

    //only one instance allowed
    private static MyApplication singleton;

    private List<Location> myLocations;

    public void setMyLocations(List<Location> myLocations) {
        this.myLocations = myLocations;
    }

    public List<Location> getMyLocations() {
        return myLocations;
    }

    public MyApplication getInstance() {
        return singleton;
    }


    public void onCreate() {
        super.onCreate();
        singleton = this;
        myLocations = new ArrayList<>();
    }

}