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
@Table(name = "patient")
@Entity
public class Patient implements Serializable {

    @OneToMany(mappedBy = "patient")
    private List<MedicalDoc> medicalDocs;
    @Id
    private Long patientid;
    private String sin;
    private String fullname;
    private String gender;
    private String phone1;
    private String dob;
    private String address;

    @Column(name = "emergency_phone")
    private String emergencyPhone;
    @Column(name = "emergency_name")
    private String emergencyName;
    private String guardianname;

    //District
    //Place of Orign
    //Medical Information
    @JoinColumn(name = "dataid")
    @OneToOne
    private MedicalData medicalData;
    //Diagnosis Info
    @OneToMany(mappedBy = "patient")
    private List<MedicalDaignosis> diagnosisList;

    public List<MedicalDoc> getMedicalDocs() {
        return medicalDocs;
    }

    public void setMedicalDocs(List<MedicalDoc> medicalDocs) {
        this.medicalDocs = medicalDocs;
    }

    public String getGuardianname() {
        return guardianname;
    }

    public void setGuardianname(String guardianname) {
        this.guardianname = guardianname;
    }

    public MedicalData getMedicalData() {
        return medicalData;
    }

    public void setMedicalData(MedicalData medicalData) {
        this.medicalData = medicalData;
    }

    public List<MedicalDaignosis> getDiagnosisList() {
        return diagnosisList;
    }

    public void setDiagnosisList(List<MedicalDaignosis> diagnosisList) {
        this.diagnosisList = diagnosisList;
    }

    public String getSin() {
        return sin;
    }

    public void setSin(String sin) {
        this.sin = sin;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    public String getEmergencyName() {
        return emergencyName;
    }

    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPatientid() {
        return patientid;
    }

    public void setPatientid(Long patientid) {
        this.patientid = patientid;
    }

}
