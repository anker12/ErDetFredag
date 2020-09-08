package com.example.demo.services;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


public class ErDetFredag {
    double q = 8;
    double m = 9;
    double j = 2020/100;
    double k = 2020%100;

    double h = ( q + Math.floor( ( 13 * ( m + 1 ) ) / 5 ) + k + Math.floor( k / 4 ) + Math.floor( j / 4) - 2 * j ) % 7;
    double d = ( (h + 5) % 7 ) + 1;

    int year = Calendar.getInstance().get(Calendar.MONTH);
    public ErDetFredag(){}


    public String freitag(){
        if(d==5){
            return "Ja";
        }
        else{
            return "Nej";
        }

    }
}
