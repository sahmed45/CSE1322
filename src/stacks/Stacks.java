package stacks;
class Node {

	String name;
	String color;
	String wash;
	Node next; 

	public Node(String name, String color, String wash){
	
		this.name = name;
		this.color=color;
		this.wash=wash;
	}


	public String toString(){   // Required
		return "" + name + " " + color+ " " +wash;
	}

}  

class Stack {
	Node top;

	

	public boolean isEmpty() {
		return(top == null);
	}

	public void peek() {
		if(isEmpty()) {
			System.out.println("There is nothing to peek");
			return;
		}
		else {
			System.out.println("The top node is : " + top.name + " " + top.color+ " " +top.wash);
		}
	}

	public void push(String name, String color, String wash){
		Node node = new Node(name, color, wash);

		if (top == null) {
			top = node;
		}
		else {
			node.next = top;
			top = node;
		}	
	}

	public void pop() {
		if (top == null) {
			System.out.println("There is no node to delete" );
			return;
		}
		else {
	
		
			System.out.println("Popped the node with  "+ top.name + " " + top.color+ " " +top.wash );

			top = top.next;

		}
	}




}

public class Stacks {

	public static void main(String[] args) {

		Stack mys = new Stack();

		mys.push("shirt","blue","hot");
		mys.push("shirt","black","cold");
		mys.pop();
		mys.peek();
		mys.push("pants","black","hot");
		mys.peek();
		mys.pop();
		mys.push("shirt","black","cold");
		mys.pop();		
	


	}

}


