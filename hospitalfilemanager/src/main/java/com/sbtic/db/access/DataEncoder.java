package com.sbtic.db.access;

import com.sbtic.db.access.encryption.DataEncrypter;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;

public class DataEncoder
{
    private DataEncrypter encrypter;

    @Autowired
    public void setEncrypter(DataEncrypter encrypter)
    {
        this.encrypter = encrypter;
    }

    public byte[] encode(Serializable data, String key)
    {
        byte[] result = null;
        try
        {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(data);
            objectOutputStream.close();
            result = outputStream.toByteArray();
            outputStream.close();

        } catch (IOException e)
        {
            e.printStackTrace();
        }
        encrypter.encrypt(result, key);
        return result;
    }

    public Serializable decode(byte[] data, String key)
    {
        Serializable result = null;
        try
        {
            encrypter.decrypt(data, key);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            result = (Serializable)objectInputStream.readObject();
        }catch (IOException | ClassNotFoundException err)
        {
            err.printStackTrace();
        }
        return result;
    }
}
