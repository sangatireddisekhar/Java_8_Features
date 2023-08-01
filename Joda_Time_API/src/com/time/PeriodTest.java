package com.time;

import java.time.*;
import java.time.LocalTime;

public class PeriodTest {

	public static void currentDateAndTime() {
		LocalDate date = LocalDate.now();
		System.out.println(date);//2023-02-02
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);//2023-02-02T11:15:33.757196300
		
		LocalTime time=LocalTime.now();
		System.out.println(time);//11:15:33.757196300
	}
	public static void main(String[] args) {
//		Period p=Period.of(3, 6, 25);
//		Period p=Period.ofYears(2);
		Period p=Period.between(LocalDate.of(1998, 6, 15), LocalDate.now());
		System.out.println(p);//P24Y7M18D
		System.out.println(p.getYears());//24
		System.out.println(p.getMonths());//7
		System.out.println(p.getDays());//18
		
		System.out.println(Year.isLeap(2024));
	}
}
