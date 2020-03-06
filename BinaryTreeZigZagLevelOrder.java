 package com.leetcode.google;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeZigZagLevelOrder {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
	}
	
	public static List<List<Integer>>ZigZag(Node root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null) return result;
		
		ArrayList<Integer> arr;
		Stack<Node> stackOne = new Stack<>();
		Stack<Node> stackTwo = new Stack<>();
		stackOne.add(root);
		
		while(!stackOne.isEmpty() || !stackTwo.isEmpty()) {
			arr = new ArrayList<>();
			while (!stackOne.isEmpty()) {
				Node temp = stackOne.pop();
				arr.add(temp.data);
				if(temp.left != null) {
					stackTwo.add(temp.left);
				}
				if (temp.right != null) {
					stackTwo.add(temp.right);
				}	
				
			}
			if (arr.size() >0) {
				result.add(arr);
			}
			arr = new ArrayList<>();
			while (!stackTwo.isEmpty()) {
				Node temp = stackTwo.pop();
				arr.add(temp.data);
				if (temp.right != null) {
					stackOne.add(temp.right);
				}	
				if(temp.left != null) {
					stackOne.add(temp.left);
				}
				
			}
			if (arr.size() >0) {
				result.add(arr);
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(0);
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		
		root.left = one;
		root.right = two;
		one.left = three;
		one.right = four;
		two.right = five;
		ZigZag(root);
	}

}
