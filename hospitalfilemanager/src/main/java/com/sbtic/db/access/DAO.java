package com.sbtic.db.access;

import com.sbtic.db.data.patient.UserRecord;

import java.util.List;

public interface DAO
{
    UserRecord getRecord(String key);

    List<UserRecord> getDoctor(String key);
}
