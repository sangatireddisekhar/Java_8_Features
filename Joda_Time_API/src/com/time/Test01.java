package com.time;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Test01 {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> bp=(a,b)->a>b;
//		Predicate<> bp=(a)->a+b;
		System.out.println(bp.test(10, 9));
	}
}
