
package com.example.carfaxassignment.beans;


import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class FirstPhoto implements Serializable {

    private String large;
    private String medium;
    private String small;


    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getSmall() {
        return small;
    }

}
