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
        locations.add(new Location(R.string.restaurant1Name, R.string.restaurant1Price,
                R.drawable.headlight, R.string.restaurant1Info));
        locations.add(new Location(R.string.restaurant2Name, R.string.restaurant2Price,
                R.drawable.barrel, R.string.restaurant1Info));
        locations.add(new Location(R.string.restaurant3Name, R.string.restaurant3Price,
                R.drawable.benjamin, R.string.restaurant1Info));
        locations.add(new Location(R.string.restaurant4Name, R.string.restaurant4Price,
                R.drawable.atrium, R.string.restaurant1Info));
        locations.add(new Location(R.string.restaurant5Name, R.string.restaurant5Price,
                R.drawable.ileana, R.string.restaurant1Info));
        locations.add(new Location(R.string.restaurant6Name, R.string.restaurant6Price,
                R.drawable.old, R.string.restaurant1Info));
        locations.add(new Location(R.string.restaurant7Name, R.string.restaurant7Price,
                R.drawable.supermamma, R.string.restaurant1Info));
        locations.add(new Location(R.string.restaurant8Name, R.string.restaurant8Price,
                R.drawable.wein, R.string.restaurant1Info));


        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

//        // Set a click listener to play the audio when the list item is clicked on
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//
//
//
//                // Get the {@link Word} object at the given position the user clicked on
//                Location location = locations.get(position);
//
//
//            }
//        });

        return rootView;
    }
}
