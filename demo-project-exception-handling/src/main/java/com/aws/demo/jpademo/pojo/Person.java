package com.aws.demo.jpademo.pojo;

import jakarta.persistence.*;

@Entity
@Table(name = "person_tbl")
public class Person {

    private String name;
    @Id
    @Column(name = "IDclm")
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int id ;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
