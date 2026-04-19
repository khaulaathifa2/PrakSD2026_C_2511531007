package tugasPraktikum_pekan3_2511531007;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511531007 {
	public static void main(String[] args) {
		// Membuat stack yang menyimpan objek website
		Stack<Website_2511531007> history_1007 = new Stack<>();
		Scanner wb_1007 = new Scanner(System.in);
		int choose_1007;
				 
		 do {
			 // Menu Tampilan
			 System.out.println("\n=== Browser History NIM: 2511531007 ===");
			 System.out.println("1. Kunjungi Website (Push)");
	         System.out.println("2. Tombol Back (Pop)");
	         System.out.println("3. Lihat Halaman Aktif (Peek)");
	         System.out.println("4. Keluar");
	         System.out.print("Pilihan: ");
	         
	         // Input pilihan
	         choose_1007 = wb_1007.nextInt();
	         wb_1007.nextLine(); //consume newLine
	         
	         switch (choose_1007) {
	         	case 1:
	         		// --- KUNJUNGI WEBSITE (PUSH) ---
	                System.out.print("\nMasukkan Judul: ");
	                String judul_1007 = wb_1007.nextLine();
	                System.out.print("Masukkan URL: ");
	                String url_1007 = wb_1007.nextLine();
                 
	                // Buat objek website baru
	                Website_2511531007 newSite_1007 = new Website_2511531007(judul_1007, url_1007);
	                 
	                // Masukkan ke stack
	                history_1007.push(newSite_1007);
	                System.out.println("\nBerhasil mengunjungi halaman!");
	                break;
	                
	         	case 2:
	         		// --- TOMBOL BACK (POP) ---
                    if (history_1007.isEmpty()) {
                    	System.out.println("History Kosong! Tidak ada halaman sebelumnya.");
                    } else {
                    	Website_2511531007 oldSite_1007 = history_1007.pop();
                    	System.out.println("Halaman sebelumnya: " + oldSite_1007.getJudul_1007());
                    }
                    break;
                    
	         	case 3:
	         		// --- LIHAT HALAMAN AKTIF (PEEK) ---
	         		if (history_1007.isEmpty()) {
	         			System.out.println("History Kosong! Tidak ada halaman yang aktif.");
	         		} else {
	         			Website_2511531007 onSite_1007 = history_1007.peek();
	         			System.out.println("\n--- Halaman Saat Ini ---");
                        System.out.println(onSite_1007.toString());
                        System.out.println("------------------------");
	         		}
	         		System.out.println("Total riwayat: " + history_1007.size() + " halaman.");
	                System.out.println("Status kosong: " + history_1007.isEmpty()); // Cek status history
	                break;
	                
	         	case 4:
	         		System.out.println("Keluar dari browser...");
	                break;
	            
	         	 default:
	                    System.out.println("Pilihan tidak valid!");
	         }
		 } while (choose_1007 != 4);
		 wb_1007.close();
	}

}

