package linkedListBasics_ClassProblems;

public class DeleteElementInLLWhosePointerIsGiven extends LinkedListCIPD{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> n1 = new Node<>(5);
		Node<Integer> n2 = new Node<>(6);
		Node<Integer> n3 = new Node<>(7);
		Node<Integer> n4 = new Node<>(8);
		Node<Integer> n5 = new Node<>(9);
		Node<Integer> n6 = new Node<>(12);
		
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		printLL(head);
		
		deleteNode(n5);
		printLL(head);
	}
	
	static void deleteNode(Node<Integer> delPtr) {
		delPtr.data = delPtr.next.data;
		delPtr.next = delPtr.next.next;
		
	}

}
