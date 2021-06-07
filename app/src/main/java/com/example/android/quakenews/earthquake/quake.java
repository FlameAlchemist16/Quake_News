package com.example.android.quakenews.earthquake;

import android.widget.TextView;

public class quake {
    private String mMagnitude, mDate, mPlace;

    public quake(String magnitude, String date, String place)
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
