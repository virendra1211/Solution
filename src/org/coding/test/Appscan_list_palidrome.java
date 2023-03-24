package org.coding.test;

import java.util.Stack;
/*
 * Function to check if a singly linked list is palindrome

a b b a 

Input: R->A->D->A->R->NULL
Output: Yes
 */
public class Appscan_list_palidrome {
	public static void main(String args[]) {
		/*
		 * Node<Character> one = new Node<>(1); Node<Character> two = new Node<>(2);
		 * Node<Character> three = new Node<>(3); Node<Character> four = new Node<>(4);
		 * Node<Character> five = new Node<>(3); Node<Character> six = new Node<>(2);
		 * Node<Character> seven = new Node<>(1);
		 */
		Node<Character> one = new Node<>('R');
		Node<Character> two = new Node<>('A');
		Node<Character> three = new Node<>('D');
		Node<Character> four = new Node<>('A');
		Node<Character> five = new Node<>('R');
		Node<Character> six = new Node<>(null);
		
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		/*
		 * five.next = six; six.next = seven;
		 */
		boolean condition = isPalindrome(one);
		System.out.println("isPalidrome :" + condition);
	}

	static boolean isPalindrome(Node<Character> head) {
		Node<Character> slow = head;
		boolean ispalin = true;
		Stack<Character> stack = new Stack<Character>();

		while (slow != null) {
			if(slow.data !=null)
			stack.push(slow.data);
			slow = slow.next;
		}

		while (head != null) {
			if(stack.size()== 0) break;
			Character i = stack.pop();
			if (head.data == i) {
				ispalin = true;
			} else {
				ispalin = false;
				break;
			}
			head = head.next;
		}
		return ispalin;
	}
}

class Node<T>
{
	T data;
	Node next;
	Node(T d)
	{
	    next = null;
	    data = d;
	}
}
