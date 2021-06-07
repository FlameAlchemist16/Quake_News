package com.example.android.quakenews.earthquake;

public class quake {
    private double mMagnitude;
    private long mDate;
    private String mPlace;

    public quake(double magnitude, long date, String place)
    {
        mMagnitude = magnitude;
        mDate = date;
        mPlace = place;
    }
    public double getMag()
    {
        return mMagnitude;
    }
    public long getDate()
    {
        return mDate;
    }

    public String getPlace()
    {
        return mPlace;
    }
}
