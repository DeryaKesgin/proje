package ödoyeto;

class Node{
	int value1;
	Node right;
	Node left;
	
	public Node(int val1) {
		
		this.value1=val1;
		
		right=null;
		left=null;
	
	}
	
	public void addleft(int val1) {
		if(left==null) {
			left=new Node(val1);
		}
		else {
			left.addleft(val1);
	}
	
	}
	
	
	public void addright(int val1) {
		if(right==null) {
			right=new Node(val1);
		}
		else {
			right.addright(val1);
	}
	
	}
	
	
	
	public void printpreorder() {
		System.out.println(this.value1);
		if(left!=null) {
			left.printpreorder();
		}
		if(right!=null) {
			right.printpreorder();
		}
	}
	
}


public class binT {
	
	Node root=null;

	
	public void addleft(int val1) {
		if(root==null) {
			root=new Node(val1);
		}
		else {
			root.addleft(val1);
		}
	}
	
	public void addright(int val1) {
		if(root==null) {
			root=new Node(val1);
		}
		else {
			root.addright(val1);
		}
	}
	
	public void printpreorder() {
		if(root!=null) {
			root.printpreorder();
		}
	}
	
}



