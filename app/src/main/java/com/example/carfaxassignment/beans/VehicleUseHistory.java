
package com.example.carfaxassignment.beans;

import java.io.Serializable;
import java.util.List;
public class VehicleUseHistory implements Serializable {

    private List<VehicleUserInnerHistory> history = null;
    private String icon;
    private String iconUrl;
    private String text;

    public List<VehicleUserInnerHistory> getHistory() {
        return history;
    }

    public void setHistory(List<VehicleUserInnerHistory> history) {
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
