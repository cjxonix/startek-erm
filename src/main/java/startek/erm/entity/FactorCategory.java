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
@Table(name = "factor_category")
@Entity
public class FactorCategory implements Serializable {

    @Id
    private Long categoryid;
    @Column(name = "category_name")
    private Long categoryName;
    @Column(name = "category_description")
    private Long categoryDescription;
    private boolean enabled;

    public FactorCategory() {
    }

    public FactorCategory(Long categoryName, Long categoryDescription, boolean enabled) {
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    public Long getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(Long categoryName) {
        this.categoryName = categoryName;
    }

    public Long getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(Long categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

}
