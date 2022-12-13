package org.string;


import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {
	public static void main(String[] args) {
		String str = "abcabcdabcde";
		lengthOfLongestSubstring(str);
		/*
		 * a b c a b c d
		 * 0 1 2 3 4 5 6
		 * first phase 0-2 store and then remove and get i value 0 but one it's going to execution in for loop it become 1 so
		 * b c a clear again 1
		 * c a b clear again 2 
		 * a b c d not  require answer 
		 */
	}

	public static void lengthOfLongestSubstring(String s) {

		Map<Character, Integer> map = new LinkedHashMap<>();
		char c[] = s.toCharArray();
		int longestSubstringLength = 0;
		String longestSubstring ="";
		for (int i = 0; i < s.length(); i++) {
			char ch = c[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				System.out.println(" ====== "+i+" "+ch);
				map.clear();
			}
			if(map.size() > longestSubstringLength ) {
				longestSubstringLength = map.size();
				longestSubstring = map.keySet().toString();
			}
		}
		System.out.println("Longest Substring length "+longestSubstringLength);
		System.out.println("Longest Substring "+longestSubstring);
	}
}