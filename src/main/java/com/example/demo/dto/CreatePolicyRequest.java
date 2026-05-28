package com.example.demo.dto;

import java.time.LocalDate;

public class CreatePolicyRequest {
    private String PolicyNo;
    private Integer customerId;
    private String productName;
    private Integer premium;
    private Integer insuredAmount;
    private LocalDate startDate;
    private LocalDate endDate;

    public CreatePolicyRequest() {
    }

    public CreatePolicyRequest(Integer customerId,String PolicyNo, String productName, Integer premium,
            Integer insuredAmount, LocalDate startDate, LocalDate endDate) {
        this.customerId = customerId;
        this.PolicyNo = PolicyNo;
        this.productName = productName;
        this.premium = premium;
        this.insuredAmount = insuredAmount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getPolicyNo() {
        return PolicyNo;
    }

    public void setPolicyNo(String policyNo) {
        PolicyNo = policyNo;
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

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
