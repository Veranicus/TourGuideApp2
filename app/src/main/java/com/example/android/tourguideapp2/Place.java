package com.example.android.tourguideapp2;

/**
 * Created by Polacek on 6.7.2017.
 */

public class Place {

    /**
     * This is a string resource id that stores names of different interesting places in given town
     * London
     **/
    private int mNamesOfPlacesId;

    /**
     * This is a string resource id to stores information of different interesting places in given
     * town
     */
    private int mInformationOfPlacesId;


    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new Place object.
     *
     * @param namesOfPlacesId       This is a string resource id that stores names of different interesting
     *                              places in given town
     *                              London
     * @param informationOfPlacesId This is a string resource id to stores information of different
     *                              interesting places in given
     *                              town
     * @param imageResourceId       is the drawable resource ID for the image associated with the places
     **/

    public Place(int namesOfPlacesId, int informationOfPlacesId, int imageResourceId) {
        mNamesOfPlacesId = namesOfPlacesId;
        mInformationOfPlacesId = informationOfPlacesId;
        mImageResourceId = imageResourceId;

    }


    public int getNamesOfPlacesId() {
        return mNamesOfPlacesId;
    }

    public int getInformationOfPlacesId() {
        return mInformationOfPlacesId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}