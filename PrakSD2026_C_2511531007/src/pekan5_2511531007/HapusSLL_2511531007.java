package pekan5_2511531007;

public class HapusSLL_2511531007 {
	// fungsi untuk menghapus head
	public static NodeSLL_2511531007 deleteHead_1007(NodeSLL_2511531007 head_1007) {
		// jika SLL kosong
		if (head_1007 == null)
			return null;
		// pindahkan head ke node berikutnya
		head_1007 = head_1007.next_1007;
		// return head baru
		return head_1007;
	}
	// fungsi menghapus node terakhir SLL
	public static NodeSLL_2511531007 removeLastNode_1007(NodeSLL_2511531007 head_1007) {
		// jika list kosong, return null
		if (head_1007 == null) {
			return null;
		}
		// jika list satu node, hapus node dan return null
		if (head_1007.next_1007 == null) {
			return null;
		}
		// temukan node terakhir ke dua
		NodeSLL_2511531007 secondLast_1007 = head_1007;
		while (secondLast_1007.next_1007.next_1007 != null) {
			secondLast_1007 = secondLast_1007.next_1007;
		}
		// hapus node terakhir
		secondLast_1007.next_1007 = null;
		return head_1007;
	}
	// fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511531007 deleteNode_1007(NodeSLL_2511531007 head_1007, int position_1007) {
		NodeSLL_2511531007 temp_1007 = head_1007;
		NodeSLL_2511531007 prev_1007 = null;
		// jika linked list null
		if (temp_1007 == null)
			return head_1007;
		// kasus 1: head dihapus
		if (position_1007 == 1) {
			head_1007 = temp_1007.next_1007;
			return head_1007;
		}
		// kasus 2: menghapus node di tengah
		// telusuri ke node yang di hapus
	for (int i_1007 = 1; temp_1007 != null && i_1007 < position_1007; i_1007++) {
		prev_1007 = temp_1007;
		temp_1007 = temp_1007.next_1007;
	}
	// jika ditemukan, hapus node
	if (temp_1007 != null) {
		prev_1007.next_1007 = temp_1007.next_1007;
	} else {
		System.out.println("Data tidak ada");
	}
		return head_1007;
	}
	// fungsi mencetak SLL
	public static void printList_1007(NodeSLL_2511531007 head_1007) {
		NodeSLL_2511531007 curr_1007 = head_1007;
		while (curr_1007.next_1007 != null) {
			System.out.print(curr_1007.data_1007+"-->");
			curr_1007 = curr_1007.next_1007;
		}
		if (curr_1007.next_1007 == null) {
			System.out.print(curr_1007.data_1007);
		}
		System.out.println();
	
	}
	// kelas main
	public static void main(String[] args) {
		// buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
		NodeSLL_2511531007 head_1007 = new NodeSLL_2511531007(1);
		head_1007.next_1007 = new NodeSLL_2511531007(2);
		head_1007.next_1007.next_1007 = new NodeSLL_2511531007(3);
		head_1007.next_1007.next_1007.next_1007 = new NodeSLL_2511531007(4);
		head_1007.next_1007.next_1007.next_1007.next_1007 = new NodeSLL_2511531007(5);
		head_1007.next_1007.next_1007.next_1007.next_1007.next_1007 = new NodeSLL_2511531007(6);
		// cetak list awal 
		System.out.println("list awal: ");
		printList_1007(head_1007);
		
		//hapus head
		head_1007 = deleteHead_1007(head_1007);
		System.out.println("List setelah head dihapus: ");
		printList_1007(head_1007);
		
		//hapus node terakhir
		head_1007 = removeLastNode_1007(head_1007);
		System.out.println("List setelah simpul terakhir di hapus: ");
		printList_1007(head_1007);
		
		// deleting node at position 2
		int position_1007 = 2;
		head_1007 = deleteNode_1007(head_1007, position_1007);
		
		// print list after deletion
		System.out.println("List setelah posisi 2 dihapus: ");
		printList_1007(head_1007);
	}
}
