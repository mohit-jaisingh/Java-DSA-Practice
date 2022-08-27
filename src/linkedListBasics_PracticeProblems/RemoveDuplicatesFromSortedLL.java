package linkedListBasics_PracticeProblems;

public class RemoveDuplicatesFromSortedLL extends FindKthFromLastLL{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> n1 = new Node<>(1);
		Node<Integer> n2 = new Node<>(1);
		Node<Integer> n3 = new Node<>(2);
		Node<Integer> n4 = new Node<>(3);
		Node<Integer> n5 = new Node<>(3);
		Node<Integer> n6 = new Node<>(3);
		
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		printLL(head);
		
		removeDuplicatesLL(head);
		
		printLL(head);
	}
	
	static void removeDuplicatesLL(Node<Integer> head) {
		Node<Integer> cur = head;
	
		while(cur.next !=null) {
			if(cur.data == cur.next.data) {
				cur.next = cur.next.next;
			}else cur = cur.next;
		}
	
	}

}
