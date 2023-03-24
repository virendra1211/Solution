package test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
	 private static String reverseString(String str){
		    // validation & base case
		    if((str == null) || (str.length() <= 1)){
		      return str;
		    }
		    // recursive call
		    return reverseString(str.substring(1)) + str.charAt(0);    
		  }
	public static boolean isLongPressedName(String name, String typed) {
	     int n = name.length();
	        int m = typed.length();
	        int i=0;
	        int j=0;
	        
	        String str = "abcdef";
	        System.out.println(reverseString(str));
			/*
			 * System.out.println(isLongPressedName("alex", "aaleex"));
			 * System.out.println(isLongPressedName("saeed", "ssaaedd"));
			 */
	        if(name.charAt(0) != typed.charAt(0)) //step 1
	            return false;
	        if(n>m){            // step 2
	            return false;
	        }
	        while(i<n && j<m){    //step 3
	            if(name.charAt(i) == typed.charAt(j)){
	                i++;
	                j++;
	            }
	            else if(name.charAt(i-1) == typed.charAt(j)){
	                j++;
	            }
	            else{
	                return false;
	            }
	        }
	        while(j<m){       //Step 4 & 5
	            if(name.charAt(i-1) == typed.charAt(j)){
	                j++;
	            }
	            else{
	                return false;
	            }
	        }
	        if(i<n){      // step 6
	            return false;
	        }
	        return true;       
	    }

	public static int lengthOfLongestSubstring(String str) {
		System.out.println(isLongPressedName("alex", "aaleex"));
		System.out.println(isLongPressedName("saeed", "ssaaedd"));
				
		int n = str.length();
		int res = 0;

		for (int i = 0; i < n; i++) {

			boolean[] visited = new boolean[256];

			for (int j = i; j < n; j++) {
				if (visited[str.charAt(j)] == true)
					break;

				else {
					res = Math.max(res, j - i + 1);
					visited[str.charAt(j)] = true;
				}
			}
			visited[str.charAt(i)] = false;
		}
		return res;
	}

	public static void main(String args[]) {
		// Your code goes here
		String s = "abcabcd";
		Main ob = new Main();
		System.out.println(ob.lengthOfLongestSubstring(s));

		String str = "Dewas";
		String reverseString = IntStream.range(0, str.length()).map(p -> str.length() - 1 - p)
				.mapToObj(p -> str.charAt(p)).map(Object::toString).collect(Collectors.joining());
		System.out.println(reverseString);

	}
}