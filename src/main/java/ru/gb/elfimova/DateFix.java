package ru.gb.elfimova;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFix {
    Calendar calendar = Calendar.getInstance();
    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    public String currentDateTime = dateFormat.format(calendar.getTime());
}