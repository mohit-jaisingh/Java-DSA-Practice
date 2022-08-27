package linkedListBasics_PracticeProblems;

public class CheckSinglyLLisPalindrome extends SortLLUsingBubbleSort{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> n1 = new Node<>(1);
		Node<Integer> n2 = new Node<>(4);
		Node<Integer> n3 = new Node<>(4);
		Node<Integer> n4 = new Node<>(1);
//		Node<Integer> n5 = new Node<>(1);
		
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
//		n4.next = n5;
		
		printLL(head);
		
		System.out.println(checkPalindrome(head));

	}
	
	
	static boolean checkPalindrome(Node<Integer> head) {
		Node<Integer> revHead = null;
		
		
		Node<Integer> cur = head;
		
		while(cur!=null) {
			Node<Integer> newNode = new Node<>(cur.data);
			newNode.next = revHead;
			revHead = newNode;
			cur = cur.next;
		}
		
		System.out.println("reversed");
		printLL(revHead);
		
		cur = head;
		Node<Integer> curRev = revHead;
		
		while(cur!=null) {
			if(cur.data != curRev.data) {
				return false;
			}
			cur = cur.next;
			curRev = curRev.next;
		}
		return true;
		
	}

}
