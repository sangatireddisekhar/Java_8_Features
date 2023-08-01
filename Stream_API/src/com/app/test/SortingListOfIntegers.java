package com.app.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingListOfIntegers {
	public static void name() {

	}

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(123,204,788,415,0,0,13,360,261,83,521,73,13);
		System.out.println(l);
		l.stream().map((i)->{ 
			List<Integer> al=new ArrayList<>();
			do{
				al.add(i%10);
				i=i/10;
			}while(i>0);
			return al.stream().sorted().reduce((a,b)->a*10+b).get();
		})
		.sorted().forEach(System.out::println);
		name();
	}
}
