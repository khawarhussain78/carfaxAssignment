
package com.example.carfaxassignment.beans;


import java.io.Serializable;
import java.util.List;

public class CarModel implements Serializable {

    private Integer backfillCount;
    private List<BreadCrumb> breadCrumbs = null;
    private Integer dealerNewCount;
    private Integer dealerUsedCount;
    private Integer enhancedCount;
    private FacetCountMap facetCountMap;
    private List<Listing> listings = null;
    private Integer page;
    private Integer pageSize;
    private RelatedLinks relatedLinks;
    private SearchArea searchArea;
    private SearchRequest searchRequest;
    private String seoUrl;
    private Integer totalListingCount;
    private Integer totalPageCount;

    public Integer getBackfillCount() {
        return backfillCount;
    }

    public void setBackfillCount(Integer backfillCount) {
        this.backfillCount = backfillCount;
    }

    public List<BreadCrumb> getBreadCrumbs() {
        return breadCrumbs;
    }

    public void setBreadCrumbs(List<BreadCrumb> breadCrumbs) {
        this.breadCrumbs = breadCrumbs;
    }

    public Integer getDealerNewCount() {
        return dealerNewCount;
    }

    public void setDealerNewCount(Integer dealerNewCount) {
        this.dealerNewCount = dealerNewCount;
    }

    public Integer getDealerUsedCount() {
        return dealerUsedCount;
    }

    public void setDealerUsedCount(Integer dealerUsedCount) {
        this.dealerUsedCount = dealerUsedCount;
    }

    public Integer getEnhancedCount() {
        return enhancedCount;
    }

    public void setEnhancedCount(Integer enhancedCount) {
        this.enhancedCount = enhancedCount;
    }

    public FacetCountMap getFacetCountMap() {
        return facetCountMap;
    }

    public void setFacetCountMap(FacetCountMap facetCountMap) {
        this.facetCountMap = facetCountMap;
    }

    public List<Listing> getListings() {
        return listings;
    }

    public void setListings(List<Listing> listings) {
        this.listings = listings;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public RelatedLinks getRelatedLinks() {
        return relatedLinks;
    }

    public void setRelatedLinks(RelatedLinks relatedLinks) {
        this.relatedLinks = relatedLinks;
    }

    public SearchArea getSearchArea() {
        return searchArea;
    }

    public void setSearchArea(SearchArea searchArea) {
        this.searchArea = searchArea;
    }

    public SearchRequest getSearchRequest() {
        return searchRequest;
    }

    public void setSearchRequest(SearchRequest searchRequest) {
        this.searchRequest = searchRequest;
    }

    public String getSeoUrl() {
        return seoUrl;
    }

    public void setSeoUrl(String seoUrl) {
        this.seoUrl = seoUrl;
    }

    public Integer getTotalListingCount() {
        return totalListingCount;
    }

    public void setTotalListingCount(Integer totalListingCount) {
        this.totalListingCount = totalListingCount;
    }

    public Integer getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(Integer totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

}
