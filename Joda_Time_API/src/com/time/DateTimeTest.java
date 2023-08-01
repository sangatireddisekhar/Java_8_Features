package com.time;

import java.time.*;
import java.time.LocalTime;

public class DateTimeTest {

	public static void currentDateAndTime() {
		LocalDate date = LocalDate.now();
		System.out.println(date);//2023-02-02
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);//2023-02-02T11:15:33.757196300
		
		LocalTime time=LocalTime.now();
		System.out.println(time);//11:15:33.757196300
	}
	public static void main(String[] args) {
//		LocalDateTime dateTime=LocalDateTime.now();
		LocalDateTime dateTime=LocalDateTime.of(1998, 6, 15, 6, 30);
		System.out.println(dateTime);
		System.out.println(dateTime.getDayOfMonth());
		System.out.println(dateTime.getDayOfYear());
		System.out.println(dateTime.getDayOfWeek());
		System.out.println(dateTime.getMonth());
		System.out.println(dateTime.getMonthValue());
		System.out.println(dateTime.getYear());
		
		System.out.println(dateTime.getHour());
		System.out.println(dateTime.getMinute());
		System.out.println(dateTime.getSecond());
		System.out.println(dateTime.getNano());
		
		
		
	}
}
