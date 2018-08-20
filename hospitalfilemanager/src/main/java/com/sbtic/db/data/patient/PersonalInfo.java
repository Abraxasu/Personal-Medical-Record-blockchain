package com.sbtic.db.data.patient;

import com.sbtic.Util;

import java.io.Serializable;
import java.util.Date;

public class PersonalInfo implements Serializable
{
    private String name;
    private String idNumber;
    private Gender gender;
    private Date dob;
    private String address;
    private String emailAddress;
    private String emergencyContact;
    private BloodType bloodType;

    //TODO use more of these fields in the web page!

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getIdNumber()
    {
        return idNumber;
    }

    public void setIdNumber(String idNumber)
    {
        this.idNumber = idNumber;
    }

    public Gender getGender()
    {
        return gender;
    }

    public void setGender(Gender gender)
    {
        this.gender = gender;
    }

    public Date getDob()
    {
        return dob;
    }

    public String getDobString()
    {
        return Util.formatDate(dob);
    }

    public void setDob(Date dob)
    {
        this.dob = dob;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String getEmergencyContact()
    {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact)
    {
        this.emergencyContact = emergencyContact;
    }

    public BloodType getBloodType()
    {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType)
    {
        this.bloodType = bloodType;
    }

    public enum Gender
    {
        male,
        female,
        other,
    }
    public enum BloodType
    {
        A,
        B,
        AB,
        O,
    }
}
