package com.datastructures;

public class Stack extends LinkedList {
	
	public Stack() {
		head = tail = null;
	}
	
	public void push(int item) {
		Node newNode = new Node(item);
		if (isEmpty()) {
			head = tail = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public Integer poop() {
		if (isEmpty()) {
			return null;
		}else if (size()==1) {
			int popedItem = tail.item;
			head = tail = null;
			return popedItem;
		}else {
			int popedItem = head.item;
			head = head.next;
//			Node currNode = head;
//			while (currNode.next.next != null) {
//			currNode = currNode.next;
//			}
//			currNode.next = null;
			return popedItem;
		}
	}
	
	public Integer peek() {
		return head.item;
	}
	
	
	
	@Override
	public String toString() {
		if(isEmpty()) {
			return "null";
		}else {
			return head.toString();
		}
	}
	
	public static void main(String[] args) {
     Stack newStack = new Stack();
     newStack.push(1);
     newStack.push(2);
     newStack.push(3);
     newStack.push(4);
     newStack.poop();
     System.out.println(newStack);
     System.out.println( newStack.poop());
     System.out.println(newStack);
     System.out.println( newStack.poop());
     System.out.println(newStack);
     System.out.println( newStack.poop());
     System.out.println(newStack);
     newStack.push(2);
     newStack.push(3);
     newStack.push(4);
     System.out.println(newStack.peek());
     
	}

}
