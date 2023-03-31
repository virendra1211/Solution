package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
Design and implement algorithm to find most frequently occurring word(s) in given input.
Example Input : "Virendra is employee of ABC company, virendra is from Pune, VIRENDRA! is good in algorithms."
Expected output:
Virendra – 3
is - 3
NetCracker
 */
public class StringDuplicateCount_netcracker {
	public static String getOnlyStrings(String s) {
		Pattern pattern = Pattern.compile("[^a-z A-Z]");
		Matcher matcher = pattern.matcher(s);
		String number = matcher.replaceAll("");
		return number;
	}

	public static void main(String[] args) {
		// more than one word
		// most frequent max will get
		// remove or skip special character
		String str = "Virendra is employee of ABC company, virendra is from Pune, VIRENDRA! is good in algorithms.";

		str = getOnlyStrings(str);
		String s[] = str.split(" ");
		Map<String, Long> result = Arrays.stream(str.toUpperCase().split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Entry<String, Long> maxCountMap = result.entrySet().stream()
				.sorted(Entry.comparingByValue(Comparator.reverseOrder())).findFirst().get();
		Long maxCount = maxCountMap.getValue();
		Map<String, Long> result1 = result.entrySet().stream().filter(p -> p.getValue() == maxCount)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o, n) -> n, LinkedHashMap::new));
		//System.out.println(result1);

		
		Map<String,Long> finalResult = new HashMap<>();
		int count =0;
		for (int i = 0; i < s.length; i++) {
			if(result1.containsKey(s[i].toString().toUpperCase())) {
				finalResult.put(s[i].toString(), result1.get(s[i].toString().toUpperCase()));
			count++;
			}
			if(count == result1.size())
				break;
		}
		System.out.println(finalResult);

	}

}
