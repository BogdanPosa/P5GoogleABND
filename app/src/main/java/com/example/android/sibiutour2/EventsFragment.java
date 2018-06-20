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
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of color vocabulary words.
 */
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.event1Name, R.string.event1Price,
                R.drawable.theatre));
        locations.add(new Location(R.string.event2Name, R.string.event2Price,
                R.drawable.astramovie));
        locations.add(new Location(R.string.event3Name, R.string.event3Price,
                R.drawable.christmas));
        locations.add(new Location(R.string.event4Name, R.string.event4Price,
                R.drawable.jazz));
        locations.add(new Location(R.string.event5Name, R.string.event5Price,
                R.drawable.rally));
        locations.add(new Location(R.string.event6Name, R.string.event6Price,
                R.drawable.cibin));
        locations.add(new Location(R.string.event7Name, R.string.event7Price,
                R.drawable.romaniacs));
        locations.add(new Location(R.string.event8Name, R.string.event8Price,
                R.drawable.full));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter}  so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
