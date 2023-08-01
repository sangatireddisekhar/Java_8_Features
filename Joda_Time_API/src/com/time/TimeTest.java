package com.time;

import java.time.*;
import java.time.LocalTime;

public class TimeTest {

	public static void currentDateAndTime() {
		LocalDate date = LocalDate.now();
		System.out.println(date);//2023-02-02
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);//2023-02-02T11:15:33.757196300
		
		LocalTime time=LocalTime.now();
		System.out.println(time);//11:15:33.757196300
	}
	public static void main(String[] args) {
//		LocalTime time=LocalTime.now();
		LocalTime time=LocalTime.of(8, 30, 5, 123345);
		
		System.out.println(time.getHour());//8
		System.out.println(time.getMinute());//30
		System.out.println(time.getSecond());//5
		System.out.println(time.getNano());//123345

	}
}
