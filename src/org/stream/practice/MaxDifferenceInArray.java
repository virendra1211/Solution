package org.stream.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxDifferenceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = { 2, 3, 10, 6, 4, 8, 1 }; // it should be 8
		 int arr[] = {7, 9, 5, 6, 3, 2}; // it should be 2
		int max_diff = arr[1] - arr[0];
		int value1 = arr[1];
		int value2 = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] - arr[i] > max_diff) {
					max_diff = arr[j] - arr[i];
					value1 = arr[j];
					value2 = arr[i];
				}
			}
		}
		System.out.println("difference "+max_diff+"  value "+value1+"  "+value2);
		
		List<Integer> list = Arrays.asList(5,15,11,12,8,6);
		Collections.reverse(list);
		System.out.println(list);
	}

}
