package com.example.demo.Models;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "employee_id")
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

    public Address(Long id, Employee employee, String line1, String line2, String apartmentNumber, String city, String state, String zip, String zipPlusFour, String county, String country) {
        this.id = id;
        this.employee = employee;
        this.line1 = line1;
        this.line2 = line2;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.zipPlusFour = zipPlusFour;
        this.county = county;
        this.country = country;
    }

    public Address(long id, Employee employee1, String line1, String Columbus, String OH, String city, String usa) {
    }

    public Address(String s, String s1, Object o, String chicago, String il, String s2, Object o1, String cook, String us) {
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

