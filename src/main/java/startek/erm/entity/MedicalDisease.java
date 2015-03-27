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
import javax.persistence.Table;

/**
 *
 * @author Niwoogaba_Joel
 */
@SuppressWarnings("serial")
@Table(name = "medical_disease")
@Entity
public class MedicalDisease implements Serializable {

    @JoinTable(name = "daignosis_disease",
            inverseJoinColumns = @JoinColumn(name = "daignosisid"),
            joinColumns = @JoinColumn(name = "diseasesid")
    )
    @ManyToMany
    private List<MedicalDaignosis> medicalDaignosisList;

    @JoinTable(name = "disease_sysmptom",
            inverseJoinColumns = @JoinColumn(name = "sysmptom_id"),
            joinColumns = @JoinColumn(name = "disease_id")
    )
    @ManyToMany
    private List<MedicalSymptom> medicalSymptoms;

    @Id
    private Long diseaseid;
    @Column(name = "disease_name")
    private String diseaseName;

    public List<MedicalSymptom> getMedicalSymptoms() {
        return medicalSymptoms;
    }

    public void setMedicalSymptoms(List<MedicalSymptom> medicalSymptoms) {
        this.medicalSymptoms = medicalSymptoms;
    }

    public List<MedicalDaignosis> getMedicalDaignosisList() {
        return medicalDaignosisList;
    }

    public void setMedicalDaignosisList(List<MedicalDaignosis> medicalDaignosisList) {
        this.medicalDaignosisList = medicalDaignosisList;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public Long getDiseaseid() {
        return diseaseid;
    }

    public void setDiseaseid(Long diseaseid) {
        this.diseaseid = diseaseid;
    }

}
