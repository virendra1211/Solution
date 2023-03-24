package org.coding.test;

import java.util.Arrays;

class FlowerBloomOnlineTest {
	public static void main(String[] args) {
		
		int plantTime[] = //{1,2,3,2};
		//{1,4,3};
		//{1,1,1};
		{9,7,3,8,3,2,9,5,2,4};
		int growTime[] = //{2,1,2,1};
		//{2,3,1};
		//{3,2,1};
			{6,5,8,6,4,4,4,8,1,2};
		int ans = new FlowerBloomOnlineTest().earliestFullBloom(plantTime,growTime);
		System.out.println(ans);
		
	}
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        
        return plantTime != null && growTime != null ? earliestFullBloom(plantTime, growTime, plantTime.length) : 0;
    }

    private int earliestFullBloom(int[] plantTime, int[] growTime, int n) {

        int radix = Arrays.stream(growTime).max().getAsInt();

        int[] A = new int[radix + 1];

        for (int growT : growTime) {
            A[growT]++;
        }

        int[] B = new int[radix + 1];
        int currentSum = 0;

        for (int i = radix; i >= 0; i--) {
            currentSum += A[i];
            B[i] = currentSum;
        }

        int[] sPlant = new int[n];
        int[] sGrow = new int[n];

        for (int i = 0; i < n; i++) {
            sGrow[--B[growTime[i]]] = growTime[i];
            sPlant[B[growTime[i]]] = plantTime[i];
        }

        int totalSum = 0;
        int most = 0;

        for (int i = 0; i < n; i++) {
            totalSum += sPlant[i];
            most = Integer.max(most, sGrow[i] + totalSum);
        }

        return most;
    }
}
