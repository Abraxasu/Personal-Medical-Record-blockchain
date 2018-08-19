package com.sbtic.db.data.patient;

import java.io.Serializable;
import java.util.Date;

public class PersonalInfo implements Serializable
{
    private String firstName;
    private String lastName;
    private String middleName;
    private String title;
    private String citizenship;
    private String idNumber;
    private Gender gender;
    private Date dob;
    private String address;
    private String emailAddress;
    private String emergencyContact;
    private BloodType bloodType;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getMiddleName()
    {
        return middleName;
    }

    public void setMiddleName(String middleName)
    {
        this.middleName = middleName;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getCitizenship()
    {
        return citizenship;
    }

    public void setCitizenship(String citizenship)
    {
        this.citizenship = citizenship;
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
