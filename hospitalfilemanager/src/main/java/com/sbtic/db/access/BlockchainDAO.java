package com.sbtic.db.access;

import com.sbtic.db.data.patient.UserRecord;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlockchainDAO implements DAO
{
    @Autowired
    public DataEncoder dataEncoder;


    //TODO this entire class once the blockchain thing works

    @Override
    public UserRecord getRecord(String key)
    {
        return null;
    }

    @Override
    public List<UserRecord> getDoctor(String key)
    {
        return null;
    }


}
