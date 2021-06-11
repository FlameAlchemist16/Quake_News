package com.example.android.quakenews.news;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.android.quakenews.R;
import com.example.android.quakenews.earthquake.Quake;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<Quake> {

    public NewsAdapter(Activity context, ArrayList<Quake> Quake)
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
        Quake Quake = getItem(position);
        TextView mag = (TextView) recycleView.findViewById(R.id.mag);
        mag.setText(Quake.getMag());

        TextView dir = (TextView) recycleView.findViewById(R.id.quake_at);
        dir.setText(Quake.getDir());

        TextView place = (TextView) recycleView.findViewById(R.id.place);
        place.setText(Quake.getPlace());

        TextView date = (TextView) recycleView.findViewById(R.id.day);
        date.setText(Quake.getDate());

        return recycleView;
    }
}
