
package com.example.carfaxassignment.beans;

import java.io.Serializable;

public class History implements Serializable {

    private String city;
    private String endOwnershipDate;
    private Integer ownerNumber;
    private String purchaseDate;
    private String state;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEndOwnershipDate() {
        return endOwnershipDate;
    }

    public void setEndOwnershipDate(String endOwnershipDate) {
        this.endOwnershipDate = endOwnershipDate;
    }

    public Integer getOwnerNumber() {
        return ownerNumber;
    }

    public void setOwnerNumber(Integer ownerNumber) {
        this.ownerNumber = ownerNumber;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
