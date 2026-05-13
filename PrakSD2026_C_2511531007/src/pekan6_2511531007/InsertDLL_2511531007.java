package pekan6_2511531007;

public class InsertDLL_2511531007 {
	// menambhakan node di awal DLL
	static NodeDLL_2511531007 insertBegin_1007(NodeDLL_2511531007 head_1007, int data_1007) {
		// buat node baru 
		NodeDLL_2511531007 new_node_1007 = new NodeDLL_2511531007(data_1007);
		// jadikan pointer nextnya head
		new_node_1007.next_1007 = head_1007;
		// jadikan pointer prev head ke new_node
		if (head_1007 != null) {
			head_1007.prev_1007 = new_node_1007;
		}
		return new_node_1007;
	}
	// fungsi menambahkan node di akhir 
public static NodeDLL_2511531007 insertEnd_1007(NodeDLL_2511531007 head_1007, int newData_1007) {
		// buat node baru
		NodeDLL_2511531007 newNode_1007 = new NodeDLL_2511531007(newData_1007);
		// jika dll null jadikan head
		if (head_1007 == null) {
			head_1007 = newNode_1007;
		} else {
			NodeDLL_2511531007 curr_1007 = head_1007;
			while (curr_1007.next_1007 != null) {
				curr_1007 = curr_1007.next_1007;
			}
			curr_1007.next_1007 = newNode_1007;
			newNode_1007.prev_1007 = curr_1007;
		}
		return head_1007;
}
// fungsi menambahkan node di posisi tertentu
public static NodeDLL_2511531007 insertAtPosition_1007(NodeDLL_2511531007 head_1007, int pos_1007, int new_data_1007) {
	// buat node baru
	NodeDLL_2511531007 new_node_1007 = new NodeDLL_2511531007(new_data_1007);
	if (pos_1007 == 1) {
		new_node_1007.next_1007 = head_1007;
		if (head_1007 != null) {
			head_1007.prev_1007 = new_node_1007; 
		}
		head_1007 = new_node_1007;
		return head_1007;
	}
	NodeDLL_2511531007 curr_1007 = head_1007;
	for (int i_1007 = 1; i_1007 < pos_1007 - 1 && curr_1007 != null; i_1007++) {
		curr_1007 = curr_1007.next_1007;
	}
		if (curr_1007 == null) {
			System.out.println("Posisi tidak ada");
			return head_1007;
		}
		new_node_1007.prev_1007 = curr_1007;
		new_node_1007.next_1007 = curr_1007.next_1007;
		curr_1007.next_1007 = new_node_1007;
		if (new_node_1007.next_1007 != null) {
			new_node_1007.next_1007.prev_1007 = new_node_1007;
		}
		return head_1007;
}
public static void printList_1007(NodeDLL_2511531007 head_1007) {
	NodeDLL_2511531007 curr_1007 = head_1007;
	while (curr_1007 != null) {
		System.out.print(curr_1007.data_1007 + " <-> ");
		curr_1007 = curr_1007.next_1007;
	}
	System.out.println();
}
public static void main(String[] args) {
	//membuat dll 2 <-> 3 <-> 5
	NodeDLL_2511531007 head_1007 = new NodeDLL_2511531007(2);
	head_1007.next_1007 = new NodeDLL_2511531007(3);
	head_1007.next_1007.prev_1007 = head_1007;
	head_1007.next_1007.next_1007 = new NodeDLL_2511531007(5);
	head_1007.next_1007.prev_1007 = head_1007.next_1007;
	// cetak DLL awal
	System.out.print("DLL Awal: ");
	printList_1007(head_1007);
	// tambah 1 di awal 
	head_1007 = insertBegin_1007(head_1007, 1);
	System.out.print("simpul 1 ditambah di awal: ");
	printList_1007(head_1007);
	// tambah 6 di akhir
	System.out.print("simpul 6 ditambah di akhir: ");
	int data_1007 = 6;
	head_1007 = insertEnd_1007(head_1007, data_1007);
	printList_1007(head_1007);
	// menambah node 4 di posisi 4
	System.out.print("tambah node 4 di posisi 4: ");
	int data2_1007 = 4;
	int pos_1007 = 4;
	head_1007 = insertAtPosition_1007(head_1007, pos_1007, data2_1007);
	printList_1007(head_1007);
}

}
