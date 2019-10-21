package com.gmail.silverleaf.annn;

public class Address {
    private String country;
    private String city;
    private String street;

    public Address() {
        super();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
