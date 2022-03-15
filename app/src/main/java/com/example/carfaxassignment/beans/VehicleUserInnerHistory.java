
package com.example.carfaxassignment.beans;

import java.io.Serializable;

public class VehicleUserInnerHistory implements Serializable {

    private Integer averageMilesPerYear;
    private Integer ownerNumber;
    private String useType;

    public Integer getAverageMilesPerYear() {
        return averageMilesPerYear;
    }

    public void setAverageMilesPerYear(Integer averageMilesPerYear) {
        this.averageMilesPerYear = averageMilesPerYear;
    }

    public Integer getOwnerNumber() {
        return ownerNumber;
    }

    public void setOwnerNumber(Integer ownerNumber) {
        this.ownerNumber = ownerNumber;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

}
