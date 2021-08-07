package queue;

import linkedlist.INode;
import stack.MyLinkedList;

public class MyQueue {
	
	private final MyLinkedList MyLinkedList;
	public MyQueue(){
		
		this.MyLinkedList = new MyLinkedList();
	}
	
	
	public void enqueue(INode myNode) {
		
		MyLinkedList.append(myNode);
		
		
	}


	public void printStack() {
		
		MyLinkedList.printNodes();
		
	}


	public INode peak() {
		
		return MyLinkedList.head;
	}
	
	


}
