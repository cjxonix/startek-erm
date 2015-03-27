/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startek.erm.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * Involve Information Like Weight, Height,
 *
 * @author Niwoogaba_Joel
 */
@SuppressWarnings("serial")
@Table(name = "medical_data")
@Entity
public class MedicalData implements Serializable {

    @JoinColumn(name = "patientid")
    @OneToOne(mappedBy = "medicalData")
    private Patient patient;

    @Id
    private Long dataid;

    private Double height;
    private Double weight;
    private int age;
    @Column(name = "height_updated_at")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date heightUpdatedAt;
    @Column(name = "weight_updated_at")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date weightUpdatedAt;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getHeightUpdatedAt() {
        return heightUpdatedAt;
    }

    public void setHeightUpdatedAt(Date heightUpdatedAt) {
        this.heightUpdatedAt = heightUpdatedAt;
    }

    public Date getWeightUpdatedAt() {
        return weightUpdatedAt;
    }

    public void setWeightUpdatedAt(Date weightUpdatedAt) {
        this.weightUpdatedAt = weightUpdatedAt;
    }

    public Long getDataid() {
        return dataid;
    }

    public void setDataid(Long dataid) {
        this.dataid = dataid;
    }
}
