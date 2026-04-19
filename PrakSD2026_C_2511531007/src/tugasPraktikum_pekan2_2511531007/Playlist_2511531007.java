package tugasPraktikum_pekan2_2511531007;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511531007 {
	
	// 1. Method untuk menampilkan menu
	public static void tampilkanMenu_1007() {
		System.out.println("\n=== Playlist Musik NIM: 2511531007 ===");
        System.out.println("1. Tambah Lagu");
        System.out.println("2. Lihat Playlist");
        System.out.println("3. Hapus Lagu");
        System.out.println("4. Keluar");
        System.out.print("Pilihan: ");
	}
	
	// 2. Method untuk tambah lagu
	public static void tambahLagu_1007(ArrayList<Music_2511531007> playlist_1007, Scanner sc_1007) {
		System.out.print("\nMasukkan Judul: ");
		String judul_1007 = sc_1007.nextLine();
		System.out.print("Masukkan Penyanyi: ");
		String penyanyi_1007 = sc_1007.nextLine();
		System.out.print("Masukkan Durasi (detik): ");
		int durasi_1007 = sc_1007.nextInt();
		playlist_1007.add(new Music_2511531007 (judul_1007, penyanyi_1007, durasi_1007));
		System.out.println("Data Berhasil Ditambahkan!");
	}
	
	// 3. Method untuk lihat playlist 
	public static void lihatPlaylist_1007(ArrayList<Music_2511531007> playlist_1007) {
		if (playlist_1007.isEmpty()) {
			System.out.println("Playlist Kosong.");
		} else {
			System.out.println("\n--- Daftar Playlist ---");
		 for (int i = 0; i < playlist_1007.size(); i++) {
             System.out.println((i + 1) + ". " + playlist_1007.get(i).toString());
			}
		System.out.println("Jumlah total lagu dalam playlist: " + playlist_1007.size()); // untuk ngecek kapasitas
		}
	}
	
	// 4. Method untuk hapus lagu berdasarkan indeks
	public static void hapusLagu_1007(ArrayList<Music_2511531007> playlist_1007, Scanner sc_1007) {
		if (playlist_1007.isEmpty()) {
			System.out.println("Playlist Kosong.");
		} else {
			System.out.print("Masukkan nomor lagu yang ingin dihapus: ");
			int indeks_1007 = sc_1007.nextInt();
			sc_1007.nextLine(); // consume newLine
			
			if (indeks_1007 >= 1 && indeks_1007 <= playlist_1007.size()) {
				playlist_1007.remove(indeks_1007 - 1);
				System.out.println("Lagu berhasil dihapus!");
			} else {
				System.out.println("Nomor lagu tidak valid.");
			}
		}
	}
	
	// Main Method
	public static void main(String[] args) {
		ArrayList<Music_2511531007> musicPlaylist_1007 = new ArrayList<>();
		Scanner sc_1007 = new Scanner(System.in);
		int pilih_1007;
		
		do {
			tampilkanMenu_1007();
			pilih_1007 = sc_1007.nextInt();
			sc_1007.nextLine(); // consume newLine
			
			switch (pilih_1007) {
				case 1:
					tambahLagu_1007(musicPlaylist_1007, sc_1007);
					break;
				case 2:
					lihatPlaylist_1007(musicPlaylist_1007);
					break;
				case 3:
					hapusLagu_1007(musicPlaylist_1007, sc_1007);
					break;
				case 4:
					System.out.println("Keluar dari program.");
					break;
				default:
					System.out.println("Pilihan tidak valid.");
			}			
		} while (pilih_1007 != 4);
		sc_1007.close();
	}
}
