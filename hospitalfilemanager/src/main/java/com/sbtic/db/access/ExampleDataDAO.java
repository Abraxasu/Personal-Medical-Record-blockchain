package com.sbtic.db.access;

import com.sbtic.db.data.patient.*;

import java.util.*;

public class ExampleDataDAO implements DAO
{
    private HashMap<String, UserRecord> recordTable;
    private HashMap<String, List<UserRecord>> doctorTable;

    public ExampleDataDAO()
    {
        recordTable = new HashMap<>();

        //USER CODE 1: TOTALLY REAL HUMAN
        recordTable.put("l6fzGP9dKgvBbHwC9FnOBwWburqvsXZ3", getRecord1());
        recordTable.put("ggkF1Zf76S8fpDMJD2hPSlmnCwRYp1nJ", getRecord2());
        recordTable.put("T12myCt98vv4etnXaLYllA04TVc2wYls", getRecord3());

        doctorTable = new HashMap<>();
        doctorTable.put("dvJ4rqLwDR3YBv8irJbyReFQipnPUF2D", Arrays.asList(getRecord1(), getRecord2(), getRecord3()));
        doctorTable.put("PD408oabDzC9EjWEA9MQu9zwQ1j2lgUM", Arrays.asList(getRecord1(), getRecord3()));
    }

    public UserRecord getRecord(String key)
    {
        return recordTable.get(key);
    }

    public List<UserRecord> getDoctor(String key)
    {
        return doctorTable.get(key);
    }


    //totally real human
    private UserRecord getRecord1()
    {
        UserRecord record = new UserRecord();

        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setAddress("7 Yeder Avenue, Cape Town");
        personalInfo.setIdNumber("4709142704502");
        personalInfo.setBloodType(PersonalInfo.BloodType.AB);
        personalInfo.setEmailAddress("laurel@gmail.com");
        personalInfo.setName("Yanny");
        personalInfo.setGender(PersonalInfo.Gender.other);
        personalInfo.setDob(new Date(1947 - 1900, 9, 14));
        personalInfo.setEmergencyContact("0118082130");
        record.setPersonalInfo(personalInfo);

        MedicalAid medicalAid = new MedicalAid();
        medicalAid.setCompany("Discovery Health");
        medicalAid.setDependentCode("01");
        medicalAid.setNumber("2857001");
        medicalAid.setPlan("Red");
        record.setMedicalAid(medicalAid);

        List<DoctorVisit> visits = new ArrayList<DoctorVisit>();
        //doctor visit list
        DoctorVisit visit1 = new DoctorVisit();
        visit1.setHospitalName("Tygerberg Hospital");
        visit1.setDate(new Date(1996 - 1900, 9, 26));
        visit1.setReasonForVisit("Childbirth");
        visit1.setDiagnosis("In labour");
        visit1.setMedication("Epidural");
        visit1.setHospitalAddress("Tygerberg");
        visit1.setDoctorID("Dr Bowen");
        visit1.setTests("none");
        visits.add(visit1);
        //end doctor visit list
        record.setDoctorVisits(visits);

        List<MedicalHistory> medicalHistory = new ArrayList<>();
        //medical history list
        MedicalHistory history1 = new MedicalHistory();
        history1.setMedication("Getting healthy pills");
        history1.setReason("Was not healthy");
        history1.setNotes("Became healthy after taking the pills");
        history1.setStartDate(new Date(2010 - 1900, 4, 15));
        medicalHistory.add(history1);

        MedicalHistory history2 = new MedicalHistory();
        history2.setMedication("Anti disease tablets");
        history2.setReason("Suffered from a human disease");
        history2.setNotes("Has not yet died after the disease");
        history2.setStartDate(new Date(2014 - 1900, 8, 21));
        medicalHistory.add(history2);
        //end medical history list
        record.setMedicalHistory(medicalHistory);

        record.setUuid("1");
        return record;
    }

    //totally real human 2
    private UserRecord getRecord2()
    {
        UserRecord record = new UserRecord();

        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setAddress("Koch Street, Stellenbosch");
        personalInfo.setIdNumber("9609260327092");
        personalInfo.setBloodType(PersonalInfo.BloodType.O);
        personalInfo.setEmailAddress("Rebecca@gmail.com");
        personalInfo.setName("Rebecca");
        personalInfo.setGender(PersonalInfo.Gender.female);
        personalInfo.setDob(new Date(1996 - 1900, 9, 26));
        personalInfo.setEmergencyContact("0737712786");
        record.setPersonalInfo(personalInfo);

        MedicalAid medicalAid = new MedicalAid();
        medicalAid.setCompany("Medihelp");
        medicalAid.setDependentCode("01");
        medicalAid.setNumber("870423");
        medicalAid.setPlan("Necesse");
        record.setMedicalAid(medicalAid);

        List<DoctorVisit> visits = new ArrayList<DoctorVisit>();
        //doctor visit list
        DoctorVisit visit1 = new DoctorVisit();
        visit1.setHospitalName("Famcare");
        visit1.setDate(new Date(2016 - 1900, 6, 2));
        visit1.setReasonForVisit("Flu-like symptoms");
        visit1.setDiagnosis("Post-nasal drip, infection of lower bronchi");
        visit1.setMedication("Grepex Antibiotic");
        visit1.setHospitalAddress("278 Bird Street");
        visit1.setDoctorID("Dr Gayle");
        visit1.setTests("none");
        visits.add(visit1);
        //new
        DoctorVisit visit2 = new DoctorVisit();
        visit2.setHospitalName("Famcare");
        visit2.setDate(new Date(2016 - 1900, 7, 10));
        visit2.setReasonForVisit("Flu follow up");
        visit2.setDiagnosis("Advanced Lung Infection");
        visit2.setMedication("Tylenol");
        visit2.setHospitalAddress("278 Bird Street");
        visit2.setDoctorID("Dr Gayle");
        visit2.setTests("none");
        visits.add(visit2);
        //end doctor visit list
        record.setDoctorVisits(visits);

        List<MedicalHistory> medicalHistory = new ArrayList<>();
        //medical history list
        MedicalHistory history1 = new MedicalHistory();
        history1.setMedication("Grepex");
        history1.setReason("Flu");
        history1.setNotes("Ineffective");
        history1.setStartDate(new Date(2016 - 1900, 6, 2));
        medicalHistory.add(history1);

        MedicalHistory history2 = new MedicalHistory();
        history2.setMedication("Tylenol");
        history2.setReason("Advanced Flu");
        history2.setNotes("none");
        history2.setStartDate(new Date(2016 - 1900, 7, 10));
        medicalHistory.add(history2);

        MedicalHistory history3 = new MedicalHistory();
        history3.setMedication("Euthyrox");
        history3.setReason("Hypothyroidism");
        history3.setNotes("none");
        history3.setStartDate(new Date(2012 - 1900, 8, 21));
        medicalHistory.add(history3);
        //end medical history list
        record.setMedicalHistory(medicalHistory);

        record.setUuid("2");
        return record;
    }


    //totally real human 2
    private UserRecord getRecord3()
    {
        UserRecord record = new UserRecord();

        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setAddress("Two Rivers Drive, East London");
        personalInfo.setIdNumber("8706210457094");
        personalInfo.setBloodType(PersonalInfo.BloodType.O);
        personalInfo.setEmailAddress("Steven@gmail.com");
        personalInfo.setName("Steven");
        personalInfo.setGender(PersonalInfo.Gender.male);
        personalInfo.setDob(new Date(1987 - 1900, 6, 21));
        personalInfo.setEmergencyContact("0745282786");
        record.setPersonalInfo(personalInfo);

        MedicalAid medicalAid = new MedicalAid();
        medicalAid.setCompany("GEMS");
        medicalAid.setDependentCode("03");
        medicalAid.setNumber("129768322");
        medicalAid.setPlan("Ruby");
        record.setMedicalAid(medicalAid);

        List<DoctorVisit> visits = new ArrayList<DoctorVisit>();
        //doctor visit list
        DoctorVisit visit1 = new DoctorVisit();
        visit1.setHospitalName("Beacon Bay Life Hospital");
        visit1.setDate(new Date(2010 - 1900, 2, 12));
        visit1.setReasonForVisit("Severe abdominal pain");
        visit1.setDiagnosis("Appendicitis");
        visit1.setMedication("Stopain, Yufex");
        visit1.setHospitalAddress("4 Rickle Road");
        visit1.setDoctorID("Dr Oolong");
        visit1.setTests("CT scan");
        visits.add(visit1);
        //end doctor visit list
        record.setDoctorVisits(visits);

        List<MedicalHistory> medicalHistory = new ArrayList<>();
        //medical history list
        MedicalHistory history1 = new MedicalHistory();
        history1.setMedication("Stopain");
        history1.setReason("Post surgery pain relief");
        history1.setNotes("none");
        history1.setStartDate(new Date(2010 - 1900, 2, 12));
        medicalHistory.add(history1);

        MedicalHistory history2 = new MedicalHistory();
        history2.setMedication("Yufex");
        history2.setReason("Post surgery antibiotic");
        history2.setNotes("none");
        history2.setStartDate(new Date(2010 - 1900, 2, 12));
        medicalHistory.add(history2);

        //end medical history list
        record.setMedicalHistory(medicalHistory);

        record.setUuid("3");
        return record;
    }








}
