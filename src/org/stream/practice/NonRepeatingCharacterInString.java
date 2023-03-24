package org.stream.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacterInString {
	public static void main(String[] args) {
		nonRepeatingCharacterInString();
	}
	public static void nonRepeatingCharacterInString() {
			String input = "Java Hungry Blog Alive is Awesome";
			Character result = input.chars().mapToObj(p -> Character.toLowerCase(Character.valueOf((char)p))).
					collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).
					entrySet().
					stream().
					filter(entry -> entry.getValue() == 1).
					map(entry -> entry.getKey()).
					findFirst().
					get();
			System.out.println(result);
			
			
			List<Integer> intList = Arrays.asList(1,4,2,6,2,7,6,4,12,42,63,35,1,55,4);
			
			Map<Object,Object> inp = intList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			.entrySet().stream().filter(p ->p.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
			System.out.println("--- "+inp);
		}
}

