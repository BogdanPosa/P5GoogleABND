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


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of color vocabulary words.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.landmark1Name, R.string.landmark2Price,
                R.drawable.transfagarasan, R.string.landmark2info));
        locations.add(new Location(R.string.landmark1Name, R.string.landmark2Price,
                R.drawable.transfagarasan, R.string.landmark2info));
        locations.add(new Location(R.string.landmark1Name, R.string.landmark2Price,
                R.drawable.transfagarasan, R.string.landmark2info));
        locations.add(new Location(R.string.landmark1Name, R.string.landmark2Price,
                R.drawable.transfagarasan, R.string.landmark2info));
        locations.add(new Location(R.string.landmark1Name, R.string.landmark2Price,
                R.drawable.transfagarasan, R.string.landmark2info));
        locations.add(new Location(R.string.landmark1Name, R.string.landmark2Price,
                R.drawable.transfagarasan, R.string.landmark2info));
        locations.add(new Location(R.string.landmark1Name, R.string.landmark2Price,
                R.drawable.transfagarasan, R.string.landmark2info));
        locations.add(new Location(R.string.landmark1Name, R.string.landmark2Price,
                R.drawable.transfagarasan, R.string.landmark2info));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {



                // Get the {@link Word} object at the given position the user clicked on
                Location location = locations.get(position);


            }
        });

        return rootView;
    }




}
