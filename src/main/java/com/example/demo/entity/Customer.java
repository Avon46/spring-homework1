package com.example.demo.entity;

import java.time.LocalDate;

import com.example.demo.enums.CustomerStatus;

public class Customer {
    private Integer id;
    private String name;
    private String phone;
    private String email;
    private String identityNumber;
    private LocalDate birthday;
    private CustomerStatus status;

    public Customer() {
    }

    public Customer(Integer id, String name, String phone, String email, String identityNumber, LocalDate birthday,
            CustomerStatus status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.identityNumber = identityNumber;
        this.birthday = birthday;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }
}