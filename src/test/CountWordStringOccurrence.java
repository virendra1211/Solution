package test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordStringOccurrence {
	public static void main(String[] args) {
		String str ="They are going to Punebut they are going to indore";
	
		Map<String, Long> map = Arrays.stream(str.split(" ")).map(p -> p)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

		System.out.println(map);
		
	}
}
