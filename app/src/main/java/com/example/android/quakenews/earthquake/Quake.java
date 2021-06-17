package com.example.android.quakenews.earthquake;

public class Quake {
    private String mDir, mPlace, mMagnitude, mDate, mUrl;
    private Integer mag;
    public Quake(double magnitude, String place, String date, String url)
    {
        mag = (int) Math.floor(magnitude);
        mMagnitude = Double.toString(magnitude);
        mDate = date;
        mUrl =url;
        int loc = place.indexOf("of");
        if(loc>=0&&loc<place.length()){
            mDir = place.substring(0, loc+2);
            mPlace = place.substring(loc+3);
        }
        else{
            mDir = "";
            mPlace = place;
        }
    }
    public String getMag() { return mMagnitude; }
    public String getDate() { return mDate; }
    public String getDir() { return mDir;}
    public String getPlace() { return mPlace; }
    public Integer getColor() { return mag; }
    public String getUrl() { return mUrl; }
}
