package com.sbtic.db.access.encryption;

public interface DataEncrypter
{
    void encrypt(byte[] data, String key);
    void decrypt(byte[] data, String key);
}
