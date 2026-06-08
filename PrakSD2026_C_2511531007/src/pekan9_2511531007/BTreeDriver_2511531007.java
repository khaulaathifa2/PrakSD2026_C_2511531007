package pekan9_2511531007;

public class BTreeDriver_2511531007 {

	public static void main(String[] args) {
		
		//Membuat pohon
		BTree_2511531007 tree_1007 = new BTree_2511531007();
		System.out.print("Jumlah Simpul awal pohon: ");
		System.out.println(tree_1007.countNodes_1007());
		
		//Menambahkan simpul data 1
		Node_2511531007 root_1007 = new Node_2511531007(1);
		
		// Menjadikan simpul 1 sebagai root
		tree_1007.setRoot_1007(root_1007);
		System.out.println("Jumlah simpul jika hanya ada root");
		System.out.println(tree_1007.countNodes_1007());
		Node_2511531007 node2_1007 = new Node_2511531007(2);
		Node_2511531007 node3_1007 = new Node_2511531007(3);
		Node_2511531007 node4_1007 = new Node_2511531007(4);
		Node_2511531007 node5_1007 = new Node_2511531007(5);
		Node_2511531007 node6_1007 = new Node_2511531007(6);
		Node_2511531007 node7_1007 = new Node_2511531007(7);
		Node_2511531007 node8_1007 = new Node_2511531007(8);
		Node_2511531007 node9_1007 = new Node_2511531007(9);
		root_1007.setLeft_1007(node2_1007);
		node2_1007.setLeft_1007(node4_1007);
		node2_1007.setRight_1007(node5_1007);
		node4_1007.setRight_1007(node8_1007);
		root_1007.setRight_1007(node3_1007);
		node3_1007.setLeft_1007(node6_1007);
		node3_1007.setRight_1007(node7_1007);
		node6_1007.setLeft_1007(node9_1007);
		
		//Set root
		tree_1007.setCurrent_1007(tree_1007.getRoot_1007());
		System.out.println("menampilkan simpul terakhir: ");
		System.out.println(tree_1007.getCurrent_1007().getData_1007());
		System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
		System.out.println(tree_1007.countNodes_1007());
		System.out.println("InOrder: ");
		tree_1007.printInorder_1007();
		System.out.println("\nPreorder: ");
		tree_1007.printPreorder_1007();
		System.out.println("\nPostorder: ");
		tree_1007.printPostorder_1007();
		System.out.println("\nmenampilkan simpul dalam bentuk pohon");
		tree_1007.print_1007();
	}

}
