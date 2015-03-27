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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Niwoogaba_Joel
 */
@SuppressWarnings("serial")
@Table(name = "factor")
@Entity
public class Factor implements Serializable {

    @Id
    private Long factorid;
    private String title;
    private String description;

    @JoinTable(joinColumns = @JoinColumn(name = "factorid"),
            inverseJoinColumns = @JoinColumn(name = "imageid"))
    @OneToMany
    private List<Image> imageCaptured;

    @JoinColumn(name = "categoryid")
    @OneToOne
    private FactorCategory category;

    @JoinTable(name = "factor_location",
            inverseJoinColumns = @JoinColumn(name = "locationid"),
            joinColumns = @JoinColumn(name = "factorid")
    )
    @ManyToMany
    private List<MinistryLocation> ministryLocations;

    public List<MinistryLocation> getMinistryLocations() {
        return ministryLocations;
    }

    public void setMinistryLocations(List<MinistryLocation> ministryLocations) {
        this.ministryLocations = ministryLocations;
    }

    public Factor() {
    }

    public Factor(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Image> getImageCaptured() {
        return imageCaptured;
    }

    public void setImageCaptured(List<Image> imageCaptured) {
        this.imageCaptured = imageCaptured;
    }

    public FactorCategory getCategory() {
        return category;
    }

    public void setCategory(FactorCategory category) {
        this.category = category;
    }

    public Long getFactorid() {
        return factorid;
    }

    public void setFactorid(Long factorid) {
        this.factorid = factorid;
    }

}
