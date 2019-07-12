
package Demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.xml.sax.HandlerBase;

public class BinaryTree {
	// Root of Binary Tree
	Node root;

	BinaryTree() {
		root = null;
	}

	/*
	 * Given a binary tree, print its nodes according to the "bottom-up" postorder
	 * traversal.
	 */
	void printPostorder(Node node) {
		if (node == null)
			return;

		// first recur on left subtree
		printPostorder(node.left);

		// then recur on right subtree
		printPostorder(node.right);

		// now deal with the node
		System.out.print(node.key + " ");
	}

	/* Given a binary tree, print its nodes in inorder */
	void printInorder(Node node) {
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		/* then print the data of node */
		System.out.print(node.key + " ");

		/* now recur on right child */
		printInorder(node.right);
	}

	/* Given a binary tree, print its nodes in preorder */
	void printPreorder(Node node) {
		if (node == null)
			return;

		/* first print data of node */
		System.out.print(node.key + " ");

		/* then recur on left sutree */
		printPreorder(node.left);

		/* now recur on right subtree */
		printPreorder(node.right);
	}

	void printLevelOrder(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.print(tempNode.key);
			if (null != tempNode.left) {
				queue.add(tempNode.left);
			}
			if (null != tempNode.right) {
				queue.add(tempNode.right);
			}
		}
	}
	
	int max_level = 0;
	void leftViewUtil(Node node, int level) 
    { 
        // Base Case 
        if (node==null) return; 
  
        // If this is the first node of its level 
        if (max_level < level) 
        { 
            System.out.print(" " + node.key); 
            max_level = level; 
        } 
  
        // Recur for left and right subtrees 
        leftViewUtil(node.right, level+1); 
        leftViewUtil(node.left, level+1); 
    } 

	// Wrappers over above recursive functions
	void printPostorder() {
		printPostorder(root);
	}

	void printInorder() {
		printInorder(root);
	}

	void printPreorder() {
		printPreorder(root);
	}
	
	void printleftView() {
		
		leftViewUtil(root, 1);
	}

	// Driver method
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(12); 
        tree.root.left = new Node(10); 
        tree.root.right = new Node(30); 
        tree.root.right.left = new Node(25); 
        tree.root.right.right = new Node(40);
//		tree.root = new Node(1);
//		tree.root.left = new Node(2);
//		tree.root.right = new Node(3);
//		tree.root.left.left = new Node(4);
//		tree.root.left.left.left = new Node(8);
//		tree.root.left.left.right = new Node(9);
//		tree.root.left.right = new Node(5);
//		tree.root.left.right.left = new Node(10);
//		tree.root.right.left = new Node(6);
//		tree.root.right.right = new Node(7);
//		tree.root.right.right.left = new Node(11);

		System.out.println("Preorder traversal of binary tree is ");
		tree.printPreorder();
//
		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInorder();
//
		System.out.println("\nPostorder traversal of binary tree is ");
		tree.printPostorder();
//
//		System.out.println("\\nLevel Order traversal of binary tree is ");
//		tree.printLevelOrder(tree.root);
		
//		tree.printleftView();
	}
}