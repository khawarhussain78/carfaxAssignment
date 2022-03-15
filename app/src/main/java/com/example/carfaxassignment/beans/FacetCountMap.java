
package com.example.carfaxassignment.beans;


import java.io.Serializable;
import java.util.Map;

public class FacetCountMap implements Serializable {

    Map<String, Facet> facetMap = null;

    public Map<String, Facet> getFacetMap() {
        return facetMap;
    }

    public void setFacetMap(Map<String, Facet> facetMap) {
        this.facetMap = facetMap;
    }
}
