package test;

// Java implementation of the above approach
import java.util.*;

/*
 * https://www.geeksforgeeks.org/maximize-partitions-that-if-sorted-individually-makes-the-whole-array-sorted/
 * Maximize partitions that if sorted individually makes the whole Array sorted 
 */
public class GFG {

// Function to find maximum partitions.
	static int maxPartitions(int[] arr) {
		int N = arr.length;

		// To keep track of max
		// and min elements at every index
		int[] leftMax = new int[arr.length];
		int[] rightMin = new int[arr.length];

		leftMax[0] = arr[0];

		for (int i = 1; i < N; i++) {
			leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
		}
		System.out.println(Arrays.toString(leftMax));
		rightMin[N - 1] = arr[N - 1];

		for (int i = N - 2; i >= 0; i--) {
			rightMin[i] = Math.min(rightMin[i + 1], arr[i]);
		}
		System.out.println("--"+Arrays.toString(rightMin));
		
		int count = 0;

		for (int i = 0; i < N - 1; i++) {
			if (leftMax[i] <= rightMin[i + 1]) {
				count++;
			}
		}

		// Return count + 1 as the final answer
		return count + 1;
	}

// Driver code
	public static void main(String args[]) {
		//int[] arr = { 10, 0, 21, 32, 68 };
	//	int[] arr = {2,4,1,6,5,9,7};
		//int[] arr = {4,3,2,6,1};
		int[] arr = {2,1,6,4,3,7};

		System.out.println(maxPartitions(arr));
	}
}

// This code is contributed by Samim Hossain Mondal.
