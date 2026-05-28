package com.example.demo.entity;

import java.time.LocalDate;

import com.example.demo.enums.PolicyStatus;

public class Policy {
    private Integer id;
    private String PolicyNo;
    private Customer customer;
    private String productName;
    private Integer premium;
    private Integer insuredAmount;
    private LocalDate startDate;
    private LocalDate endDate;
    private PolicyStatus status;

    public Policy() {
    }

    public Policy(Integer id, String PolicyNo, Customer customer, String productName, Integer premium,
            Integer insuredAmount, LocalDate startDate, LocalDate endDate, PolicyStatus status) {
        this.id = id;
        this.PolicyNo = PolicyNo;
        this.customer = customer;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolicyNo() {
        return PolicyNo;
    }

    public void setPolicyNo(String policyNo) {
        PolicyNo = policyNo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    public PolicyStatus getStatus() {
        return status;
    }

    public void setStatus(PolicyStatus status) {
        this.status = status;
    }
}
