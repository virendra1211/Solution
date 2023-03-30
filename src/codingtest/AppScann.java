package codingtest;

import java.util.Arrays;

public class AppScann {
	/*
	 * 1) Given a Number how can you figure out largest number that can be divisible
	 * by 3. Ex: 145 -> Output : 54
	 */
	public static void main(String[] args) {

		int num = 145;

		int sum=0;
		int count =0;
		while(num !=0) {
			int reminder = num%10;
			num = num/10;
		   sum = sum*10 + reminder;	
		}
		
		String numStr = 145 + "";
		char[] chars = numStr.toCharArray();
		Integer[] intArr = new Integer[numStr.length()];
		
		
		  for (char c : chars) { intArr[count] = (int) c; count++; }
		  
		  // 145 // 1 4 5
		
		  int[] sorted = Arrays.stream(intArr).mapToInt(p ->p).sorted().toArray();
		  
			for (int i = sorted.length - 1; i > 0; i++) {
				int result = getNumber(i, sorted);

				if (result % 3 == 0) {
					System.out.println(result);
				}
			}
		 
	}

	public static int getNumber(int numberOfDigits, int[] sorted) {

		int num = 0;
		for (int i = 0; i <= numberOfDigits; i++) {
			num = 10 * num + Integer.valueOf(sorted[i]+"");// 10*0 + 5-> 5.... 10*5+4-> 54 ...54*10+1-> 541
		}

		return num;
	}

}
