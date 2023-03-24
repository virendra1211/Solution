package org.coding.test;

/*
 * Given an array of integers, create a new array, that will replace each element of the input array by a 
  "closest" number smaller than itself that is on its right side of its position.
If there is no smaller number to its right, then retain the number.
 */
public class Appscan_closest_int_right {

	public static void main(String[] args) {
		int p[] = //{2, 0, 2, 5, 1};
		{3, 4, -5, 8, 9, 9, 2, -7};
		for(int i=0;i<p.length;i++) {
			for(int j=i+1;j<p.length;j++) {
				//System.out.println(p[i] +"  "+i+" $"+p[j]+" "+j);
				if(p[i] > p[j]) {
					p[i] = p[j];
					break;
				}
			}
		}
		
		for(int g:p) {
			System.out.println(g);
		}
	}
	

}
