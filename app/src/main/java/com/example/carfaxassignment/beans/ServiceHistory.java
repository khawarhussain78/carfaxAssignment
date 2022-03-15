
package com.example.carfaxassignment.beans;

import java.io.Serializable;
import java.util.List;
public class ServiceHistory implements Serializable {

    private List<ServiceInnerHistory> history = null;
    private String icon;
    private String iconUrl;
    private Integer number;
    private String text;

    public List<ServiceInnerHistory> getHistory() {
        return history;
    }

    public void setHistory(List<ServiceInnerHistory> history) {
        this.history = history;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
