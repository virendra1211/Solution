package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {
	public static void main(String[] args) {
		String str = "abcabcdabcde";
		//String str = "ABDEFGABEF";
		lengthOfLongestSubstring(str);
	}

	public static void lengthOfLongestSubstring(String s) {

		Map<Character, Integer> map = new LinkedHashMap<>();
		char c[] = s.toCharArray();
		int longestSubstringLength = 0;
		String longestSubstring = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = c[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				System.out.println(" ====== " + i + " " + ch);
				map.clear();
			}
			if (map.size() > longestSubstringLength) {
				longestSubstringLength = map.size();
				longestSubstring = map.keySet().toString();
			}
		}
		System.out.println("Longest Substring length " + longestSubstringLength);
		System.out.println("Longest Substring " + longestSubstring);
	}
}