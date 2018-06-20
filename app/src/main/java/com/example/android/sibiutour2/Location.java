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

/**
 * {@link Location} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the location name, price, image and info
 *
 */
public class Location {

    /** String resource ID for the default translation of the word */
    private int mLocationName;

    /**
     * String resource ID for the location name of the location
     */
    private int mLocationPrice;

    /** String resource ID for the location price of the location */
    private int mLocationInfo;

    /**
     * String resource ID for the location image of the location
     */
    private int mImageResourceId;


    /**
     * Create a new Location object.
     *
     * @param locationName is the string resource ID for the Location name
     * @param locationPrice is the string resource Id for the price of the location.
     * @param imageResourceId is the drawable resource ID for the image associated with the location
     */
    public Location(int locationName, int locationPrice, int imageResourceId, int locationInfo) {
        mLocationName = locationName;
        mLocationPrice = locationPrice;
        mImageResourceId = imageResourceId;
        mLocationInfo = locationInfo;
    }

    /**
     * Get the string resource ID for the name of the location.
     */
    public int getLocationName() {
        return mLocationName;
    }

    /**
     * Get the string resource ID for the price of the location.
     */
    public int getLocationPrice() {
        return mLocationPrice;
    }

    /**
     * Get the string resource ID for the info of the location.
     */
    public int getLocationInfo() {
        return mLocationInfo;
    }

    /**
     * Return the image resource ID of the location.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}