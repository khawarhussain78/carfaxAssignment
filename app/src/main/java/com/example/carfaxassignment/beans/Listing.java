
package com.example.carfaxassignment.beans;


import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;
public class Listing implements Serializable {

    private AccidentHistory accidentHistory;
    private Boolean advantage;
    private List<String> atomOtherOptions = null;
    private List<String> atomTopOptions = null;
    private Boolean backfill;
    private String badge;
    private String bedLength;
    private String bodytype;
    private String cabType;
    private Boolean certified;
    private Integer currentPrice;
    private Dealer dealer;
    private String dealerType;
    private String displacement;
    private Double distanceToDealer;
    private String drivetype;
    private String engine;
    private String exteriorColor;
    private String firstSeen;
    private Integer followCount;
    private Long followedAt;
    private Boolean following;
    private String fuel;
    private Boolean hasViewed;
    private String id;
    private Integer imageCount;
    private Images images;
    private String interiorColor;
    private Boolean isEnriched;
    private Boolean isOemPromoted;
    private Boolean isOemRefundFlag;
    private Integer listPrice;
    private String make;
    private Integer mileage;
    private String model;
    private MonthlyPaymentEstimate monthlyPaymentEstimate;
    private Integer mpgCity;
    private Integer mpgHighway;
    private Boolean noAccidents;
    private Boolean oneOwner;
    private Integer onePrice;
    private List<OnePriceArrow> onePriceArrows = null;
    private Boolean onlineOnly;
    private OwnerHistory ownerHistory;
    private Boolean personalUse;
    private Boolean placed;
    private String recordType;
    private Boolean sentLead;
    private ServiceHistory serviceHistory;
    private Boolean serviceRecords;
    private Double sortScore;
    private String stockNumber;
    private String subTrim;
    private List<String> topOptions = null;
    private Double tpCostPerVdp;
    private Boolean tpEligible;
    private String transmission;
    private String trim;
    private String vdpUrl;
    private String vehicleCondition;
    private VehicleUseHistory vehicleUseHistory;
    private String vin;
    private String windowSticker;
    private Integer year;
    private String listingStatus;



    public AccidentHistory getAccidentHistory() {
        return accidentHistory;
    }

    public void setAccidentHistory(AccidentHistory accidentHistory) {
        this.accidentHistory = accidentHistory;
    }

    public Boolean getAdvantage() {
        return advantage;
    }

    public void setAdvantage(Boolean advantage) {
        this.advantage = advantage;
    }

    public List<String> getAtomOtherOptions() {
        return atomOtherOptions;
    }

    public void setAtomOtherOptions(List<String> atomOtherOptions) {
        this.atomOtherOptions = atomOtherOptions;
    }

    public List<String> getAtomTopOptions() {
        return atomTopOptions;
    }

    public void setAtomTopOptions(List<String> atomTopOptions) {
        this.atomTopOptions = atomTopOptions;
    }

    public Boolean getBackfill() {
        return backfill;
    }

    public void setBackfill(Boolean backfill) {
        this.backfill = backfill;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public String getBedLength() {
        return bedLength;
    }

    public void setBedLength(String bedLength) {
        this.bedLength = bedLength;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    public String getCabType() {
        return cabType;
    }

    public void setCabType(String cabType) {
        this.cabType = cabType;
    }

    public Boolean getCertified() {
        return certified;
    }

    public void setCertified(Boolean certified) {
        this.certified = certified;
    }

    public Integer getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Integer currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public String getDealerType() {
        return dealerType;
    }

    public void setDealerType(String dealerType) {
        this.dealerType = dealerType;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public Double getDistanceToDealer() {
        return distanceToDealer;
    }

    public void setDistanceToDealer(Double distanceToDealer) {
        this.distanceToDealer = distanceToDealer;
    }

    public String getDrivetype() {
        return drivetype;
    }

    public void setDrivetype(String drivetype) {
        this.drivetype = drivetype;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(String firstSeen) {
        this.firstSeen = firstSeen;
    }

    public Integer getFollowCount() {
        return followCount;
    }

    public void setFollowCount(Integer followCount) {
        this.followCount = followCount;
    }

    public Long getFollowedAt() {
        return followedAt;
    }

    public void setFollowedAt(Long followedAt) {
        this.followedAt = followedAt;
    }

    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Boolean getHasViewed() {
        return hasViewed;
    }

    public void setHasViewed(Boolean hasViewed) {
        this.hasViewed = hasViewed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getImageCount() {
        return imageCount;
    }

    public void setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public Boolean getIsEnriched() {
        return isEnriched;
    }

    public void setIsEnriched(Boolean isEnriched) {
        this.isEnriched = isEnriched;
    }

    public Boolean getIsOemPromoted() {
        return isOemPromoted;
    }

    public void setIsOemPromoted(Boolean isOemPromoted) {
        this.isOemPromoted = isOemPromoted;
    }

    public Boolean getIsOemRefundFlag() {
        return isOemRefundFlag;
    }

    public void setIsOemRefundFlag(Boolean isOemRefundFlag) {
        this.isOemRefundFlag = isOemRefundFlag;
    }

    public Integer getListPrice() {
        return listPrice;
    }

    public void setListPrice(Integer listPrice) {
        this.listPrice = listPrice;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public MonthlyPaymentEstimate getMonthlyPaymentEstimate() {
        return monthlyPaymentEstimate;
    }

    public void setMonthlyPaymentEstimate(MonthlyPaymentEstimate monthlyPaymentEstimate) {
        this.monthlyPaymentEstimate = monthlyPaymentEstimate;
    }

    public Integer getMpgCity() {
        return mpgCity;
    }

    public void setMpgCity(Integer mpgCity) {
        this.mpgCity = mpgCity;
    }

    public Integer getMpgHighway() {
        return mpgHighway;
    }

    public void setMpgHighway(Integer mpgHighway) {
        this.mpgHighway = mpgHighway;
    }

    public Boolean getNoAccidents() {
        return noAccidents;
    }

    public void setNoAccidents(Boolean noAccidents) {
        this.noAccidents = noAccidents;
    }

    public Boolean getOneOwner() {
        return oneOwner;
    }

    public void setOneOwner(Boolean oneOwner) {
        this.oneOwner = oneOwner;
    }

    public Integer getOnePrice() {
        return onePrice;
    }

    public void setOnePrice(Integer onePrice) {
        this.onePrice = onePrice;
    }

    public List<OnePriceArrow> getOnePriceArrows() {
        return onePriceArrows;
    }

    public void setOnePriceArrows(List<OnePriceArrow> onePriceArrows) {
        this.onePriceArrows = onePriceArrows;
    }

    public Boolean getOnlineOnly() {
        return onlineOnly;
    }

    public void setOnlineOnly(Boolean onlineOnly) {
        this.onlineOnly = onlineOnly;
    }

    public OwnerHistory getOwnerHistory() {
        return ownerHistory;
    }

    public void setOwnerHistory(OwnerHistory ownerHistory) {
        this.ownerHistory = ownerHistory;
    }

    public Boolean getPersonalUse() {
        return personalUse;
    }

    public void setPersonalUse(Boolean personalUse) {
        this.personalUse = personalUse;
    }

    public Boolean getPlaced() {
        return placed;
    }

    public void setPlaced(Boolean placed) {
        this.placed = placed;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public Boolean getSentLead() {
        return sentLead;
    }

    public void setSentLead(Boolean sentLead) {
        this.sentLead = sentLead;
    }

    public ServiceHistory getServiceHistory() {
        return serviceHistory;
    }

    public void setServiceHistory(ServiceHistory serviceHistory) {
        this.serviceHistory = serviceHistory;
    }

    public Boolean getServiceRecords() {
        return serviceRecords;
    }

    public void setServiceRecords(Boolean serviceRecords) {
        this.serviceRecords = serviceRecords;
    }

    public Boolean getEnriched() {
        return isEnriched;
    }

    public void setEnriched(Boolean enriched) {
        isEnriched = enriched;
    }

    public Boolean getOemPromoted() {
        return isOemPromoted;
    }

    public void setOemPromoted(Boolean oemPromoted) {
        isOemPromoted = oemPromoted;
    }

    public Boolean getOemRefundFlag() {
        return isOemRefundFlag;
    }

    public void setOemRefundFlag(Boolean oemRefundFlag) {
        isOemRefundFlag = oemRefundFlag;
    }

    public Double getSortScore() {
        return sortScore;
    }

    public void setSortScore(Double sortScore) {
        this.sortScore = sortScore;
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String getSubTrim() {
        return subTrim;
    }

    public void setSubTrim(String subTrim) {
        this.subTrim = subTrim;
    }

    public List<String> getTopOptions() {
        return topOptions;
    }

    public void setTopOptions(List<String> topOptions) {
        this.topOptions = topOptions;
    }

    public Double getTpCostPerVdp() {
        return tpCostPerVdp;
    }

    public void setTpCostPerVdp(Double tpCostPerVdp) {
        this.tpCostPerVdp = tpCostPerVdp;
    }

    public Boolean getTpEligible() {
        return tpEligible;
    }

    public void setTpEligible(Boolean tpEligible) {
        this.tpEligible = tpEligible;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getVdpUrl() {
        return vdpUrl;
    }

    public void setVdpUrl(String vdpUrl) {
        this.vdpUrl = vdpUrl;
    }

    public String getVehicleCondition() {
        return vehicleCondition;
    }

    public void setVehicleCondition(String vehicleCondition) {
        this.vehicleCondition = vehicleCondition;
    }

    public VehicleUseHistory getVehicleUseHistory() {
        return vehicleUseHistory;
    }

    public void setVehicleUseHistory(VehicleUseHistory vehicleUseHistory) {
        this.vehicleUseHistory = vehicleUseHistory;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getWindowSticker() {
        return windowSticker;
    }

    public void setWindowSticker(String windowSticker) {
        this.windowSticker = windowSticker;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getListingStatus() {
        return listingStatus;
    }

    public void setListingStatus(String listingStatus) {
        this.listingStatus = listingStatus;
    }

}
