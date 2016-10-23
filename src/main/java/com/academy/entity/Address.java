package com.academy.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author Marek Słomnicki <marek@slomnicki.net>
 */
@Entity
@Table(name = "ADDRESSES")
public class Address {
    @Id
    @GenericGenerator(name = "addressSequence", strategy = "sequence-identity",
            parameters = @org.hibernate.annotations.Parameter(name = "sequence", value = "ADDRESSES_SEQ"))
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addressSequence")
    @Column(name = "ADDRESS_ID")
    private Long id;

    @Column(name = "POST_CODE")
    private String postCode;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STREET")
    private String street;
    @Column(name = "BUILDING_NUMBER")
    private String buildingNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
}
