
package com.example.carfaxassignment.beans;


import java.io.Serializable;

public class Fiat124SpiderTrimLevel implements Serializable {

    private Integer count;
    private String text;
    private String url;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

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
