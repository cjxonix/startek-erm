/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startek.erm.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Niwoogaba_Joel
 */
@SuppressWarnings("serial")
@Table(name = "hc_hc")
@Entity
public class HealthCenter implements Serializable {

    @JoinColumn(name = "districid")
    @ManyToOne
    private MinistryDistrict ministryDistrict;
    @JoinColumn(name = "locationid")
    @ManyToOne
    private MinistryLocation ministryLocation;
    @Id
    private Long hcid;
    private String name;
    private String description;
    private String logo;
    @OneToMany(mappedBy = "healthCenter")
    private List<AppUser> works;

    
    public Long getHcid() {
        return hcid;
    }

    public void setHcid(Long hcid) {
        this.hcid = hcid;
    }

    public MinistryDistrict getMinistryDistrict() {
        return ministryDistrict;
    }

    public void setMinistryDistrict(MinistryDistrict ministryDistrict) {
        this.ministryDistrict = ministryDistrict;
    }

    public MinistryLocation getMinistryLocation() {
        return ministryLocation;
    }

    public void setMinistryLocation(MinistryLocation ministryLocation) {
        this.ministryLocation = ministryLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<AppUser> getWorks() {
        return works;
    }

    public void setWorks(List<AppUser> works) {
        this.works = works;
    }

}
