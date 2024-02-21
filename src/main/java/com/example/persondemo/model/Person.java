package com.example.persondemo.model;


public class Person {
    private String name;
    private String street;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }

    //public Person(String name, String street, String town, String zip) {
    //    this.name = name;
    //    this.street = street;
    //    this.town = town;
    //    this.zip = zip;
    //}

    //public Person() {

    //}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    private String town;
    private String zip;

    // Getters and setters for each field
}
