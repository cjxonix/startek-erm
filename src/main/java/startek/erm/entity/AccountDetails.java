/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startek.erm.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Niwoogaba_Joel
 */
@SuppressWarnings("serial")
@Embeddable
public class AccountDetails implements Serializable {

    private String phone1;
    private String phone2;
    private String website;
    private String address1;
    private String address2;
    private String country;
    /**
     * State/Province/Region
     */
    private String region;
    private String city;
    @Column(name = "zipcode")
    private String zipCode;

    public AccountDetails() {
    }

    public AccountDetails(String phone1, String phone2, String website, String address1, String address2, String country, String region, String city, String zipCode) {
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.website = website;
        this.address1 = address1;
        this.address2 = address2;
        this.country = country;
        this.region = region;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

}
