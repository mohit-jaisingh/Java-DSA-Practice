package linkedListBasics_ClassProblems;

public class LinkedListCIPD {
	
	static void printLL(Node<Integer> head) {
		Node<Integer> cur = head;
		while(cur!=null) {
			System.out.print(cur.data + "->");
			cur = cur.next;
		}
		System.out.println("end");
	}
	
	static Node<Integer> insertLL(Node<Integer> head, int data, int position){
		Node<Integer> newNode = new Node<>(data);
		if(position == 0) {
			newNode.next = head;
			head = newNode;
			return head;
		}
		Node<Integer> insertAfter = head;
		
		while(position>1) { // because to enter at 1, we stop at 0 to insert after it.
			insertAfter = insertAfter.next;
			position--;
			if(insertAfter == null) return head; //check if position is within the length of LL. If not don't insert and return original head.
		}
		newNode.next = insertAfter.next;
		insertAfter.next = newNode;
		
		return head;
	}
	
	static Node<Integer> deleteLL(Node<Integer> head, int position){
		if(position == 0) {
			head = head.next;
			return head;
		}
		
		Node<Integer> cur = head;
		while(position>1) {
			cur = cur.next;
			if(cur.next == null) return head;
			position--;
		}
		
		System.out.println("Deleting " + cur.next.data);
		cur.next = cur.next.next;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> n1 = new Node<>(5);
		Node<Integer> n2 = new Node<>(6);
		Node<Integer> n3 = new Node<>(7);
		Node<Integer> n4 = new Node<>(8);
		
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
//		System.out.println(head.next.data);
		printLL(head);
		
		head = insertLL(head, 50, 2);
		head = insertLL(head, 20, 0);
		
		printLL(head);
		
		head = deleteLL(head, 3);
		
		printLL(head);
		

	}
}

class Node<T>{
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
	}
}

