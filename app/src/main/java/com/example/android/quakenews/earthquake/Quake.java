package com.example.android.quakenews.earthquake;

public class Quake {
    private String mMagnitude, mDate, mPlace;

    public Quake(String magnitude, String place, String date)
    {
        mMagnitude = magnitude;
        mDate = date;
        mPlace = place;
    }
    public String getMag()
    {
        return mMagnitude;
    }
    public String getDate()
    {
        return mDate;
    }

    public String getPlace()
    {
        return mPlace;
    }
}
