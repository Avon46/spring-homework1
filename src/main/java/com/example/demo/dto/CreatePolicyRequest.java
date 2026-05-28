package com.example.demo.dto;

import java.time.LocalDate;

public class CreatePolicyRequest {

    private Integer customerId;
    private String policyNo;
    private String productName;
    private Integer premium;
    private Integer insuredAmount;
    private LocalDate startDate;
    private LocalDate endDate;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getPremium() {
        return premium;
    }

    public void setPremium(Integer premium) {
        this.premium = premium;
    }

    public Integer getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(Integer insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}