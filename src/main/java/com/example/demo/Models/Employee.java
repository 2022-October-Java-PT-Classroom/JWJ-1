package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private String id;
    private String name;
    @OneToMany(mappedBy = "address")
    private String address;


    public Employee(String id, String name, String address, String chicago, String il, String s) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}
