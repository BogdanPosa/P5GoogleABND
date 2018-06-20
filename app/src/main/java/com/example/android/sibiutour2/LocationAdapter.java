/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sibiutour2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * {@link LocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Location} objects.
 */
public class LocationAdapter extends ArrayAdapter<Location> {


    /**
     * Create a new {@link LocationAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param locations is the list of {@link Location}s to be displayed.
     */
    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Location} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID location_name_text_view.
        TextView locationName = listItemView.findViewById(R.id.location_name_text_view);
        // Get the location name from the currentLocation object and set this text on
        // the locationName TextView.
        locationName.setText(currentLocation.getLocationName());

        // Find the TextView in the list_item.xml layout with the ID location_price_text_view.
        TextView locationPrice = listItemView.findViewById(R.id.location_price_text_view);
        // Get the price from the currentLocation object and set this text on
        // the locationPrice TextView.
        locationPrice.setText(currentLocation.getLocationPrice());


        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.image);
        // Display the provided image based on the resource ID
        imageView.setImageResource(currentLocation.getImageResourceId());
        return listItemView;
    }
}