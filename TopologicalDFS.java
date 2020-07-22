package com.leetcode.google;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalDFS {
	ArrayList<ArrayList<Integer>> list;
	int V;

		public TopologicalDFS(int vertices) {
			V = vertices;
			list = new ArrayList<ArrayList<Integer>>(V);
			for(int i=0;i<V;i++) {
				list.add(new ArrayList<Integer>());
			}
		}
		 public void addEdge(int source, int dest) {
			 list.get(source).add(dest);
		 }
		 

	 
	
	 public void topoUtil(int[] visited, int vertex, Stack<Integer> stack) {
		visited[vertex]=1;
		for(int x:list.get(vertex))
			if(visited[x] == 0)
			topoUtil(visited, x, stack);
		stack.push(vertex);
		
	 }
	 
	 public void topologicalSort() {
		 Stack<Integer> stack = new Stack<Integer>();
		 int[] visited = new int[V];
		 for ( int i=0;i<V;i++) {
			 if(visited[i] == 0)
			 topoUtil(visited, i, stack);
		 }
		 
		 while(stack.size()>0) {
			 System.out.println(stack.pop());
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopologicalDFS g = new TopologicalDFS(3);
		g.addEdge(0, 1);
		g.addEdge(2, 0);
		g.topologicalSort();
		

	}

}
