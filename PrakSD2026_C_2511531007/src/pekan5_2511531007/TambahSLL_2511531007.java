package pekan5_2511531007;

public class TambahSLL_2511531007 {
	public static NodeSLL_2511531007 insertAtFront_1007(NodeSLL_2511531007 head_1007, int value_1007) {
		NodeSLL_2511531007 new_node_1007 = new NodeSLL_2511531007(value_1007);
		new_node_1007.next_1007 = head_1007;
		return new_node_1007;
	}
	// fungsi menambahkan node di akhir SLL
		public static NodeSLL_2511531007 insertAtEnd_1007(NodeSLL_2511531007 head_1007, int value_1007) {
			// buat sebuah node dengan sebuah nilai
			NodeSLL_2511531007 newNode_1007 = new NodeSLL_2511531007(value_1007);
			// jika list kosong maka node jadi head
			if (head_1007 == null) {
				return newNode_1007;
			}
		// simpan head ke variabel sementara
			NodeSLL_2511531007 last_1007 = head_1007;
			// telusuri ke node akhir
			while (last_1007.next_1007 != null) {
				last_1007 = last_1007.next_1007;
			}
			// ubah pointer 
			last_1007.next_1007 = newNode_1007;
			return head_1007;
		}
		static NodeSLL_2511531007 GetNode_1007(int data_1007) {
			return new NodeSLL_2511531007(data_1007);
		}
		static NodeSLL_2511531007 insertPos_1007(NodeSLL_2511531007 headNode_1007, int position_1007, int value_1007) {
			NodeSLL_2511531007 head_1007 = headNode_1007;
			if (position_1007 < 1) {
				System.out.print("Invalid position");
			}
			if (position_1007 == 1) {
				NodeSLL_2511531007 new_node_1007 = new NodeSLL_2511531007(value_1007);
				new_node_1007.next_1007 = head_1007;
				return new_node_1007;
			} else {
				while (position_1007-- != 0) {
					if (position_1007 == 1) {
						NodeSLL_2511531007 newNode_1007 = GetNode_1007(value_1007);
						newNode_1007.next_1007 = headNode_1007.next_1007;
						headNode_1007.next_1007 = newNode_1007;
						break;
					}
					headNode_1007 = headNode_1007.next_1007;
				}
			if (position_1007 != 1) 
			System.out.print("Posisi di luar jangkauan"); 
			}
			return head_1007;
			}
			
		public static void printList_1007(NodeSLL_2511531007 head_1007) {
			NodeSLL_2511531007 curr_1007 = head_1007;
				while (curr_1007.next_1007 != null) {
					System.out.print(curr_1007.data_1007 + "-->");
					curr_1007 = curr_1007.next_1007;
			}
			if (curr_1007.next_1007 == null) {
				System.out.print(curr_1007.data_1007);
			}
			System.out.println();
		}
		
		public static void main (String[] args) {
			// buat linked list 2->3->5->6
			NodeSLL_2511531007 head_1007 = new NodeSLL_2511531007(2);
			head_1007.next_1007 = new NodeSLL_2511531007(3);
			head_1007.next_1007.next_1007 = new NodeSLL_2511531007(5);
			head_1007.next_1007.next_1007.next_1007 = new NodeSLL_2511531007(6);
			
			// cetak list asli
			System.out.print("Senarai berantai awal:");
			printList_1007(head_1007);
			
			// tambahkan node baru di depan
			System.out.print("tambah 1 simpul di depan: ");
			int data_1007 = 1;
			head_1007 = insertAtFront_1007(head_1007, data_1007);
			
			// cetak update list
			printList_1007(head_1007);
			
			// tambahkan node baru di belakang 
			System.out.print("tambah 1 simpul di belakang: ");
			int data2_1007 = 7;
			head_1007 = insertAtEnd_1007(head_1007, data2_1007);
			
			// cetak update list 
			printList_1007(head_1007);
			System.out.print("tambah 1 simpul ke data 4: ");
			int data3_1007 = 4;
			int pos_1007 = 4;
			head_1007 = insertPos_1007(head_1007, pos_1007, data3_1007);
			
			// cetak update list
			printList_1007(head_1007);
			
		}
			
		
}
