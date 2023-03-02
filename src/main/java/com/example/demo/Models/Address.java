package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne(mappedBy = "employee")
    private Employee employee;

    private String line1;

    private String line2;

    private String apartmentNumber;

    private String city;

    private String state;

    private String zip;

    private String zipPlusFour;

    private String county;

    private String country;

    public Address() {
    }

    public Long getId() {
        return id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getZipPlusFour() {
        return zipPlusFour;
    }

    public String getCounty() {
        return county;
    }

    public String getCountry() {
        return country;
    }
}

