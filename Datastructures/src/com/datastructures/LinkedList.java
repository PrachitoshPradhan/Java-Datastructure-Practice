package com.datastructures;

public class LinkedList {
	Node head;
	Node tail;
	
	//Starting the linked list is empty
	public LinkedList() {
		head = tail = null;
	}
	
	//adding item before head
	public void add(int item) {
			Node newNode = new Node(item);   //creating a node using the item
		    if(isEmpty()) {
		    	head = tail = newNode;
		    }else {
		    	newNode.next = head;
		    	head = newNode;
		    }
		}
	
    public void append(int item) {
		Node newNode = new Node(item);
		 if(isEmpty()) {
		    	head = tail = newNode;
		    }else {
		    	 tail.next = newNode;
		    	 tail = tail.next;
		    }
	}
	
    public void insertAt(int position, int item) {
    	Node newNode = new Node(item);
    	Node currNode = head;
    	if(isEmpty()) {
    		head = tail = newNode;
    		return;
    	} if(position == 0) {
    		add(item);
    		return;
    	}if (position >= size()) {
    		append(item);
    		return;
    	}
    	for(int i=0; i < position-1; i++) {
    		currNode = currNode.next;
    	}
    	newNode.next = currNode.next;
    	currNode.next= newNode;
    }
	
	public void remove(int item) {
		if(!isEmpty()) {
			if(head.item == item) {   //if item is present in the head
				if(head == tail) {
					head = tail = null;
				}else {
					head= head.next;
				}
			}else {
				Node currNode = head;
				while (currNode.next != null) {
					if(currNode.next.item == item) {
						currNode.next = currNode.next.next;
						if(currNode.next == null) {
							tail = currNode;
						}
						return;
					}
					currNode = currNode.next;
				}
				
			}
		}
	}
	
	public boolean search(int item) {
		Node currNode = head;
		while (currNode != null) {
			if(currNode.item == item) {
				return true;
			}
			currNode = currNode.next;
		}
		return false;
	}
	
	public int size() {
		int count = 0;
		Node currNode = head;
		while(currNode != null) {
			count++;
			currNode = currNode.next;
		}
		return count;
	}
	
	public int index(int item) {
		int count = 0;
		Node currNode = head;
		while(currNode != null) {
			if(currNode.item == item) {
				return count;
			}
			count++;
			currNode = currNode.next;
		}
		
		return -1;
	}
	
	public Integer pop() {
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
	
	public Integer popAt(int position) {
		if (isEmpty()) {
			return null;
		}else if (size()==1) {
			if(position == 0) {
				int popedItem = head.item;
				head = tail = null;
				return popedItem;
			}else {
				return null;
			}
		}else if(position>= size()) {
				return null;
			}else {
			Node currNode = head;
			for(int i=0; i < position-1; i++) {
	    		currNode = currNode.next;
	    	}
			int popedItem = currNode.next.item;
			currNode.next = currNode.next.next;
			if(currNode.next==null) {
				tail = currNode;
			}
          return popedItem;
		}
	}
	
	public boolean isEmpty() {
		return head == null;
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
		LinkedList newlinkedlist = new LinkedList();
		System.out.println(newlinkedlist);
		
		newlinkedlist.add(5);
		System.out.println(newlinkedlist);
		newlinkedlist.add(9);
		newlinkedlist.add(7);
        System.out.println(newlinkedlist);
//        newlinkedlist.remove(9);
//        System.out.println(newlinkedlist);
//        newlinkedlist.remove(5);
//        System.out.println(newlinkedlist);
//        newlinkedlist.remove(7);
//        System.out.println(newlinkedlist);
//        System.out.println( newlinkedlist.search(0));
//        System.out.println(newlinkedlist.size());
       newlinkedlist.append(10);
//        System.out.println(newlinkedlist);
       newlinkedlist.add(99);
//        System.out.println(newlinkedlist);
//        System.out.println(newlinkedlist.index(99));
        newlinkedlist.insertAt(3, 8);
        newlinkedlist.insertAt(0, 100);
//        System.out.println(newlinkedlist);
//        newlinkedlist.insertAt(10, 88);
//        System.out.println(newlinkedlist);     
//        System.out.println( newlinkedlist.pop());
//        System.out.println(newlinkedlist);
//        System.out.println(newlinkedlist.popAt(6));
      System.out.println(newlinkedlist);
      System.out.println(newlinkedlist.pop());
      System.out.println(newlinkedlist);
      System.out.println(newlinkedlist.pop());
      System.out.println(newlinkedlist);
        
	}
}
