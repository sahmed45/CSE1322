package Lab5BLinkedList;

 class Node {
	String species;
	int count;
	Node next; 

	public Node(String species, int count){
		this.species = species;
		this.count = count;
		
	}

	public void displayANode(){
		System.out.println("Species: " + species + " count:" + count );
	}

	@Override
	public String toString(){   // Required

		return "" + species + "  " + count;
		
	}


}

class LinkedList{
	Node head; 

	LinkedList(){   
		head = null;  
	}
	
	public void getReport(){

		Node theNode = head;


		while(theNode != null){

			theNode.displayANode();


			theNode = theNode.next;

			System.out.println();

		}

	}

	public void add(String species, int count){
		if (head == null) {
			head = new Node(species, count);
			return; 
		}
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = new Node(species, count);
	}


}

public class BirdSurvey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    LinkedList bs = new LinkedList();
    bs.add("sparrow", 1);
    bs.add("owl", 2);
    bs.add("duck", 3);
	bs.getReport();

}
	
	
}
