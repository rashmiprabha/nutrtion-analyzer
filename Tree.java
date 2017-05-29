/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;



/**
 *
 * @author Rashmi
 */


  


class Node{
	int data;
	Node left;
	Node right;	
	public Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}
 

public class Tree {
	public static  Node root;
	public Tree(){
		this.root = null;
	}
	
        public void insert(int id){
		Node newNode = new Node(id);
		if(root==null){
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(id<current.data){				
				current = current.left;
				if(current==null){
					parent.left = newNode;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = newNode;
					return;
				}
			}
		}
	}
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
    public void printPreOrder(Node root) {  
    if(root !=  null) {  
   //Visit the node by Printing the node data 
    
      System.out.printf("%d ",root.data);  
      printPreOrder(root.left);  
      printPreOrder(root.right);  
    }  
  }  
        public void swapChildren(Node root, int[] swaps, int i, int arraySize, int depth) {
    if(arraySize == 0) return;
    // Swap left
    if(depth < swaps[i]) {
        swapChildren(root.left, swaps, i+1, arraySize-1, depth+1);
    }
    // Swap right
    if(depth != swaps[i]) {
        swapChildren(root.right, swaps, i+1, arraySize-1, depth+1);
    }

    // Swap us
    if(depth == swaps[i]) {
        Node temp2 = root.left;
        root.left = root.right;
        root.right = temp2;
    }
}        
               public static void main(String arg[]){
		Tree b = new Tree();
		b.insert(2);b.insert(6);
		b.insert(3);b.insert(5);b.insert(8);b.insert(2);b.insert(10);b.insert(19);
		b.insert(20);b.insert(27);b.insert(35);b.insert(16);
                b.printPreOrder(root);
               // b.swapChildren(root,(2),1,10,1);
		System.out.println("\n Original Tree : ");
                
                mirrorSubTree i  = new mirrorSubTree();
		i.mirror(root);
                
				
		//System.out.println("");
		
				
		b.display(root);
	}
}
 class mirrorSubTree {
	public void mirror(Node root){
		print(root);
		Node x = mirrorTree(root);
		System.out.print("\n Mirror Image:\n ");
		//print(x);
	}
	public Node mirrorTree(Node root){
		if(root!=null){
			Node t = root.left;
			root.left = root.right;
			root.right = t;
			mirrorTree(root.right);
			mirrorTree(root.left);
		}
		return root;
	}
	public void print(Node root){
		if(root!=null){
			print(root.left);
			System.out.print("" + root.data);
			print(root.right);
		}
	}
	
}
 