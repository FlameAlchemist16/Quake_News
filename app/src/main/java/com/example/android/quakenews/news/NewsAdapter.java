package com.example.android.quakenews.news;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.example.android.quakenews.R;
import com.example.android.quakenews.earthquake.Quake;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<Quake> {

    private Integer magnitude;
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
        magnitude = Quake.getColor();
        TextView textView = (TextView) recycleView.findViewById(R.id.mag_color);
        switch (magnitude){
            case 1:
                textView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.mag1));
                break;
            case 2:
                textView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.mag2));
                break;
            case 3:
                textView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.mag3));
                break;
            case 4:
                textView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.mag4));
                break;
            case 5:
                textView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.mag5));
                break;
            case 6:
                textView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.mag6));
                break;
            case 7:
                textView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.mag7));
                break;
            case 8:
                textView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.mag8));
                break;
            case 9:
                textView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.mag9));
                break;
            case 10:
                textView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.mag10));
                break;
        }
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
