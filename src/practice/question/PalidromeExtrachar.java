package practice.question;

public class PalidromeExtrachar {

	public static void main(String[] args) {
		String str = "ABCBXA";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(str.equals(sb.reverse().toString()));
	
		int idx = verifyExtraPalidromChar(str, 0, str.length() - 1);
		 if (idx == -1)
	            System.out.println("Not Possible");
	        else if (idx == -2)
	            System.out.println("Possible without " +
	                        "removing any character");
	        else
	            System.out.println("Possible by removing" +
	                            " character at index " + idx + " - "+str.charAt(4));
	}

	static boolean isPalindrome(String str, int low, int high) {
		while (low < high) {
			if (str.charAt(low) != str.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}

	private static int verifyExtraPalidromChar(String str, int low, int high) {

		int count = 0;
		while (low <= high) {
			if (str.charAt(low) == str.charAt(high)) {
				low++;
				high--;
				count++;
			} else {
				if(isPalindrome(str, low+1, high)) {
					return low;
				}
				if(isPalindrome(str, low, high-1)) {
					return high;
				}
				return -1;
			}
		}
		System.out.println(count + " " + str.length());
		return -2;
	}

}
