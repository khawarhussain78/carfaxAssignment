
package com.example.carfaxassignment.beans;


import java.io.Serializable;

public class Facet implements Serializable {

    private String encodedName;
    private String name;
    private Integer value;

    public String getEncodedName() {
        return encodedName;
    }

    public void setEncodedName(String encodedName) {
        this.encodedName = encodedName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}
