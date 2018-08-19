package com.sbtic.db.access.encryption;

import java.util.Random;

public class RandomEncrypter implements DataEncrypter
{
    @Override
    public void encrypt(byte[] data, String key)
    {
        Random rand = new Random(key.hashCode());
        for (int i = 0; i < data.length; i++)
            data[i] ^= rand.nextInt(256);
    }

    @Override
    public void decrypt(byte[] data, String key)
    {
        Random rand = new Random(key.hashCode());
        for (int i = 0; i < data.length; i++)
            data[i] ^= rand.nextInt(256);
    }
}
