package practice.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class OddAndEvenSorting {
	// To do two way sort. First sort even numbers in
	// ascending order, then odd numbers in descending
	// order.
	static void twoWaySort(int arr[], int n) {
		// Make all odd numbers negative
		for (int i = 0; i < n; i++)
			if ((arr[i] & 1) != 0) // Check for odd also use arr[i] %2
				arr[i] *= -1;

		// Sort all numbers
		Arrays.sort(arr);

		// Retaining original array
		for (int i = 0; i < n; i++)
			if ((arr[i] & 1) != 0)
				arr[i] *= -1;
	}

	// Driver Method
	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 7, 3, 4, 12, 10 };

		twoWaySort(arr, arr.length);

		System.out.println(Arrays.toString(arr));
		SortCollectionWay();
	}

	// Utility function to print
	// the contents of the array
	static void printArr(ArrayList<Integer> arr, int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr.get(i) + " ");
	}

	// Driver code
	public static void SortCollectionWay() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(7);
        arr.add(5);
        arr.add(4);
        int n = arr.size();
 
 
        // Sort the array
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
 
                // If both numbers are even,
                // smaller number should
                // be placed at lower index
                if (a % 2 == 0 && b % 2 == 0)
                    return (a - b);
 
                // If both numbers are odd larger number
                // should be placed at lower index
                if (a % 2 != 0 && b % 2 != 0)
                    return (b - a);
 
                // If a is odd and b is even,
                // a should be placed before bm
                if (a % 2 != 0)
                    return -1;
 
                // If b is odd and a is even,
                // b should be placed before a
                return 0;
            }
        });
         
        // Print the sorted array
        printArr(arr, n);
    }
}