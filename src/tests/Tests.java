package tests;

class Node {
	int id;
	Node next;

	public Node(int id) {
		this.id = id;
	}
}

class lists {
	Node head;

	public void display() {
		Node node = head;

		while (node != null) {
			System.out.println(node.id);
			node = node.next;

		}
	}

	public void append(int id) {
		if (head == null) {
			head = new Node(id);
			return;
		}
		Node node = head;
		while (node.next != null) {
			node = node.next;

		}
		node.next = new Node(id);

	}

	public void prepend(int id) {
		if (head == null) {
			head = new Node(id);
			return;
		}
		Node node = new Node(id);
		node.next = head;
		head = node;
	}

	public void removef() {

		if (head == null) {
			return;
		}
		head = head.next;
	}

	public void removeid(int id) {
		Node curr = head;
		Node prev = head;

		while (curr.id != id) {
			if (curr.next == null) {
				return;
			} else {
				prev = curr;
				curr = curr.next;
			}
		}
		if (curr == head) {
			head = head.next;

		} else {
			prev.next = curr.next;
		}

	}

	public Node findById(int id) {

		Node theNode = head;
		while (theNode.id != id) {
			if (theNode.next == null) {

				return null;

			} else {
				theNode = theNode.next;
			}

		}

		return theNode;

	}

}

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lists a = new lists();
		a.append(1);
		a.append(2);
		a.prepend(3);
		a.removeid(3);
		a.display();

	}

}
