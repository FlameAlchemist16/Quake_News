package com.example.android.quakenews.earthquake;

public class Quake {
    private String mPlace, mMagnitude, mDate;;
    public Quake(double magnitude, String place, long date)
    {
        mMagnitude = Double.toString(magnitude);
        mDate = Long.toString(date);
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
