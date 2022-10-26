public class bts {
	    static class Node {    
	    int value; 
	    Node left, right; 
	          
	        Node(int value){ 
	            this.value = value; 
	            left = null; 
	            right = null; 
	        } 
	    } 
	       
	    public void insert(Node node, int value) {
	        if (value < node.value) { 
	        	if (node.left != null) { 
	        		insert(node.left, value); 
	        	} else {
	        		System.out.println(" Inserted " + value + " to left of " + node.value); 
	        		node.left = new Node(value); } 
	        } 
	        else if (value > node.value) {
	        	if (node.right != null) {
	        		insert(node.right, value);
	        	} else {
	        		System.out.println("  Inserted " + value + " to right of "+ node.value);    
	        		node.right = new Node(value);
	        	}
	        }
	      }
	     
	     public void traverseInOrder(Node node) {
	        if (node != null) {
	            traverseInOrder(node.left);
	            System.out.print(" " + node.value);
	            traverseInOrder(node.right);
	        }
	     }
	     public void traversePreOrder(Node node) {
	    	    if (node != null) {
	    	        System.out.print(" " + node.value);
	    	        traversePreOrder(node.left);
	    	        traversePreOrder(node.right);
	    	    }
	    }
	     public void traversePostOrder(Node node) {
	    	    if (node != null) {
	    	        traversePostOrder(node.left);
	    	        traversePostOrder(node.right);
	    	        System.out.print(" " + node.value);
	    	    }
	    	}


	public static void main(String[] args) {
		bts tree = new bts();
         Node root = new Node(50);
         System.out.println("Building tree with root value " + root.value);
       
         tree.insert(root, 10);
         tree.insert(root, 20);
         tree.insert(root, 70);
         tree.insert(root, 60);
         tree.insert(root, 90);
         System.out.println("Traversing tree inOrder: ");
         tree.traverseInOrder(root);
         System.out.println(" ");
         System.out.println("traversing tree preorder");
        
         tree.traversePreOrder(root);
         System.out.println(" ");
         System.out.println("traversing tree postorder");
         tree.traversePostOrder(root);
         
         
         
		//

	}

}
