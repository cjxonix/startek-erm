/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startek.erm.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * Symptoms Like Diarrhea
 *
 * @author Niwoogaba_Joel
 */
@SuppressWarnings("serial")
@Table(name = "medical_symptom")
@Entity
public class MedicalSymptom implements Serializable {

    @JoinTable(name = "disease_sysmptom",
            inverseJoinColumns = @JoinColumn(name = "disease_id"),
            joinColumns = @JoinColumn(name = "sysmptom_id")
    )
    @ManyToMany
    private List<MedicalDisease> medicalDiseases;

    @JoinTable(name = "daignosis_sysmptom",
            inverseJoinColumns = @JoinColumn(name = "daignosisid"),
            joinColumns = @JoinColumn(name = "sysmptomid")
    )
    @ManyToMany//(mappedBy = "symptoms")
    private List<MedicalDaignosis> medicalDaignosisList;

    @Id
    private Long symptomid;
    @Column(name = "symptom_name")
    private String symptomName;
    @Column(name = "symptom_description", columnDefinition = "LONGTEXT")
    private String symptomDesicription;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date createdat;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date updatedat;

    public String getSymptomDesicription() {
        return symptomDesicription;
    }

    public void setSymptomDesicription(String symptomDesicription) {
        this.symptomDesicription = symptomDesicription;
    }

    public List<MedicalDaignosis> getMedicalDaignosisList() {
        return medicalDaignosisList;
    }

    public List<MedicalDisease> getMedicalDiseases() {
        return medicalDiseases;
    }

    public void setMedicalDiseases(List<MedicalDisease> medicalDiseases) {
        this.medicalDiseases = medicalDiseases;
    }

    public void setMedicalDaignosisList(List<MedicalDaignosis> medicalDaignosisList) {
        this.medicalDaignosisList = medicalDaignosisList;
    }

    public String getSymptomName() {
        return symptomName;
    }

    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public Date getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }

    public Long getSymptomid() {
        return symptomid;
    }

    public void setSymptomid(Long symptomid) {
        this.symptomid = symptomid;
    }

}
