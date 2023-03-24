package org.coding.test;

//Java program to implement
//a Singly Linked List
public class Appscan_2_LinkedlistSort {

	Node head; // head of list

	// Linked list Node.
	// This inner class is made static
	// so that main() can access it
	static class Node {

		int data;
		Node next;

		// Constructor
		Node(int d) {
			data = d;
			next = null;
		}
	}

	// Method to insert a new node
	public static Appscan_2_LinkedlistSort insert(Appscan_2_LinkedlistSort list, int data) {
		// Create a new node with given data
		Node new_node = new Node(data);
		new_node.next = null;

		// If the Linked List is empty,
		// then make the new node as head
		if (list.head == null) {
			list.head = new_node;
		} else {
			// Else traverse till the last node
			// and insert the new_node there
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			// Insert the new_node at last node
			last.next = new_node;
		}

		// Return the list by head
		return list;
	}

	// Method to print the LinkedList.
	public static void printList(Appscan_2_LinkedlistSort list) {
		Node currNode = list.head;

		System.out.print("LinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");

			// Go to next node
			currNode = currNode.next;
		}
	}

	// Driver code
	public static void main(String[] args) {
		/* Start with the empty list. */
		Appscan_2_LinkedlistSort list = new Appscan_2_LinkedlistSort();

		//
		// ******INSERTION******
		//
		// 1 -> 1 -> 2 -> 0 -> 2 -> 0 -> 1
		// Insert the values
		list = insert(list, 1);list = insert(list, 5);
		list = insert(list, 6);list = insert(list, 7);
		list = insert(list, 2);list = insert(list, 3);
		list = insert(list, 4);list = insert(list, 8);

		// Print the LinkedList
		printList(list);
		list.sortList();
		System.out.println();
		printList(list);

	}

	public void sortList() {

		// Node current will point to head
		Node current = head, index = null;

		int temp;

		if (head == null) {
			return;
		} else {
			while (current != null) {
				// Node index will point to node next to
				// current
				index = current.next;

				while (index != null) {
					// If current node's data is greater
					// than index's node data, swap the data
					// between them
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}

					index = index.next;
				}
				current = current.next;
			}
		}
	}
}
