package com.example.android.quakenews;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.quakenews.earthquake.Quake;
import com.example.android.quakenews.news.NewsAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Quake> EQuakes = new ArrayList<>();
        EQuakes.add(new Quake("7.2", "San Francisco", "Feb 2, 2016"));
        EQuakes.add(new Quake("6.1", "London", "July 20, 2015"));
        EQuakes.add(new Quake("3.9", "Tokyo", "Nov 10, 2014"));
        EQuakes.add(new Quake("5.4", "Mexico City", "May 3, 2014"));
        EQuakes.add(new Quake("2.8", "Moscow", "Jan 31, 2013"));
        EQuakes.add(new Quake("4.9", "Rio de Janeiro", "Aug 19, 2012"));
        EQuakes.add(new Quake("1.6", "Paris", "Oct 30, 2011"));
        EQuakes.add(new Quake("7.2", "San Francisco", "Feb 2, 2016"));
        EQuakes.add(new Quake("6.1", "London", "July 20, 2015"));
        EQuakes.add(new Quake("3.9", "Tokyo", "Nov 10, 2014"));
        EQuakes.add(new Quake("5.4", "Mexico City", "May 3, 2014"));
        EQuakes.add(new Quake("2.8", "Moscow", "Jan 31, 2013"));
        EQuakes.add(new Quake("4.9", "Rio de Janeiro", "Aug 19, 2012"));
        EQuakes.add(new Quake("1.6", "Paris", "Oct 30, 2011"));
        EQuakes.add(new Quake("7.2", "San Francisco", "Feb 2, 2016"));
        EQuakes.add(new Quake("6.1", "London", "July 20, 2015"));
        EQuakes.add(new Quake("3.9", "Tokyo", "Nov 10, 2014"));
        EQuakes.add(new Quake("5.4", "Mexico City", "May 3, 2014"));
        EQuakes.add(new Quake("2.8", "Moscow", "Jan 31, 2013"));
        EQuakes.add(new Quake("4.9", "Rio de Janeiro", "Aug 19, 2012"));
        EQuakes.add(new Quake("1.6", "Paris", "Oct 30, 2011"));

        NewsAdapter newsAdapter = new NewsAdapter(MainActivity.this,EQuakes);

        ListView quakeList = (ListView) findViewById(R.id.list_of_quakes);
        quakeList.setAdapter(newsAdapter);
    }


}