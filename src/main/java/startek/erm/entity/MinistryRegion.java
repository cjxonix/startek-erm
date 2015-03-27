/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startek.erm.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Niwoogaba_Joel
 */
@SuppressWarnings("serial")
@Table(name = "min_region")
@Entity
public class MinistryRegion implements Serializable {

    @Id
    private Long regionid;
    @Column(name = "region_name")
    private Long regionName;

    public Long getRegionName() {
        return regionName;
    }

    public void setRegionName(Long regionName) {
        this.regionName = regionName;
    }

    public Long getRegionid() {
        return regionid;
    }

    public void setRegionid(Long regionid) {
        this.regionid = regionid;
    }

}
