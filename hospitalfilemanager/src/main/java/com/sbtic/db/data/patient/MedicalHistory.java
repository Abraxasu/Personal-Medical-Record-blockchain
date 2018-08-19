package com.sbtic.db.data.patient;

import java.io.Serializable;
import java.util.Date;

public class MedicalHistory implements Serializable
{
    private Date startDate;
    private String medication;
    private String reason;
    private String notes;

    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }

    public String getMedication()
    {
        return medication;
    }

    public void setMedication(String medication)
    {
        this.medication = medication;
    }

    public String getReason()
    {
        return reason;
    }

    public void setReason(String reason)
    {
        this.reason = reason;
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
