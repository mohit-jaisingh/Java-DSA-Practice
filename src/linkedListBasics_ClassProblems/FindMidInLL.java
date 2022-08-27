package linkedListBasics_ClassProblems;

public class FindMidInLL extends LinkedListCIPD{ //Create Insert Print Delete

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> n1 = new Node<>(5);
		Node<Integer> n2 = new Node<>(6);
		Node<Integer> n3 = new Node<>(7);
		Node<Integer> n4 = new Node<>(8);
		Node<Integer> n5 = new Node<>(9);
//		Node<Integer> n6 = new Node<>(12);
		
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
//		n5.next = n6;
		
		printLL(head);
		System.out.println(findMid(head));
		
	}
	
	static int findMid(Node<Integer> head) {
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		
		while(fast!=null && fast.next!=null) { //(for evenLengthLL !=null && for oddLengthLL != null)
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow.data;
	}

}
