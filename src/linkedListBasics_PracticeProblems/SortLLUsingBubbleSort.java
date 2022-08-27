package linkedListBasics_PracticeProblems;



public class SortLLUsingBubbleSort {
	
	static void printLL(Node<Integer> head) {
		Node<Integer> cur = head;
		while(cur!=null) {
			System.out.print(cur.data + "->");
			cur = cur.next;
		}
		System.out.println("end");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> n1 = new Node<>(1);
		Node<Integer> n2 = new Node<>(7);
		Node<Integer> n3 = new Node<>(5);
		Node<Integer> n4 = new Node<>(3);
		Node<Integer> n5 = new Node<>(2);
		Node<Integer> n6 = new Node<>(2);
		
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		printLL(head);
		
		head = bubbleSortLL(head);
		
		printLL(head);
	}
	
	
	static Node<Integer> bubbleSortLL(Node<Integer> head){
		
		Node<Integer> prev = null;
		Node<Integer> cur = head;
		int len = 0;
		
		while(cur != null) { //find length of linked list
			len++;
			cur = cur.next;
		}
		
		for(int i=len; i>0; i--) { //run len-i for every ith iteration
			cur = head;
			prev = null;
			int curRun = 0;
			while(cur.next != null && curRun <i) {
			
				if(cur.data > cur.next.data) {
					
					Node<Integer> temp = cur.next.next;
					if(prev != null) {
						prev.next = cur.next;
					}
					cur.next.next = cur;
					if(prev == null) head = cur.next;
					cur.next = temp;
					
					prev = prev == null? head : prev.next;
					
				}
				else {
					prev = cur;
					cur = cur.next;
				}
				curRun++;
				
//				printLL(head);
//				System.out.println("prev = " + prev.data);
//				System.out.println("cur = " + cur.data);
			}
		}
		
		return head;
	}

}
