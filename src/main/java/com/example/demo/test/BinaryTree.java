package com.example.demo.test;

public class BinaryTree {

	class Node {
		private int data;
		private Node leftNode;
		private Node rightNode;

		Node(int data) {
			this.data = data;
		}
	}

	Node one;
	Node two;
	Node three;
	Node four;
	Node five;
	Node six;

	public void createBinaryTree() {

		one = new Node(1);
		two = new Node(2);
		three = new Node(3);
		four = new Node(4);
		five = new Node(5);
		six = new Node(6);
		
		 one.leftNode = two;
		 one.rightNode = three;
		
		

	}

	public void displayTree() {
		System.out.println(one.data + ":" + one.leftNode + ":" + one.rightNode);
	}

	public static void main(String args[]) {

		BinaryTree bt1 = new BinaryTree();
		bt1.createBinaryTree();
		bt1.displayTree();

	}

}
