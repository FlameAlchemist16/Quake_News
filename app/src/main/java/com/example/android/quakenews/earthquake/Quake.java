package com.example.android.quakenews.earthquake;

public class Quake {
    private String mPlace, mMagnitude, mDate;;
    public Quake(double magnitude, String place, String date)
    {
        mMagnitude = Double.toString(magnitude);
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
