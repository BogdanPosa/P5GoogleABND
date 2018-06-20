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
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

import static android.util.Log.i;

/**
 * {@link Fragment} that displays a list of color vocabulary words.
 */
public class LandmarksFragment extends Fragment {

    TextView textView2;

    public LandmarksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        // Create a list of landmarks
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.landmark1Name, R.string.landmark1Price,
                R.drawable.transfagarasan, R.string.landmark1info));
        locations.add(new Location(R.string.landmark2Name, R.string.landmark2Price,
                R.drawable.lies, R.string.landmark2info));
        locations.add(new Location(R.string.landmark3Name, R.string.landmark3Price,
                R.drawable.astra, R.string.landmark3info));
        locations.add(new Location(R.string.landmark4Name, R.string.landmark4Price,
                R.drawable.piatamare, R.string.landmark4info));
        locations.add(new Location(R.string.landmark5Name, R.string.landmark5Price,
                R.drawable.bruck, R.string.landmark5info));
        locations.add(new Location(R.string.landmark6Name, R.string.landmark6Price,
                R.drawable.counciltower, R.string.landmark6info));
        locations.add(new Location(R.string.landmark7Name, R.string.landmark7Price,
                R.drawable.istorienaturala, R.string.landmark7info));
        locations.add(new Location(R.string.landmark8Name, R.string.landmark8Price,
                R.drawable.pasaj, R.string.landmark8info));
        locations.add(new Location(R.string.landmark9Name, R.string.landmark9Price,
                R.drawable.beststreet, R.string.landmark9info));
        locations.add(new Location(R.string.landmark10Name, R.string.landmark10Price,
                R.drawable.ursuline, R.string.landmark10info));

        textView2 = rootView.findViewById(R.id.location_info);

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);



//        // Set a click listener to show info when the list item is clicked on
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//
//                // Get the {@link Word} object at the given position the user clicked on
//                Location location = locations.get(position);
//
//            }
//        });

        return rootView;
    }
}
