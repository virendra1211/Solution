package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Whirlpool
 * @author Eshu
 *
 */
public class SolutionWhirlpool {

	public static void main(String[] args) {
		System.out.println("test");
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// findIfKeyisPresent(arr,12);

		List<Integer> ll = Arrays.stream(arr).flatMapToInt(Arrays::stream).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		
		String str = "abc23598";

		int sum = IntStream.range(0, str.length()).filter(index -> Character.isDigit(str.charAt(index)))
				.map(e -> Integer.parseInt(str.charAt(e)+"")).peek(System.out::println)
				.sum();
		
		System.out.println("---18line " + sum);
		String ss = "dfdf";
		/*
		 * Integer sums = IntStream.range(0, str.length()).filter(index -> index % 2 ==
		 * 0) .mapToObj(a -> Integer.parseInt(val.charAt(a) +
		 * "")).collect(Collectors.toList()).stream() .mapToInt(a ->
		 * a.intValue()).peek(s -> System.out.println(s)).sum();
		 */
		List<Integer> nums = IntStream.range(0, str.length()).filter(index -> Character.isDigit(str.charAt(index)))
				.map(n -> Integer.parseInt(str.charAt(n) + ""))
				.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		System.out.println("----" + nums);
	int ans =	IntStream.range(0, str.length()).filter(index -> Character.isDigit(str.charAt(index)))
		.map(n -> Integer.parseInt(str.charAt(n) + ""))
		.collect(ArrayList::new, ArrayList::add, ArrayList::addAll).stream().mapToInt(p -> Integer.parseInt(p.toString())).filter(p -> p%2 != 0).sum();
System.out.println("=== " + ans);

		int sss = nums.stream().filter(p -> p % 2 != 0).mapToInt(g -> g).sum();
		System.out.println(sss);
		int sumVal = IntStream.range(0, nums.size()).mapToObj(n -> nums.get(n)).mapToInt(g -> g)
				.filter(num -> num % 2 == 0).sum();
		System.out.println("--" + sumVal);

		List<Integer> listInteger = Arrays.asList(6, 2, 5, 3, 11, 16, 4);
		int sumv = listInteger.stream().filter(p -> p % 2 == 0).mapToInt(g -> g).sum();
		System.out.println(sumv);
	}

	private static void findIfKeyisPresent(int[][] arr, int key) {
		int row = 0;
		int col = arr[0].length - 1;

		while (row < arr.length && col >= 0) {
			if (arr[row][col] == key) {
				System.out.println("Key is found in " + row);
				return;
			} else if (arr[row][col] < key) {
				row++;
			} else {
				col--;
			}
		}
		System.out.println(key + "key not found");
	}

}
