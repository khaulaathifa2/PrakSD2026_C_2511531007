package pekan4_2511531007;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511531007 {

	public static void main(String[] args) {
		Queue<Integer> q_1007 = new LinkedList<>();
		// tambah elemen (0, 1, 2, 3, 4, 5) ke antrian
		for (int i = 0; i < 6; i++) {
			q_1007.add((i));
		}
		// menampilkan isi antrian.
		System.out.println("Elemen Antrian " + q_1007);
		// untuk menghapus kepala antrian.
		int hapus_1007 = q_1007.remove();
		System.out.println("Hapus elemen = " + hapus_1007);
		System.out.println(q_1007);
		// untuk melihat antrian terdepan
		int depan_1007 = q_1007.peek();
		System.out.println("Kepala Antrian = " + depan_1007);
		
		int banyak_1007 = q_1007.size();
		System.out.println("Size Antrian " + banyak_1007);
	}

}
