package linkedListBasics_PracticeProblems;

public class JoinTwoSortedLL extends SortLLUsingBubbleSort{

	public static void main(String[] args) {
		
		Node<Integer> n1 = new Node<>(1);
		Node<Integer> n2 = new Node<>(2);
		Node<Integer> n3 = new Node<>(3);
		Node<Integer> n4 = new Node<>(4);
		Node<Integer> n5 = new Node<>(6);
		
		Node<Integer> head1 = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		Node<Integer> n11 = new Node<>(1);
		Node<Integer> n12 = new Node<>(4);
		Node<Integer> n13 = new Node<>(6);
		Node<Integer> n14 = new Node<>(8);
		Node<Integer> n15 = new Node<>(10);
		
		Node<Integer> head2 = n11;
		n11.next = n12;
		n12.next = n13;
		n13.next = n14;
		n14.next = n15;
		
		printLL(head1);
		printLL(head2);
		
		Node<Integer> newHead = joinTwoSortedLL(head1,head2);
		
		printLL(newHead);
	

	}
	
	static Node<Integer> joinTwoSortedLL(Node<Integer> head1, Node<Integer> head2){
		
		Node<Integer> cur1 = head1;
		Node<Integer> cur2 = head2;
		
		Node<Integer> newHead; Node<Integer> tail;
		if(head1.data < head2.data) {
			newHead = tail = head1;
			
			cur1 = cur1.next;
		}else {
			newHead = tail = head2;
			cur2 = cur2.next;
		}
//		System.out.println("******************");
		while(cur1!= null || cur2 != null) {
			
//			printLL(newHead);
			
			if(cur1 == null) {
				tail.next = cur2;
				break;
			}else if(cur2 == null) {
				tail.next = cur1;
				break;
			}else {
				
				if(cur1.data < cur2.data) {
					tail.next = cur1;
					tail = cur1;
					cur1 = cur1.next;
					
				}else {
					tail.next = cur2;
					tail = cur2;
					cur2 = cur2.next;
				}
				
			}
			
			
		}
		
		return newHead;
	}

}
