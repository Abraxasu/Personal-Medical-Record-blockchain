package com.sbtic.db.data.patient;

import java.io.Serializable;
import java.util.List;

public class UserRecord implements Serializable
{
    private String uuid;

    private List<DoctorVisit> doctorVisits;
    private List<MedicalHistory> medicalHistory;
    private MedicalAid medicalAid;
    private PersonalInfo personalInfo;

    public String getUuid()
    {
        return uuid;
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }

    public List<DoctorVisit> getDoctorVisits()
    {
        return doctorVisits;
    }

    public void setDoctorVisits(List<DoctorVisit> doctorVisits)
    {
        this.doctorVisits = doctorVisits;
    }

    public List<MedicalHistory> getMedicalHistory()
    {
        return medicalHistory;
    }

    public void setMedicalHistory(List<MedicalHistory> medicalHistory)
    {
        this.medicalHistory = medicalHistory;
    }

    public MedicalAid getMedicalAid()
    {
        return medicalAid;
    }

    public void setMedicalAid(MedicalAid medicalAid)
    {
        this.medicalAid = medicalAid;
    }

    public PersonalInfo getPersonalInfo()
    {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo)
    {
        this.personalInfo = personalInfo;
    }
}
