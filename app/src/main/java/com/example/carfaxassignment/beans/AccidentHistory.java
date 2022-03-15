
package com.example.carfaxassignment.beans;

import java.io.Serializable;
import java.util.List;

public class AccidentHistory implements Serializable {

    private List<String> accidentSummary = null;
    private String icon;
    private String iconUrl;
    private String text;

    public List<String> getAccidentSummary() {
        return accidentSummary;
    }

    public void setAccidentSummary(List<String> accidentSummary) {
        this.accidentSummary = accidentSummary;
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
