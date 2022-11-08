package com.datastructures;

public class Queue extends LinkedList
{
	public Queue()
	{
		head = tail = null;
	}
	
	public void enqueue(int data)
	{
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = tail = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public Integer dequeue()
	{
		if (isEmpty()) {
			return null;
		}else if (size()==1) {
			int popedItem = tail.item;
			head = tail = null;
			return popedItem;
		}else {
			int popedItem = tail.item;
			Node currNode = head;
			while (currNode.next.next != null) {
			currNode = currNode.next;
			}
			currNode.next = null;
			tail = currNode;
			return popedItem;
		}
	}
	
	
	public static void main(String[] args) 
	{
		Queue newQueue = new Queue();
		newQueue.enqueue(1);
		newQueue.enqueue(2);
		newQueue.enqueue(3);
		newQueue.enqueue(4);
		newQueue.enqueue(5);
		System.out.println(newQueue);
		System.out.println(newQueue.dequeue());
		System.out.println(newQueue);
		System.out.println(newQueue.dequeue());
		System.out.println(newQueue);
		

	}

}
