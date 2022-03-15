
package com.example.carfaxassignment.beans;

import java.io.Serializable;

public class OnePriceArrow implements Serializable {

    private String arrow;
    private String arrowUrl;
    private String icon;
    private String iconUrl;
    private Integer order;
    private String text;

    public String getArrow() {
        return arrow;
    }

    public void setArrow(String arrow) {
        this.arrow = arrow;
    }

    public String getArrowUrl() {
        return arrowUrl;
    }

    public void setArrowUrl(String arrowUrl) {
        this.arrowUrl = arrowUrl;
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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
