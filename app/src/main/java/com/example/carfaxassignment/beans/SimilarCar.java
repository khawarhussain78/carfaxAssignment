
package com.example.carfaxassignment.beans;

import java.io.Serializable;

public class SimilarCar implements Serializable {

    private String text;
    private String url;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
