/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startek.erm.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Niwoogaba_Joel
 */
@SuppressWarnings("serial")
@Table(name = "min_location")
@Entity
public class MinistryLocation implements Serializable {

    @JoinColumn(name = "districtid")
    @ManyToOne
    private MinistryDistrict ministryDistrict;

    @Id
    private Long regionid;
    @Column(name = "location_name")
    private Long locationName;
    private double longtude;
    private double latitude;

    @OneToMany(mappedBy = "ministryLocation")
    private List<HealthCenter> hcs;

    
     @JoinTable(name = "factor_location",
            inverseJoinColumns = @JoinColumn(name = "factorid"),
            joinColumns = @JoinColumn(name = "locationid")
    )
    @ManyToMany
    private List<Factor> factors;

    public List<Factor> getFactors() {
        return factors;
    }

    public void setFactors(List<Factor> factors) {
        this.factors = factors;
    }

    public MinistryDistrict getMinistryDistrict() {
        return ministryDistrict;
    }

    public void setMinistryDistrict(MinistryDistrict ministryDistrict) {
        this.ministryDistrict = ministryDistrict;
    }

    public Long getRegionid() {
        return regionid;
    }

    public void setRegionid(Long regionid) {
        this.regionid = regionid;
    }

    public Long getLocationName() {
        return locationName;
    }

    public void setLocationName(Long locationName) {
        this.locationName = locationName;
    }

    public double getLongtude() {
        return longtude;
    }

    public void setLongtude(double longtude) {
        this.longtude = longtude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public List<HealthCenter> getHcs() {
        return hcs;
    }

    public void setHcs(List<HealthCenter> hcs) {
        this.hcs = hcs;
    }

}
