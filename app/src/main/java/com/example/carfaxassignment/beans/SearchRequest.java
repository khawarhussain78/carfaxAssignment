
package com.example.carfaxassignment.beans;

import java.io.Serializable;

public class SearchRequest implements Serializable {

    private String make;
    private MileageRange mileageRange;
    private String model;
    private PriceRange priceRange;
    private Integer radius;
    private String srpUrl;
    private String webHost;
    private SerachRequestYear yearRange;
    private String zip;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public MileageRange getMileageRange() {
        return mileageRange;
    }

    public void setMileageRange(MileageRange mileageRange) {
        this.mileageRange = mileageRange;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public PriceRange getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(PriceRange priceRange) {
        this.priceRange = priceRange;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public String getSrpUrl() {
        return srpUrl;
    }

    public void setSrpUrl(String srpUrl) {
        this.srpUrl = srpUrl;
    }

    public String getWebHost() {
        return webHost;
    }

    public void setWebHost(String webHost) {
        this.webHost = webHost;
    }

    public SerachRequestYear getYearRange() {
        return yearRange;
    }

    public void setYearRange(SerachRequestYear yearRange) {
        this.yearRange = yearRange;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
