package com.example.carfaxassignment.beans;

import java.io.Serializable;
import java.util.List;

public class CarListings implements Serializable {

    List<Listing> listings = null;

    public List<Listing> getListings() {
        return listings;
    }

    public void setListings(List<Listing> listings) {
        this.listings = listings;
    }
}
