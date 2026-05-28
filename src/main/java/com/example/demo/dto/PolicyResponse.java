package com.example.demo.dto;

import java.time.LocalDate;

import com.example.demo.enums.PolicyStatus;

public class PolicyResponse {

    private Integer id;
    private String policyNo;
    private Integer customerId;
    private String customerName;
    private String productName;
    private Integer premium;
    private Integer insuredAmount;
    private LocalDate startDate;
    private LocalDate endDate;
    private PolicyStatus status;

    public PolicyResponse(Integer id, String policyNo, Integer customerId, String customerName,
            String productName, Integer premium, Integer insuredAmount,
            LocalDate startDate, LocalDate endDate, PolicyStatus status) {
        this.id = id;
        this.policyNo = policyNo;
        this.customerId = customerId;
        this.customerName = customerName;
        this.productName = productName;
        this.premium = premium;
        this.insuredAmount = insuredAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getPremium() {
        return premium;
    }

    public Integer getInsuredAmount() {
        return insuredAmount;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public PolicyStatus getStatus() {
        return status;
    }
}