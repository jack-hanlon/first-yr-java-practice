public class BST<T extends Comparable<T> >{

	private Node<T> root;
	
	public BST(){
		root = null;
	}
	
	
	public void insert(value){
		Node<T> newNode = new Node<T>(value);
		Node<T> n = root;
		
		if(n == null){
			n = newNode;
			return;
		}else if(n.left == null){
			n.left = newNode;
			
			
			
		}
		
	}
	
}