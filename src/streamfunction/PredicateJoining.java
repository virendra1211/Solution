package streamfunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateJoining {
	public static void main(String[] args) {

		Predicate<Integer> firstPredicate = number -> number>10;
		Predicate<Integer> secondPredicateForEven = p -> p%2 ==0;
		
		System.out.println(firstPredicate.and(secondPredicateForEven).test(0));
	
	List<Integer> list = Arrays.asList(3,11,13,16,15,17,34,36,39);
	
	List<Integer> l = list.stream().filter(p -> firstPredicate.and(secondPredicateForEven).test(p)).collect(Collectors.toList());
	System.out.println(l);
	}
}
