package com.example.android.quakenews.news;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.quakenews.R;
import com.example.android.quakenews.earthquake.quake;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<quake> {

    public NewsAdapter(Activity context, ArrayList<quake> Quake)
    {
        super(context, 0, Quake);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View recycleView = convertView;
        if(recycleView == null){
            recycleView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view_modifier, parent, false);
        }
        quake Quake = getItem(position);
        TextView mag = (TextView) recycleView.findViewById(R.id.mag);
        mag.setText(Quake.getMag());

        TextView place = (TextView) recycleView.findViewById(R.id.place);
        place.setText(Quake.getPlace());

        TextView date = (TextView) recycleView.findViewById(R.id.day);
        date.setText(Quake.getDate());

        return recycleView;
    }
}
