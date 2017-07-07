package com.example.android.tourguideapp2;

/**
 * Created by Polacek on 6.7.2017.
 */

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Polacek on 6.7.2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;

    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
    }

    Place currentPlace = getItem(position);

    // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
    TextView namesTextView = (TextView) listItemView.findViewById(R.id.names_text_view);
    // Get the Miwok translation from the currentWord object and set this text on
    // the Miwok TextView.
        miwokTextView.setText(currentWord.getMiwokTranslationId());
}
