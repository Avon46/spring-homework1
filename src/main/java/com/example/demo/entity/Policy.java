package com.example.demo.entity;

import java.time.LocalDate;

import com.example.demo.enums.PolicyStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "policies")
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "policy_no", nullable = false, unique = true)
    private String policyNo;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    private String productName;
    private Integer premium;
    private Integer insuredAmount;
    private LocalDate startDate;
    private LocalDate endDate;
    private PolicyStatus status;

    public Policy() {
    }

    public Policy(String PolicyNo, Customer customer, String productName, Integer premium,
            Integer insuredAmount, LocalDate startDate, LocalDate endDate, PolicyStatus status) {
        this.policyNo = PolicyNo;
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
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
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
