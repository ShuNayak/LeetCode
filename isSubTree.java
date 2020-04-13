package com.leetcode.google;

public class isSubTree {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data) {
			this.val = data;
			this.left = null;
			this.right = null;
		}
	}
	 public static boolean isSubtree(TreeNode s, TreeNode t) {
	        if(t == null && s == null) return true;
	        if(s == null) return false;
	       
	        if(isSame(s,t)) return true;
	        return isSubtree(s.left,t)||isSubtree(s.right,t);
	        
	        
	        
	    }
	    
	    public static boolean isSame(TreeNode s,TreeNode t){
	        if(s == null && t== null) return true;
	        if(s== null || t== null) return false;
	        if(s.val != t.val) return false;
	        return isSame(s.left, t.left) && isSame(s.right, t.right);
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(1);
		/*
		 * TreeNode one = new TreeNode(4); TreeNode three = new TreeNode(5); TreeNode
		 * four = new TreeNode(1); TreeNode five = new TreeNode(2); TreeNode six = new
		 * TreeNode(0); root.left = one; root.right = three; one.left = four; one.right
		 * = five; five.left = six;
		 */
		
		
		
		TreeNode next = new TreeNode(0);
		/*
		 * TreeNode they = new TreeNode(1); TreeNode there = new TreeNode(2); next.left
		 * = they; next.right = there;
		 */
		System.out.println(isSubtree(root, next));
		
		

	}

}
