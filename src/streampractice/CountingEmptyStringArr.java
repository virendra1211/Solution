package streampractice;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingEmptyStringArr {

	public static void main(String[] args) {
		// I Counting Empty String
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk"); 
		long count = strList.stream() .filter(x -> x.isEmpty()) .count();
		System.out.println(count);

		// II Count number of String which starts with "a"

		count = strList.stream() .filter(x -> x.startsWith("a")) .count();
		System.out.println(count);
		
		// III  Remove all empty Strings from List
		List<String> filtered = strList.stream() .filter(x -> !x.isEmpty()) .collect(Collectors.toList());
		
		// IV Convert String to uppercase and Join them with coma

		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
		String joinedStr = G7.stream().map(String::toUpperCase).collect(Collectors.joining(","));
		System.out.println(joinedStr);
		
		// V Create a List of the square of all distinct numbers

		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		numbers.stream().map(p->p*p).distinct().forEach(System.out::println);
		
		// VI summary stastics will get based on this all max,min,sum,count,average
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29); 
		IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics();
		System.out.println(stats);
		
		// VII iterate number of times
		Stream.iterate(1 , element ->element+1).filter(element -> element%10==0 ).limit(5).
		forEach(System.out::println);
		
		// VIII 
	}

}
