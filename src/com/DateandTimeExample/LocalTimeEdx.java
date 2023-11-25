package com.DateandTimeExample;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTimeEdx {

public static void main(String[] args) {
	
	LocalTime time = LocalTime.now();  
    System.out.println(time);  
    LocalTime time0 = LocalTime.of(10,43,12);  
    System.out.println(time0);  
    
    LocalTime time1 = LocalTime.of(10,43,12);  
    System.out.println(time1);  
    LocalTime time2=time1.minusHours(2);  
    LocalTime time3=time2.minusMinutes(34);  
    System.out.println(time3); 
    
    LocalTime time4 = LocalTime.of(10,43,12);  
    System.out.println(time1);  
    LocalTime time5=time4.plusHours(4);  
    LocalTime time6=time5.plusMinutes(18);  
    System.out.println(time6);
    
    
    
//    Zone Time
    
    ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
    ZoneId zone2 = ZoneId.of("Asia/Tokyo");  
    LocalTime timeId1 = LocalTime.now(zone1);  
    System.out.println("India Time Zone: "+time1);  
    LocalTime timeId2 = LocalTime.now(zone2);  
    System.out.println("Japan Time Zone: "+time2);  
    long hours = ChronoUnit.HOURS.between(timeId1, timeId2);  
    System.out.println("Hours between two Time Zone: "+hours);  
    long minutes = ChronoUnit.MINUTES.between(timeId1, timeId2);  
    System.out.println("Minutes between two time zone: "+minutes);  
}
    
}
