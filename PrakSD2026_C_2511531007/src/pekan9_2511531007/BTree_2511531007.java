package pekan9_2511531007;

public class BTree_2511531007 {
	private Node_2511531007 root_1007;
	private Node_2511531007 currentNode_1007;
	public BTree_2511531007() {
		root_1007 = null;
	}
	
	public boolean search_1007(int data_1007) {
		return search_1007(root_1007, data_1007);
	}
	private boolean search_1007(Node_2511531007 node_1007, int data_1007) {
		if (node_1007.getData_1007() == data_1007)
			return true;
		if (node_1007.getLeft_1007() != null)
			if (search_1007(node_1007.getLeft_1007(), data_1007))
				return true;
		if (node_1007.getRight_1007() != null)
			if (search_1007(node_1007.getRight_1007(), data_1007))
				return true;
		return false;
	}
	
	public void printInorder_1007() {
		root_1007.printInorder_1007(root_1007);
	}
	public void printPreorder_1007() {
		root_1007.printPreorder_1007(root_1007);
	}
	public void printPostorder_1007() {
		root_1007.printPostorder_1007(root_1007);
	}
	
	public Node_2511531007 getRoot_1007() {
		return root_1007;
	}
	
	public boolean isEmpty_1007() {
		return root_1007 == null;
	}
	
	public int countNodes_1007() {
		return countNodes_1007(root_1007);
	}
	private int countNodes_1007(Node_2511531007 node_1007) {
		int count_1007 = 1;
		if (node_1007 == null) {
			return 0;
		} else {
			count_1007 += countNodes_1007(node_1007.getLeft_1007());
			count_1007 += countNodes_1007(node_1007.getRight_1007());
			return count_1007;
		}
	}
	
	public void print_1007() {
		root_1007.print_1007();
	}
	
	public Node_2511531007 getCurrent_1007() {
		return currentNode_1007;
	}
	
	public void setCurrent_1007(Node_2511531007 node_1007) {
		this.currentNode_1007 = node_1007;
	}
	
	public void setRoot_1007(Node_2511531007 root_1007) {
		this.root_1007 = root_1007;
	}
}
