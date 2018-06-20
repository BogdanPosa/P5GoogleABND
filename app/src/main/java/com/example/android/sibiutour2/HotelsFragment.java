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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of hotels
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.hotel1Name, R.string.hotel1Price,
                R.drawable.conti));
        locations.add(new Location(R.string.hotel2Name, R.string.hotel2Price,
                R.drawable.frieda));
        locations.add(new Location(R.string.hotel3Name, R.string.hotel3Price,
                R.drawable.golden));
        locations.add(new Location(R.string.hotel4Name, R.string.hotel4Price,
                R.drawable.rubin));
        locations.add(new Location(R.string.hotel5Name, R.string.hotel5Price,
                R.drawable.hilton));
        locations.add(new Location(R.string.hotel6Name, R.string.hotel6Price,
                R.drawable.ramada));
        locations.add(new Location(R.string.hotel7Name, R.string.hotel7Price,
                R.drawable.silva));
        locations.add(new Location(R.string.hotel8Name, R.string.hotel8Price,
                R.drawable.vestem));


        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
