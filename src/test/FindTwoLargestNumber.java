package test;

public class FindTwoLargestNumber {

	public static void main(String[] args) {
		int numArr[] = { 2, 5, 14, 1, 26, 65, 123, 6 }; // Assign lowest possible int value
		int firstNum = 0;
		int secondNum = 0;
		int thirdNumb = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			if (firstNum < numArr[i]) {
				//thirdNumb = secondNum;
				secondNum = firstNum;
				firstNum = numArr[i];
			} else if (secondNum < numArr[i]) {
				secondNum = numArr[i];
			}
		}
		System.out.println("Top two numbers : First - " + firstNum + " Second " + secondNum +" third "+thirdNumb);
	}
}
