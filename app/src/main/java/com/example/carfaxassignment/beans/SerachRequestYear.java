
package com.example.carfaxassignment.beans;

import java.io.Serializable;

public class SerachRequestYear implements Serializable {

    private Integer max;
    private Integer min;

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

}
