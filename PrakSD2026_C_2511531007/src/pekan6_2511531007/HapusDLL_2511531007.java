package pekan6_2511531007;

public class HapusDLL_2511531007 {
	// fungsi menghapus node awal
	public static  NodeDLL_2511531007 delHead_1007(NodeDLL_2511531007 head_1007) {
		if (head_1007 == null) {
			return null;
		}
		NodeDLL_2511531007 temp_1007 = head_1007;
		head_1007 = head_1007.next_1007;
		if (head_1007 != null) {
			head_1007.prev_1007 = null;
		}
		return head_1007;
	}
	// fungsi menghapus di akhir
	public static NodeDLL_2511531007 delLast_1007(NodeDLL_2511531007 head_1007) {
		if (head_1007 == null) {
			return null;
		}
		if (head_1007.next_1007 == null) {
			return null;
		}
		NodeDLL_2511531007 curr_1007 = head_1007;
		while (curr_1007.next_1007 != null) {
			curr_1007 = curr_1007.next_1007;
		}
		// update pointer previous node
		if (curr_1007.prev_1007 != null) {
			curr_1007.prev_1007.next_1007 = null;
		}
		return head_1007;
	}
	// fungsi menghapus node posisi tertentu
	public static NodeDLL_2511531007 delPos_1007(NodeDLL_2511531007 head_1007, int pos_1007) {
		// jika DLL kosong 
		if (head_1007 == null) {
			return head_1007;
		}
		NodeDLL_2511531007 curr_1007 = head_1007;
		// telusuri sampai ke node yang akan dihapus
		for (int i_1007 = 1; curr_1007 != null && i_1007 < pos_1007; i_1007++) {
			curr_1007 = curr_1007.next_1007;
		}
		// jika posisi tidak ditemukan
		if (curr_1007 == null) {
			return head_1007;
		}
		// update pointer 
		if (curr_1007.prev_1007 != null) {
			curr_1007.prev_1007.next_1007 = curr_1007.next_1007;
		}
		if (curr_1007.next_1007 != null) {
			curr_1007.next_1007.prev_1007 = curr_1007.prev_1007;
		}
		// jika yang ingin dihapus head
		if (head_1007 == curr_1007) {
			head_1007 = curr_1007.next_1007;
		}
		return head_1007;
	}
	// fungsi mencetak DLL 
	public static void printList_1007(NodeDLL_2511531007 head_1007) {
		NodeDLL_2511531007 curr_1007 = head_1007;
		while (curr_1007 != null) {
			System.out.print(curr_1007.data_1007 + " ");
			curr_1007 = curr_1007.next_1007;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// buat sebuah DLL
		NodeDLL_2511531007 head_1007 = new NodeDLL_2511531007(1);
		head_1007.next_1007 = new NodeDLL_2511531007(2);
		head_1007.next_1007.prev_1007 = head_1007;
		head_1007.next_1007.next_1007 = new NodeDLL_2511531007(3);
		head_1007.next_1007.next_1007.prev_1007 = head_1007.next_1007;
		head_1007.next_1007.next_1007.next_1007 = new NodeDLL_2511531007(4);
		head_1007.next_1007.next_1007.next_1007.prev_1007 = head_1007.next_1007.next_1007;
		head_1007.next_1007.next_1007.next_1007.next_1007 = new NodeDLL_2511531007(5);
		head_1007.next_1007.next_1007.next_1007.next_1007.prev_1007 = head_1007.next_1007.next_1007.next_1007;
		
		System.out.print("DLL Awal: ");
		printList_1007(head_1007);
		
		System.out.print("Setelah head dihapus: ");
		head_1007 = delHead_1007(head_1007);
		printList_1007(head_1007);
		
		System.out.print("Setelah node terakhir dihapus: ");
		head_1007 = delLast_1007(head_1007);
		printList_1007(head_1007);
		
		System.out.print("menghapus node ke 2: ");
		head_1007 = delPos_1007(head_1007, 2);
		printList_1007(head_1007);
	}

}
