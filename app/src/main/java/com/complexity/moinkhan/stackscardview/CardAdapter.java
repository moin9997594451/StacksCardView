package com.complexity.moinkhan.stackscardview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

/**
 * Created by moin khan on 9/17/2017.
 */

public class CardAdapter extends ArrayAdapter<Integer> {
    public CardAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ImageView imgView = (ImageView) convertView.findViewById(R.id.image_content);
        imgView.setImageResource(getItem(position));
        return convertView;
    }
}
