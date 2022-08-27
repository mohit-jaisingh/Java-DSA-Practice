package linkedListBasics_PracticeProblems;

public class FindIntersectionOf2SortedLL extends SortLLUsingBubbleSort{ //for printLL function

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> n1 = new Node<>(5);
		Node<Integer> n2 = new Node<>(7);
		Node<Integer> n3 = new Node<>(9);
		Node<Integer> n4 = new Node<>(11);
		Node<Integer> n5 = new Node<>(15);
		
		Node<Integer> head1 = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		Node<Integer> n11 = new Node<>(1);
		Node<Integer> n12 = new Node<>(4);
		Node<Integer> n13 = new Node<>(4);
		Node<Integer> n14 = new Node<>(8);
		Node<Integer> n15 = new Node<>(10);
		
		Node<Integer> head2 = n11;
		n11.next = n12;
		n12.next = n13;
		n13.next = n14;
		n14.next = n15;
		
		printLL(head1);
		printLL(head2);
		
		Node<Integer> newHead = findIntersection(head1,head2);
		
		printLL(newHead);

	}
	
	static Node<Integer> findIntersection(Node<Integer> head1, Node<Integer> head2){
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		Node<Integer> cur1 = head1;
		Node<Integer> cur2 = head2;
		
		while(cur1 !=null && cur2!=null) {
			
			if(cur1.data == cur2.data) {
				if(head == null) {
					head = tail = cur1;
				}else {
					tail.next = cur1;
					tail = cur1;
				}
				
				cur1 = cur1.next;
				cur2 = cur2.next;
			}else {
				if(cur1.data > cur2.data) cur2 = cur2.next;
				else cur1 = cur1.next;
			}
			
			
		}
		
		return head;
	}

}
