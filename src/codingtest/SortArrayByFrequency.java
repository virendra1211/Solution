package codingtest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortArrayByFrequency {

	public static void secondApproach() {
		List<Integer> list = Arrays.asList(1, 2, 1, 3, 3, 1, 4, 5);
		Map<Integer, Long> segregateMapBycount = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		Map<Object, Object>  sortedMap = segregateMapBycount.entrySet().stream().sorted(Entry.comparingByValue(Comparator.reverseOrder())).
				collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o,n) ->n,LinkedHashMap::new));
		
		sortedMap.forEach((k,v)->{
			for(int i=0;i< Integer.parseInt(v.toString());i++) {
				System.out.println(k);
			}
		});
	
	}
	// Driver Code
	public static void main(String[] args)
	{
		secondApproach();
		// Declare and Initialize an array
		int[] array = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 };
		
		List<Integer> list = Arrays.asList(1, 2, 1, 3, 3, 1, 4, 5);
		Map<Integer, Long> hashMap = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// System.out.println(hashMap);
		Collections.sort(list, (a, b) -> {
			int freq = hashMap.get(b).compareTo(hashMap.get(a));
			int element = a.compareTo(b);
			if (freq == 0)
				return element;
			else
				return freq;
		});
		
		System.out.println(list);
	}
}