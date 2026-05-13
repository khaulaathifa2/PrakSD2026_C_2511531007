package pekan6_2511531007;

public class PenelusuranDLL_2511531007 {
	// fungsi penelusuran maju
	static void forwardTraversal_1007(NodeDLL_2511531007 head_1007) {
		// memulai penelusuran dari head
		NodeDLL_2511531007 curr_1007 = head_1007;
		// lanjutkan sampai akhir
		while (curr_1007 != null) {
			// print data
			System.out.print(curr_1007.data_1007 + " <-> ");
			// pindah ke node berikutnya
			curr_1007 = curr_1007.next_1007;
		}
		// print spasi
		System.out.println();
	}
	//fungsi penelusuran mundur
	static void backwardTraversal_1007(NodeDLL_2511531007 tail_1007) {
		// mulai dari akhir
		NodeDLL_2511531007 curr_1007 = tail_1007;
		// lanjut sampai head
		while (curr_1007 != null) {
			// cetak data
			System.out.print(curr_1007.data_1007 + " <-> ");
			// pindah ke node sebelumnya
			curr_1007 = curr_1007.prev_1007;
		}
		// cetak spasi
		System.out.println();
	}
	public static void main(String[] args) {
		// cetak DLL
		NodeDLL_2511531007 head_1007 = new NodeDLL_2511531007(1);
		NodeDLL_2511531007 second_1007 = new NodeDLL_2511531007(2);
		NodeDLL_2511531007 third_1007 = new NodeDLL_2511531007(3);
		
		head_1007.next_1007 = second_1007;
		second_1007.prev_1007 = head_1007;
		second_1007.next_1007 = third_1007;
		third_1007.prev_1007 = second_1007;
		
		System.out.println("Penelusuran maju:");
		forwardTraversal_1007(head_1007);
		
		System.out.println("Penelusuran mundur:");
		backwardTraversal_1007(third_1007);
	}

}
