import stacks.Node;

class Node{
	int ser;
	int cal;
	
	public Node next;
	public Node(int ser, int cal) {
		this.ser=ser;
		this.cal=cal;
	}

	@Override
	public String toString(){   // Required
		return  ser + " and " + cal;
	}
}
class Queue
{
	 Node head;
	 Node tail;
	 int count=0;
	
	 Queue() {}
		public void peek() {
			if(isEmpty())
				System.out.println("There is nothing to peek");
			else {
				System.out.println("The front node's calories and servings are " + head.ser+ " and "+ head.cal);
			}
		}
		public boolean isEmpty() {
			return (head == null);
		}

		public void enQueue(int ser,int cal) {
			Node node = new Node(ser,cal);
			if (tail == null) {
				head = node;
				tail = node;
				count++;
			}
			else {
				tail.next = node;
				tail = node;
				count++;
			}
		}
		public void deQueue() {
			if (head == null) {
				tail = null;
				System.out.println("There is no node to delete" );
				count--;
				return;
			}
}


}

public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q= new Queue();
		q.enQueue(20,20);
		q.enQueue(30,20);
		q.enQueue(40,20);
		q.deQueue();
		q.peek();

	}
	
	

}