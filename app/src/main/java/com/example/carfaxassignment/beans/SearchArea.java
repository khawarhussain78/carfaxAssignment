
package com.example.carfaxassignment.beans;

import java.io.Serializable;
import java.util.List;
public class SearchArea implements Serializable {

    private String city;
    private List<Integer> dynamicRadii = null;
    private Boolean dynamicRadius;
    private Double latitude;
    private Double longitude;
    private Integer radius;
    private String state;
    private String zip;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Integer> getDynamicRadii() {
        return dynamicRadii;
    }

    public void setDynamicRadii(List<Integer> dynamicRadii) {
        this.dynamicRadii = dynamicRadii;
    }

    public Boolean getDynamicRadius() {
        return dynamicRadius;
    }

    public void setDynamicRadius(Boolean dynamicRadius) {
        this.dynamicRadius = dynamicRadius;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
