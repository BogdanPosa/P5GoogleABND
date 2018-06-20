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
public class LandmarksFragment extends Fragment {

    public LandmarksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        // Create a list of landmarks
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.landmark1Name, R.string.landmark1Price,
                R.drawable.transfagarasan));
        locations.add(new Location(R.string.landmark2Name, R.string.landmark2Price,
                R.drawable.lies));
        locations.add(new Location(R.string.landmark3Name, R.string.landmark3Price,
                R.drawable.astra));
        locations.add(new Location(R.string.landmark4Name, R.string.landmark4Price,
                R.drawable.piatamare));
        locations.add(new Location(R.string.landmark5Name, R.string.landmark5Price,
                R.drawable.bruck));
        locations.add(new Location(R.string.landmark6Name, R.string.landmark6Price,
                R.drawable.counciltower));
        locations.add(new Location(R.string.landmark7Name, R.string.landmark7Price,
                R.drawable.istorienaturala));
        locations.add(new Location(R.string.landmark8Name, R.string.landmark8Price,
                R.drawable.pasaj));
        locations.add(new Location(R.string.landmark9Name, R.string.landmark9Price,
                R.drawable.beststreet));
        locations.add(new Location(R.string.landmark10Name, R.string.landmark10Price,
                R.drawable.ursuline));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
