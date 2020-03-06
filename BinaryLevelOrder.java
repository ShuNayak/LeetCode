package com.leetcode.google;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryLevelOrder {
	
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public static ArrayList<ArrayList<Integer>> BLT(Node root) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		ArrayList<Integer> inter = new ArrayList<>();
		if(root == null) return res;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			
			Node temp = q.poll();
			if(temp == null) {
				res.add(inter);
				if (!q.isEmpty()) {
					q.add(null);
					inter = new ArrayList<>();
				}
			}
			else {
				inter.add(temp.data);
				if(null != temp.left)q.add(temp.left);
				if (null != temp.right) q.add(temp.right);
			}
			
			
			
		}
		
		return res;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(1);
		Node one = new Node(2);
		Node two = new Node(3);
		Node three = new Node(4);
		Node four = new Node(5);
		Node five = new Node(6);
		
		root.left = one;
		root.right = two;
		two.left = three;
		two.right = four;
		four.right = five;
		
		BLT(root);

	}

}
