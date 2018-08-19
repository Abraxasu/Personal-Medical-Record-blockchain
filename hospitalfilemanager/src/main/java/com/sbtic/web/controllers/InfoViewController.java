package com.sbtic.web.controllers;

import com.sbtic.db.data.patient.DoctorVisit;
import com.sbtic.db.data.patient.MedicalAid;
import com.sbtic.db.data.patient.PersonalInfo;
import com.sbtic.db.data.patient.UserRecord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class InfoViewController
{
    @RequestMapping("/info")
    public String showInfoPage(Model model)//TODO take account info here
    {
        //begin hardcoded user info for testing
        UserRecord record = new UserRecord();
        List<DoctorVisit> visits = new ArrayList<DoctorVisit>();
        DoctorVisit visit1 = new DoctorVisit();
        visit1.setHospitalName("Human Hospital");
        visit1.setDate(new Date());
        visit1.setReasonForVisit("reason");
        visit1.setDiagonsis("sick");
        visit1.setMedication("stuff that makes them better");
        visit1.setHospitalAddress("1 Hospital St.");
        visit1.setDoctorID("D0CT0_R");
        visit1.setTests("sickness test");
        visits.add(visit1);
        record.setDoctorVisits(visits);

        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setAddress("1 Human st.");
        personalInfo.setIdNumber("1111111111111");
        personalInfo.setBloodType(PersonalInfo.BloodType.A);
        personalInfo.setCitizenship("Artsotskan");
        personalInfo.setEmailAddress("human@totallyNotABot.com");
        personalInfo.setFirstName("Human");
        personalInfo.setMiddleName("'not a bot'");
        personalInfo.setLastName("McHumington");
        personalInfo.setGender(PersonalInfo.Gender.other);
        personalInfo.setDob(new Date(1800, 4, 18));
        personalInfo.setTitle("Sir");
        personalInfo.setEmergencyContact("N/A");
        record.setPersonalInfo(personalInfo);

        MedicalAid medicalAid = new MedicalAid();
        medicalAid.setCompany("Medical Aid Inc.");
        medicalAid.setDependentCode("12345");
        medicalAid.setMainMemberID("54321");
        medicalAid.setMainMemberName("Human McHumington");
        medicalAid.setUsageHistory("Never used");
        medicalAid.setNumber("999999999999");
        medicalAid.setPlan("Plan for Real Humans");
        record.setMedicalAid(medicalAid);

        model.addAttribute("record", record);
        return "info";
    }
}
