package linkedListBasics_PracticeProblems;



public class FindKthFromLastLL {

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
		
		System.out.println(findKthFromLast(head, 3));
		
	}
	
	static int findKthFromLast(Node<Integer> head, int k) {
		Node<Integer> goToKth = head;
		Node<Integer> goToLast = head;
		
		while(k>1) {
			goToLast = goToLast.next;
			k--;
			if(goToLast == null) return -1;
		}
		
		while(goToLast.next !=null) {
			goToKth = goToKth.next;
			goToLast = goToLast.next;
		}
		
		return goToKth.data;
	}
	
	static void printLL(Node<Integer> head) {
		Node<Integer> cur = head;
		while(cur!=null) {
			System.out.print(cur.data + " -> ");
			cur = cur.next;
		}
		System.out.print("end");
		System.out.println();
	}

}



class Node<T> {
	T data;
	Node<T> next;
	
	public Node(T data){
		this.data = data;
	}
}
