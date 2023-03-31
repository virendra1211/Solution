package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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
public class StringDuplicateCount_netcracker2 {
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
		System.out.println(getOnlyStrings(str));
		Map<String, Long> result = Arrays.stream(str.toUpperCase().split(" "))
				.collect(Collectors.groupingBy(StringDuplicateCount_netcracker2::myfun, Collectors.counting()));
		// System.out.println(result);
		ArrayList<Map.Entry<String, Long>> list = new ArrayList<>(result.entrySet());
		Collections.sort(list, (k, v) -> v.getValue().compareTo(k.getValue()));
		// Optional<Entry<String, Long>> optionalResult =
		// list.stream().max(Map.Entry.comparingByValue());

		Long maxValue = list.get(0).getValue();
		Map<String, Long> finalResult = new HashMap<>();
		for (Map.Entry<String, Long> map : list) {
			if (maxValue == map.getValue()) {
				// System.out.println(map.getKey() +" "+map.getValue());
				finalResult.put(map.getKey(), map.getValue());
			}
		}
		String arrayOfString[] = str.split(" ");
		Map<String, Long> result1 = new HashMap<>();
		for (int i = 0; i < arrayOfString.length; i++) {
			if (finalResult.containsKey(arrayOfString[i].toString().toUpperCase())) {
				result1.put(arrayOfString[i].toString(), finalResult.get(arrayOfString[i].toString().toUpperCase()));
			}
		}

		System.out.println(result1);

	}

	@SuppressWarnings("unchecked")
	private static String myfun(String t1) {
		if (t1.toString().matches("[A-Z]")) {
			return t1;
		} else {
			return skipSpecialCharacter(t1.toString());
		}

	}

	public static String skipSpecialCharacter(String str) {

		StringBuffer sb = new StringBuffer();
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (Character.isAlphabetic(c[i]))
				sb.append(c[i]);
		}
		return sb.toString();
	}

}
