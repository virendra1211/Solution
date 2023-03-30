package codingtest;

import java.util.Arrays;
import java.util.OptionalInt;

public class OccurencesInArraywithoutCollection {

	public static void main(String[] args) {
		int i[] = {2,6,5,8,2,9,1,10,6,9,5,2};
		
		OptionalInt optionalInt = Arrays.stream(i).max();
		int max = optionalInt.getAsInt();
		System.out.println(max);
		int p[] =  new int[max+1];
		for(int oc:i) {
			p[oc]++;
		}
		Arrays.stream(p).forEach(System.out::println);
	}

}
