
package com.example.carfaxassignment.beans;


import java.io.Serializable;

public class BreadCrumb implements Serializable {

    private String label;
    private String link;
    private Integer position;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

}
