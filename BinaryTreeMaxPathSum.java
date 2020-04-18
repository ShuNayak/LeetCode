package com.leetcode.google;

import java.util.ArrayList;
import java.util.List;

import javax.naming.NoInitialContextException;

public class BinaryTreeMaxPathSum {
int maxPathSum = Integer.MIN_VALUE;
	 static class Node{
		 
		 int data;
		 Node left;
		 Node right;
		 
		 public Node(int data) {
			 this.data = data;
			 this.left = null;
			 this.right = null;
		 }	 
		 
	 }
	 public  int maxPathSum(Node root) {
		 if (null == root) return 0;
		computeMaximum(root);
		return maxPathSum;
		 
	 }
	 
	 public int computeMaximum(Node root) {
		 if ( null == root ) return 0;
		 int left = Math.max(0, computeMaximum(root.left));
		 int right = Math.max(0, computeMaximum(root.right));
		 maxPathSum = Math.max(maxPathSum, left+right+root.data);
		 return Math.max(left, right)+root.data;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeMaxPathSum bn = new BinaryTreeMaxPathSum();
		Node root = new Node(-10);
		Node two = new Node(20);
		Node three = new Node(15);
		Node four = new Node(7);
		Node one = new Node(9);
		
		root.left = one;
		root.right = two;
		two.left = three;
		two .right = four;
		System.out.println(bn.maxPathSum(root));
	}

}
