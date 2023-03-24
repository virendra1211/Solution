package org.stream.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStreamListString {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		list.stream().sorted(Integer::compare).forEach(System.out::println);

		System.out.println("------------------");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		List<Integer> list1 = Arrays.asList(93, 55, 103, 53);

		List reverseOrder = IntStream.range(0, list1.size()).
				map(i -> list1.size() - 1 - i).mapToObj(list1::get)
				.collect(Collectors.toList());
		System.out.println(reverseOrder);
		
		System.out.println("--------");
		String str = "Indore";
		String reverseString = IntStream.range(0, str.length()).map(p -> str.length() - 1 - p)
				.mapToObj(p -> str.charAt(p)).map(Object::toString).collect(Collectors.joining());
		
		System.out.println("== "+reverseString);
		/* -------------------*/
		 char[] charArray = "Aniruddh".toCharArray();
		    IntStream.range(0, charArray.length)
		        .mapToObj(i -> charArray[(charArray.length - 1) - i])
		        .forEach(System.out::print);
	}
}
