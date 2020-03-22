package graph;

import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class BFSDFS {
	
	static Queue<Node> queue = new LinkedList<Node>();
	static class Node{
		int data;
		boolean isVisited;
		ArrayList<Node> neighbours;
		
		Node(int data){
			this.data = data;
			this.neighbours = new ArrayList<Node>();
		}
		
		void addNeighbours(Node node) {
			this.neighbours.add(node);
		}
		
		ArrayList<Node> getNeighbours() {
			return this.neighbours;
		}
	}
	
	static void traverseBFS(Queue<Node> queue) {
		
		if(queue.isEmpty()) {
			return;
		}
		
		Node node = queue.remove();
		node.isVisited = true;
		System.out.print(node.data + " ");
		
		ArrayList<Node> neighbours = node.getNeighbours();
		for(int i=0; i<neighbours.size(); i++) {
			Node element = neighbours.get(i);
			if(element!=null && !element.isVisited) {
				queue.add(element);
				element.isVisited = true;
			}
		}
		traverseBFS(queue);
	}
	
	static void traverseDFS(Node node) {
		
		System.out.print(node.data + " ");
		ArrayList<Node> neighbours = node.getNeighbours();
		for(int i=0; i<neighbours.size(); i++) {
			Node element = neighbours.get(i);
			if(element!=null && !element.isVisited) {
				element.isVisited = true;
				traverseDFS(element);
			}
		}
	}
	
	public static void main(String[] args) {
		
		// 1. Define Node.
		Node node40 =new Node(40);
		Node node10 =new Node(10);
		Node node20 =new Node(20);
		Node node30 =new Node(30);
		Node node60 =new Node(60);
		Node node50 =new Node(50);
		Node node70 =new Node(70);
				
		//4->1->3
		//4->2
		//2->1
		// 2. Add data to nodes.
		node40.addNeighbours(node10);
		node40.addNeighbours(node20);
		node10.addNeighbours(node30);
		node20.addNeighbours(node10);
		node20.addNeighbours(node30);
		node20.addNeighbours(node60);
		node20.addNeighbours(node50);
		node30.addNeighbours(node60);
		node60.addNeighbours(node70);
		node50.addNeighbours(node70);
		
		// 3. Traverse the tree.
		queue.add(node20);
		traverseBFS(queue);
		
		// Resetting the visited flag for nodes
		node40.isVisited=false;
		node10.isVisited=false;
		node20.isVisited=false;
		node30.isVisited=false;
		node60.isVisited=false;
		node50.isVisited=false;
		node70.isVisited=false;
		
		// 4. Traverse the tree.
		System.out.println();
		traverseDFS(node20);
		
	}

}
