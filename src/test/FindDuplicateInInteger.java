package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateInInteger {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,5,2,6,5,8,9,10,11,8);
		
		List<Integer> ans = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().
		filter(p -> p.getValue()>1).map(p ->p.getKey()).collect(Collectors.toList());
		System.out.println(ans);
	}

}
