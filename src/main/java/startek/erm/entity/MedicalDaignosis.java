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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Niwoogaba_Joel
 */
@SuppressWarnings("serial")
@Table(name = "medical_daignosis")
@Entity
public class MedicalDaignosis implements Serializable {

    @JoinColumn(name = "patientid")
    @ManyToOne
    private Patient patient;

    @JoinTable(name = "daignosis_sysmptom",
            inverseJoinColumns = @JoinColumn(name = "sysmptomid"),
            joinColumns = @JoinColumn(name = "daignosisid")
    )
    @ManyToMany
    private List<MedicalSymptom> symptoms;

    @JoinTable(name = "daignosis_disease",
            inverseJoinColumns = @JoinColumn(name = "diseasesid"),
            joinColumns = @JoinColumn(name = "daignosisid")
    )
    @ManyToMany
    private List<MedicalDisease> diseases;

    @Id
    private Long diagnosisid;
    @Column(name = "other_symptoms")
    private String otherSymptoms;

    private String discription;
    private String comments;

    /**
     * The H/C Worker in Charge
     */
    @OneToOne
    private AppUser editor;

    public AppUser getEditor() {
        return editor;
    }

    public void setEditor(AppUser editor) {
        this.editor = editor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<MedicalSymptom> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<MedicalSymptom> symptoms) {
        this.symptoms = symptoms;
    }

    public List<MedicalDisease> getDiseases() {
        return diseases;
    }

    public void setDiseases(List<MedicalDisease> diseases) {
        this.diseases = diseases;
    }

    public Long getDiagnosisid() {
        return diagnosisid;
    }

    public void setDiagnosisid(Long diagnosisid) {
        this.diagnosisid = diagnosisid;
    }

    public String getOtherSymptoms() {
        return otherSymptoms;
    }

    public void setOtherSymptoms(String otherSymptoms) {
        this.otherSymptoms = otherSymptoms;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

}
