
package com.example.carfaxassignment.beans;

import java.io.Serializable;

public class MonthlyPaymentEstimate implements Serializable {

    private Double downPaymentAmount;
    private Integer downPaymentPercent;
    private Integer interestRate;
    private Double loanAmount;
    private Double monthlyPayment;
    private Integer price;
    private Integer termInMonths;

    public Double getDownPaymentAmount() {
        return downPaymentAmount;
    }

    public void setDownPaymentAmount(Double downPaymentAmount) {
        this.downPaymentAmount = downPaymentAmount;
    }

    public Integer getDownPaymentPercent() {
        return downPaymentPercent;
    }

    public void setDownPaymentPercent(Integer downPaymentPercent) {
        this.downPaymentPercent = downPaymentPercent;
    }

    public Integer getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(Double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTermInMonths() {
        return termInMonths;
    }

    public void setTermInMonths(Integer termInMonths) {
        this.termInMonths = termInMonths;
    }

}
