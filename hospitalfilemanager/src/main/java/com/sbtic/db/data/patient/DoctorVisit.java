package com.sbtic.db.data.patient;

import com.sbtic.Util;

import java.io.Serializable;
import java.util.Date;

public class DoctorVisit implements Serializable
{
    private Date date;
    private String hospitalName;
    private String hospitalAddress;
    private String doctorID;
    private String reasonForVisit;
    private String diagnosis;
    private String tests;
    private String medication;
    private String notes;

    public Date getDate()
    {
        return date;
    }

    public String getDateString()
    {
        return Util.formatDate(date);
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public String getHospitalName()
    {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName)
    {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress()
    {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress)
    {
        this.hospitalAddress = hospitalAddress;
    }

    public String getDoctorID()
    {
        return doctorID;
    }

    public void setDoctorID(String doctorID)
    {
        this.doctorID = doctorID;
    }

    public String getReasonForVisit()
    {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit)
    {
        this.reasonForVisit = reasonForVisit;
    }

    public String getDiagnosis()
    {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis)
    {
        this.diagnosis = diagnosis;
    }

    public String getTests()
    {
        return tests;
    }

    public void setTests(String tests)
    {
        this.tests = tests;
    }

    public String getMedication()
    {
        return medication;
    }

    public void setMedication(String medication)
    {
        this.medication = medication;
    }

    public String getNotes()
    {
        return notes;
    }

    public void setNotes(String notes)
    {
        this.notes = notes;
    }
}
