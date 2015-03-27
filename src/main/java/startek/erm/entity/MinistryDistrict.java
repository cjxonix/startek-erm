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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Niwoogaba_Joel
 */
@SuppressWarnings("serial")
@Table(name = "min_district")
@Entity
public class MinistryDistrict implements Serializable {

    @Id
    private Long districtid;
    @JoinColumn(name = "regionid")
    @OneToOne
    private MinistryRegion region;
    @Column(name = "district_name")
    private String districtName;

    @OneToMany(mappedBy = "ministryDistrict")
    private List<MinistryLocation> locations;

    @OneToMany(mappedBy = "ministryDistrict")
    private List<HealthCenter> hcs;

    public MinistryRegion getRegion() {
        return region;
    }

    public void setRegion(MinistryRegion region) {
        this.region = region;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public List<MinistryLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<MinistryLocation> locations) {
        this.locations = locations;
    }

    public List<HealthCenter> getHcs() {
        return hcs;
    }

    public void setHcs(List<HealthCenter> hcs) {
        this.hcs = hcs;
    }

    public Long getDistrictid() {
        return districtid;
    }

    public void setDistrictid(Long districtid) {
        this.districtid = districtid;
    }

}
