package com.app.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
	public static void of() {
		//		public static<T> Stream<T> of(T t) {..}
		//		public static<T> Stream<T> of(T... values) {..}
		System.out.println("Stream.of");
		List<Integer> l=Arrays.asList(10,21,52,10,91,33,70,24,25,74);
		System.out.println(l);
		l.stream().forEach(System.out::println);
		Stream.of(l).forEach(System.out::println);
		Stream.of(10,34,17,85,257,3,7,2,674,26).forEach(System.out::println);
		Object[] ob= {10,20,30,60,29,40};
		Long[] i=Arrays.stream(ob).map(w->(Long)(long)(int)(Integer)w).toArray(Long[]::new);
		System.out.println(Arrays.toString(i));
	}
	public static void filter() {
		//Stream<T> filter(Predicate<? super T> predicate);
		System.out.println("filter");
		List<Integer> l=Arrays.asList(10,21,52,10,91,33,70,24,25,74);
		System.out.println(l);
		List l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1);
		Set s1=l.stream().filter(i->i%2==0).collect(Collectors.toSet());
		System.out.println(s1);
		l.stream().filter(i->i>30).forEach(i->System.out.println(i));
	}
	public static void map() {
		//<R> Stream<R> map(Function<? super T, ? extends R> mapper);
		System.out.println("map");
		List<Integer> l=Arrays.asList(10,21,52,10,91,33,70,24,25,74);
		System.out.println(l);
		List l1=l.stream().map(i->i+100).collect(Collectors.toList());
		System.out.println(l1);
		Set s1=l.stream().map(i->(i%2==0)?(i+100):(i+10)).collect(Collectors.toSet());
		System.out.println(s1);
	}
	public static void collect() {
		//<R, A> R collect(Collector<? super T, A, R> collector);
		System.out.println("collect");
		List<Integer> l=Arrays.asList(10,21,52,10,91,33,70,24,25,74);
		System.out.println(l);
		//List l1=l.stream().map(i->i+100).collect(Collectors.toList());
		List l1=l.stream().map(i->i+100).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(l1);
	}
	public static void count() {
		//		long count();
		System.out.println("count");
		List<Integer> l=Arrays.asList(10,21,52,10,91,33,70,24,25,74);
		System.out.println(l);
		List l1=l.stream().filter(i->i>30).collect(Collectors.toList());
		System.out.println(l1);
		Long count=l.stream().filter(i->i>30).count();
		System.out.println(count);

	}
	public static void sorted() {
		//		Stream<T> sorted();
		//		Stream<T> sorted(Comparator<? super T> comparator);
		System.out.println("sorted");
		List<Integer> l=Arrays.asList(10,21,52,10,91,33,70,24,25,74);
		System.out.println(l);
		//List l1=l.stream().sorted().collect(Collectors.toList());
		List l1=l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l1);
	}
	public static void min() {
		//		Optional<T> min(Comparator<? super T> comparator);
		//		Optional<T> max(Comparator<? super T> comparator);
		System.out.println("min");
		List<Integer> l=Arrays.asList(10,21,52,10,91,33,70,24,25,74);
		System.out.println(l);
		Integer min=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		//		Integer min=l.stream().min((i1,i2)->-i1.compareTo(i2)).get();
		Integer max=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		System.out.println(max);
	}
	public static void forEach() {
		//		void forEach(Consumer<? super T> action);
		System.out.println("forEach");
		List<Integer> l=Arrays.asList(10,21,52,10,91,33,70,24,25,74);
		System.out.println(l);
		l.stream().forEach(i-> System.out.print(i+10));
		l.stream().sorted().forEach(System.out::println);
	}
	public static void toArray() {
		//		Object[] toArray();
		//		<A> A[] toArray(IntFunction<A[]> generator);
		System.out.println("forEach");
		List<Integer> l=Arrays.asList(10,21,52,10,91,33,70,24,25,74);
		System.out.println(l);
		Object[] s=l.stream().toArray();
		Stream.of(s).forEach(System.out::println);

		Integer[] i=l.stream().toArray(Integer[]::new);
		Stream.of(i).forEach(System.out::print);

		System.out.println("------");
		Long[] q=Stream.of(s).map(w->(Long)(long)(int)w).toArray(Long[]::new);
		Stream.of(q).forEach(System.out::println);

	}
	public static void allMatch() {
		//		boolean allMatch(Predicate<? super T> predicate);
		//		boolean anyMatch(Predicate<? super T> predicate);
		//		boolean noneMatch(Predicate<? super T> predicate);
		System.out.println("allMatch");
		List<Integer> l=Arrays.asList(10,2,4,4,4,8,12);
		System.out.println(l);
		//		Boolean b=l.stream().allMatch(i->i%2==0);
		//		Boolean b=l.stream().anyMatch(i->i%2==0);
		Boolean b=l.stream().noneMatch(i->i%2==1);
		System.out.println(b);
		l.stream().distinct().forEach(System.out::print);

	}
	public static void distinct() {
		//		Stream<T> distinct();
		System.out.println("distinct");
		List<Integer> l=Arrays.asList(10,2,4,4,4,8,8,null,null,12);
		System.out.println(l);
		l.stream().distinct().forEach(System.out::print);
	}
	public static void reduce() {
//		T reduce(T identity, BinaryOperator<T> accumulator);
//		Optional<T> reduce(BinaryOperator<T> accumulator);
		System.out.println("reduce");
		List<Integer> l=Arrays.asList(10,21,52,10,91,33,70,24,25,74);
		System.out.println(l);
//		Integer r=l.stream().reduce(0, (a,b)->a+b);
//		Integer r=l.stream().reduce(0,Integer::sum);		
//		Integer r=l.stream().reduce((a,b)->(a>b)?a:b).get();		
		Integer r=l.stream().reduce(Integer::min).get();		
		System.out.println(r);
	}
	public static void main(String[] args) {		

		//		of();
		
		//		filter();
		//		map();
		//		collect();
		//		count();
		//		sorted();
		//		min();
		//		forEach();
		//		toArray();
		//		allMatch();
		//		distinct();
		
		reduce();


	}
}
