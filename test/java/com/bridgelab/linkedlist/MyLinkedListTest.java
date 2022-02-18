package com.bridgelab.linkedlist;

import org.junit.Test;
import org.junit.Assert;
import java.util.LinkedList;

public class MyLinkedListTest {
	@Test
	public void given3NumberWhenAddedToLinkedShouldBeAddedToTop() {
		System.out.println("\nAdded to top");
		MyNode<Integer> myFirstNode= new MyNode<>(70);
		MyNode<Integer> mySecondNode= new MyNode<>(30);
		MyNode<Integer> myThirdNode= new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myThirdNode) &&
						 myLinkedList.head.getNext().equals(mySecondNode) &&
						 myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void given3NumbersWhenAppendedShouldBeAddedToLast() {
		System.out.println("\nAdded to last");
		MyNode<Integer> myFirstNode= new MyNode<>(56);
		MyNode<Integer> mySecondNode= new MyNode<>(30);
		MyNode<Integer> myThirdNode= new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myFirstNode) &&
						 myLinkedList.head.getNext().equals(mySecondNode) &&
						 myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
		System.out.println("\nInsert in between");
		MyNode<Integer> myFirstNode= new MyNode<>(56);
		MyNode<Integer> mySecondNode= new MyNode<>(30);
		MyNode<Integer> myThirdNode= new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myFirstNode) &&
						 myLinkedList.head.getNext().equals(mySecondNode) &&
						 myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void given3NumbersWhenAppendedToLinkedListFirstNumberShouldBeDeleted() {
		System.out.println("\nDeleted first number");
		MyNode<Integer> myFirstNode= new MyNode<>(56);
		MyNode<Integer> mySecondNode= new MyNode<>(30);
		MyNode<Integer> myThirdNode= new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.pop();
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(mySecondNode) &&
						 myLinkedList.head.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void given3NumbersWhenAppendedToLinkedListLastNumberShouldBeDeleted() {
		System.out.println("\nDeleted Last number");
		MyNode<Integer> myFirstNode= new MyNode<>(56);
		MyNode<Integer> mySecondNode= new MyNode<>(30);
		MyNode<Integer> myThirdNode= new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.popLast();
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myFirstNode) &&
						 myLinkedList.head.getNext().equals(mySecondNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void given3NumberWhenAppendedToLinkedListShouldSearch30() {
		System.out.println("\nSearch number 30");
		MyNode<Integer> myFirstNode= new MyNode<>(56);
		MyNode<Integer> mySecondNode= new MyNode<>(30);
		MyNode<Integer> myThirdNode= new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printMyNode();
		boolean result = myLinkedList.search(mySecondNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void given3NumberSearch30InLinkedListShouldBeInserted40After30() {
		System.out.println("\nSearch number 30 and add 40 after it");
		MyNode<Integer> myFirstNode= new MyNode<>(56);
		MyNode<Integer> mySecondNode= new MyNode<>(30);
		MyNode<Integer> myThirdNode= new MyNode<>(70);
		MyNode<Integer> myFourthNode= new MyNode<>(40);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.searchThenInsert(mySecondNode, myFourthNode);
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myFirstNode) &&
				 myLinkedList.head.getNext().equals(mySecondNode) &&
				 myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
	@Test
	public void givenSearchnumber40InLinkedListShouldBeDeleted() {
		System.out.println("\nSearch number 40 and delete it");
		MyNode<Integer> myFirstNode= new MyNode<>(56);
		MyNode<Integer> mySecondNode= new MyNode<>(30);
		MyNode<Integer> myThirdNode= new MyNode<>(70);
		MyNode<Integer> myFourthNode= new MyNode<>(40);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.searchThenDelete(myFourthNode);
		myLinkedList.printMyNode();
		System.out.println("Size of linked list: " +myLinkedList.size());
		boolean result = myLinkedList.head.equals(myFirstNode) &&
				 myLinkedList.head.getNext().equals(mySecondNode) &&
				 myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);	
	}
	
	@Test
	public void givenShouldReturn() {
		System.out.println("\nOrdered Linked List");
		OrderedLinkedList<Integer> linkedList = new OrderedLinkedList<>();
		linkedList.add(56);
		linkedList.add(30);
		linkedList.add(70);
		linkedList.add(40);
		linkedList.printMyNodes();
		int head =linkedList.head.data;
			Assert.assertEquals(30, head);
	}
}





