package com.example.demo.Services;
import java.time.*;
import java.time.DayOfWeek;
import java.util.Calendar;

public class DayCalculator {



    public String fridayOrNot(){
        Calendar calender = Calendar.getInstance();
        int dayOfWeek = calender.get(Calendar.DAY_OF_WEEK);

        if(dayOfWeek == 6){
            return "JA! :D";
        }
        else {
            return "NÆÆ :(";
        }
    }
}
