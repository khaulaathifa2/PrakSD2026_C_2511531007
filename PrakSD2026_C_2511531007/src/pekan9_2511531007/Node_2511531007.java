package pekan9_2511531007;

public class Node_2511531007 {
	int data_1007;
	Node_2511531007 left_1007;
	Node_2511531007 right_1007;
	
	public Node_2511531007(int data_1007) {
		this.data_1007 = data_1007;
		left_1007 = null;
		right_1007 = null;
	}
	
	public void setLeft_1007(Node_2511531007 node_1007) {
		if (left_1007 == null)
			left_1007 = node_1007;
	}
	
	public void setRight_1007(Node_2511531007 node_1007) {
		if (right_1007 == null)
			right_1007 = node_1007;
	}
	
	public Node_2511531007 getLeft_1007() {
		return left_1007;
	}
	
	public Node_2511531007 getRight_1007() {
		return right_1007;
	}
	
	public int getData_1007() {
		return data_1007;
	}
	
	public void setData_1007(int data_1007) {
		this.data_1007 = data_1007;
	}
	
	void printPreorder_1007(Node_2511531007 node_1007) {
		if (node_1007 == null)
			return;
		System.out.print(node_1007.data_1007 + " ");
		printPreorder_1007(node_1007.left_1007);
		printPreorder_1007(node_1007.right_1007);
	}
	
	void printPostorder_1007(Node_2511531007 node_1007) {
		if (node_1007 == null)
			return;
		printPostorder_1007(node_1007.left_1007);
		printPostorder_1007(node_1007.right_1007);
		System.out.print(node_1007.data_1007 + " ");
	}
	
	void printInorder_1007(Node_2511531007 node_1007) {
		if (node_1007 == null)
			return;
		printInorder_1007(node_1007.left_1007);
		System.out.print(node_1007.data_1007 + " ");
		printInorder_1007(node_1007.right_1007);
	}	
	
	public String print_1007() {
		return this.print_1007("",true,"");
	}
	
	public String print_1007(String prefix_1007, boolean isTail_1007, String sb_1007) {
		if (right_1007 != null) {
			right_1007.print_1007(prefix_1007 + (isTail_1007 ? "|   " : "   "), false, sb_1007);
		}
		System.out.println(prefix_1007+(isTail_1007 ? "\\-- " : "/-- ")+data_1007);
		if (left_1007 != null) {
			left_1007.print_1007(prefix_1007 + (isTail_1007 ? "   " : "|   "), true, sb_1007);
		}
		return sb_1007;
	}
}
