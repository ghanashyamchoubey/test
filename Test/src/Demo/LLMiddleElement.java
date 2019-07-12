package Demo;

public class LLMiddleElement {

	static Node head; // head of linked list

	/* Linked list node */
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/*
	 * This function prints contents of linked list starting from the given node
	 */
	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + "->");
			tnode = tnode.next;
		}
		System.out.println("NULL");
	}

	// This function prints the middle element of a linked list
	public void printMiddle() {
		
		Node fast = head;
		Node slow = head;
		if (head != null) {
			while (fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}
			System.out.println(slow.data);
		}
	}
	
	public Node reverse(Node node) {
		Node prev = null;
		Node next = null;
		Node current = node;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	
	void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 

	public static void main(String[] args) {

		LLMiddleElement llist = new LLMiddleElement();
		for (int i = 5; i > 0; --i) {
			llist.push(i);
			llist.printList();
		}
		llist.printList(head);
//		llist.printMiddle();	
		System.out.println("after reversal");
		head = llist.reverse(head);
		llist.printList(head);
		
	}

}
