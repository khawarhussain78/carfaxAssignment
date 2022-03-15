
package com.example.carfaxassignment.beans;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;
public class Images implements Serializable {

    private String baseUrl;
    private FirstPhoto firstPhoto;
    private List<String> large = null;
    private List<String> medium = null;
    private List<String> small = null;



    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public FirstPhoto getFirstPhoto() {
        return firstPhoto;
    }

    public void setFirstPhoto(FirstPhoto firstPhoto) {
        this.firstPhoto = firstPhoto;
    }

    public List<String> getLarge() {
        return large;
    }

    public void setLarge(List<String> large) {
        this.large = large;
    }

    public List<String> getMedium() {
        return medium;
    }

    public void setMedium(List<String> medium) {
        this.medium = medium;
    }

    public List<String> getSmall() {
        return small;
    }

    public void setSmall(List<String> small) {
        this.small = small;
    }

}
