package com.hotelwork.booking.entity;

public class Client {

    private String name;

    private String phoneNumber;

    private String email;

    private String surName;

    private Bill bill;

    public Client(String name, String phoneNumber, String email, String surName, Bill bill) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.surName = surName;
        this.bill = bill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
