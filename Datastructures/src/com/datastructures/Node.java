package com.datastructures;

public class Node {
	int item;
	Node next;
	
    
	public Node(int item) {
		this.item = item;
		this.next = null;    
	}

	@Override
	public String toString() {
      if (next == null)
      {
    	  return " [ "+item+" ] ";
      }else {
    	  return " [ "+item+" ---> "+next+" ] ";
      }
	}
	
	
	

}
