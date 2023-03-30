package practicequestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoLinkedList {
	static class Node{
		Node next;
		int data;
	}
	public static Node newNode(int data) {
		Node temp = new Node();
		temp.data= data;
		temp.next = null;
		return temp;
	}
	
	public static void main(String[] args) {
		Node head1 = newNode(1);
		head1.next = newNode(3);
		head1.next = newNode(5);
		
		Node head2 = newNode(2);
		head2.next = newNode(4);
		head2.next = newNode(7);
		Node mergedList = merge(head1, head2);
		
		printList(mergedList);
		/*
		 * List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(3, 9, 15, 21,
		 * 26)); List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 8, 11,
		 * 13, 25, 29));
		 */
		/*
		 * List<Integer> mergedList = Stream.concat(list1.stream(),
		 * list2.stream()).sorted().collect(Collectors.toList());
		 * System.out.println(mergedList);
		 */

		/*
		 * List<Integer> otherWayToMerged = Stream.of(list1,
		 * list2).flatMap(Collection::stream).collect(Collectors.toList());
		 * System.out.println(otherWayToMerged);
		 */
	}

	private static void printList(Node node) {
		while(node !=null) {
			System.out.println(node.data);
			node = node.next ;
		}
	}

	private static Node merge(Node head1, Node head2) {
		// TODO Auto-generated method stub
		if(head1  == null)
			return head2;
		if(head2 == null)
			return head1;
		
		if(head1.data < head2.data) {
			head1.next = merge(head1.next,head2);
			return head1;
		}else {
			head2.next = merge(head1,head2.next);
			return head2;
		}
	}

	public static void takeWhileExample() {
		// create a stream of names
		Stream<String> stream = Stream.of("aman", "amar", "suraj", "suvam", "Zahafuj");

		// apply takeWhile to take all the names
		// matches passed predicate
		List<String> list = stream.takeWhile(name -> (name.charAt(0) == 'a')).collect(Collectors.toList());

		// print list
		System.out.println(list);
	}
}