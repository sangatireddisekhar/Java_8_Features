package com.time;

import java.time.*;
import java.time.LocalTime;

public class DateTest {

	public static void currentDateAndTime() {
		LocalDate date = LocalDate.now();
		System.out.println(date);//2023-02-02
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);//2023-02-02T11:15:33.757196300
		
		LocalTime time=LocalTime.now();
		System.out.println(time);//11:15:33.757196300
	}
	public static void main(String[] args) {
//		LocalDate date = LocalDate.now();
		LocalDate date = LocalDate.of(1998, 6, 15);
		
		System.out.println(date.getDayOfMonth());//15
		System.out.println(date.getDayOfYear());//166
		System.out.println(date.getDayOfWeek());//MONDAY
		System.out.println(date.getMonth());//JUNE
		System.out.println(date.getMonthValue());//6
		System.out.println(date.getYear());//1998
	}
}
