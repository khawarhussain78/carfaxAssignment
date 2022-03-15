
package com.example.carfaxassignment.beans;


import java.io.Serializable;
import java.util.List;
public class RelatedLinks implements Serializable {

    private List<Fiat124SpiderTrimLevel> fiat124SpiderTrimLevels = null;
    private List<SimilarCar> similarCars = null;
    private List<UsedFiat124SpiderByYear> usedFiat124SpiderByYear = null;

    public List<Fiat124SpiderTrimLevel> getFiat124SpiderTrimLevels() {
        return fiat124SpiderTrimLevels;
    }

    public void setFiat124SpiderTrimLevels(List<Fiat124SpiderTrimLevel> fiat124SpiderTrimLevels) {
        this.fiat124SpiderTrimLevels = fiat124SpiderTrimLevels;
    }

    public List<SimilarCar> getSimilarCars() {
        return similarCars;
    }

    public void setSimilarCars(List<SimilarCar> similarCars) {
        this.similarCars = similarCars;
    }

    public List<UsedFiat124SpiderByYear> getUsedFiat124SpiderByYear() {
        return usedFiat124SpiderByYear;
    }

    public void setUsedFiat124SpiderByYear(List<UsedFiat124SpiderByYear> usedFiat124SpiderByYear) {
        this.usedFiat124SpiderByYear = usedFiat124SpiderByYear;
    }

}
