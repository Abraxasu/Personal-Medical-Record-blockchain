package com.sbtic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util
{
    private static final DateFormat df = new SimpleDateFormat("dd MMMM yyyy");

    public static String formatDate(Date date)
    {
        return df.format(date);
    }
}
