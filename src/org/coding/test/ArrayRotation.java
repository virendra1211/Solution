package org.coding.test;

import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args) {
		int[] numArr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int temp1[] = {1,2,3};
		int temp2[] = {4, 5, 6, 7, 8 };
		 rotateLeft(temp1, 1);
		rotateRight(temp2, 1);
		int result[] = new int[temp1.length+temp2.length];
		
		for(int i=0;i<temp1.length;i++) {
			result[i] = temp1[i];
		}
		int j=0;
		for(int i=temp1.length;i<result.length;i++,j++) {
			result[i] = temp2[j];
		}
		
		System.out.println(Arrays.toString(result));
	}

	private static void rotateLeft(int[] numArr, int steps) {
		// create temp array
		int[] temp = new int[numArr.length];
		// copy elements to the temp array
		for (int i = 0; i < steps; i++) {
			temp[(numArr.length - steps) + i] = numArr[i];
		}
		// 6 = 0, 7 = 1
		// copy rest of the elements from the original array
		int i = 0;
		for (int j = steps; j < numArr.length; j++, i++) {
			temp[i] = numArr[j];
		}
		// copy from temp to original
		System.arraycopy(temp, 0, numArr, 0, numArr.length);
		//numArr = temp;
		System.out.println("Array after left rotation- " + Arrays.toString(numArr));
	}

	private static void rotateRight(int[] numArr, int steps) {
		// create temp array
		int[] temp = new int[numArr.length];
		// copy elements to the temp array
		for (int i = 0; i < steps; i++) {
			temp[i] = numArr[(numArr.length - steps) + i];
		}
		// copy rest of the elements from the original array
		int i = steps;
		for (int j = 0; j < numArr.length - steps; j++, i++) {
			temp[i] = numArr[j];
		}
		System.arraycopy(temp, 0, numArr, 0, numArr.length);
		System.out.println("Array after right rotation- " + Arrays.toString(temp));
	}
}