package tugasPraktikum_pekan6_2511531007;

import java.util.Scanner;

public class Musik_2511531007 {
	 // menambah lagu di akhir playlist
	 public static Lagu_2511531007 tambahLagu_1007(Lagu_2511531007 head_1007, String judul_1007, String penyanyi_1007) {
	 // buat lagu baru
	 Lagu_2511531007 newLagu_1007 = new Lagu_2511531007(judul_1007, penyanyi_1007);
	 // jika dll null jadikan head
	 if (head_1007 == null) {
	     head_1007 = newLagu_1007;
	 } else {
		 Lagu_2511531007 curr_1007 = head_1007;
		 while (curr_1007.next_1007 != null) {
		 curr_1007 = curr_1007.next_1007;
		 }
	 	 curr_1007.next_1007 = newLagu_1007;
	 	 newLagu_1007.prev_1007 = curr_1007;
	   }
	    System.out.println("Lagu berhasil ditambahkan!");
	    return head_1007;
	 }
	 // menghapus lagu pertama
	 public static Lagu_2511531007 hapusLaguAwal_1007(Lagu_2511531007 head_1007) {
	     if (head_1007 == null) {
	            System.out.println("Playlist kosong!");
	            return null;
	        }
	        System.out.println("Lagu " + head_1007.judul_1007 + " berhasil dihapus");
	        
	        head_1007 = head_1007.next_1007;
	        if (head_1007 != null) {
	            head_1007.prev_1007 = null;
	        }
	        return head_1007;
	 }
	 // menampilkan playlist awal -> akhir
	 static void tampilMaju_1007(Lagu_2511531007 head_1007) {
	    // mulai playlist dari awal
	    Lagu_2511531007 curr_1007 = head_1007;
	    // lanjut sampai akhir
	    System.out.println("\n=== Playlist Maju ===");
	    while (curr_1007 != null) {
	    	// print lagu
	    	System.out.println(curr_1007.judul_1007 + " - " + curr_1007.penyanyi_1007);
	    	// pindah ke lagu berikutnya
	    	curr_1007 = curr_1007.next_1007;
	    }
	    // cetak spasi
	    System.out.println();
	 }
	 // menampilkan playlist akhir -> awal
	 static void tampilMundur_1007(Lagu_2511531007 tail_1007) {
	    // mulai playlist dari akhir
	   	Lagu_2511531007 curr_1007 = tail_1007;
	   	// lanjut sampai awal
	    System.out.println("\n=== Playlist Mundur ===");
	   	while (curr_1007 != null) {
	   		// cetak lagu
    		System.out.println(curr_1007.judul_1007 + " - " + curr_1007.penyanyi_1007);
    		// pindah ke lagu sebelumnya
	    	curr_1007 = curr_1007.prev_1007;
	   	}
	   	// cetak spasi
	   	System.out.println();
	 }
	 // mencari lagu berdasarkan judul
	 static void cariLagu_1007(Lagu_2511531007 head_1007, String cariJudul_1007) {
	      if (head_1007 == null) {
	         System.out.println("Playlist kosong!");
	         return;
        }
	    Lagu_2511531007 curr_1007 = head_1007;
	    boolean ditemukan_1007 = false;
	    
	    while (curr_1007 != null) {
	    	if (curr_1007.judul_1007.equalsIgnoreCase(cariJudul_1007)) {
	            System.out.println("Lagu ditemukan:");
	            System.out.println(curr_1007.judul_1007 + " - " + curr_1007.penyanyi_1007);
                ditemukan_1007 = true;
                break;
	        }
	        curr_1007 = curr_1007.next_1007;
	   }
	    if (!ditemukan_1007) {
		   System.out.println("Lagu tidak ditemukan!");
	    }
	  }
	  public static void main(String[] args) {
	      Scanner input_1007 = new Scanner(System.in);
	      Lagu_2511531007 head_1007 = null;
	      int pilihan_1007;

	      do {
            System.out.println("\n=== Playlist Musik NIM: 2511531007 ===");
            System.out.println("1. Tambah Lagu");
	        System.out.println("2. Hapus Lagu Pertama");
	        System.out.println("3. Lihat Playlist (Maju)");
	        System.out.println("4. Lihat Playlist (Mundur)");
	        System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_1007 = input_1007.nextInt();
	        input_1007.nextLine();
	        
	        switch (pilihan_1007) {
	        	case 1:
	        		System.out.print("Judul Lagu: ");
	                String judul_1007 = input_1007.nextLine();

	                System.out.print("Penyanyi: ");
	                String penyanyi_1007 = input_1007.nextLine();

	                head_1007 = Musik_2511531007.tambahLagu_1007(head_1007, judul_1007, penyanyi_1007);
                    break;
                case 2:
                	head_1007 = Musik_2511531007.hapusLaguAwal_1007(head_1007);
	                break;

	            case 3:
	            	Musik_2511531007.tampilMaju_1007(head_1007);
	                break;

	            case 4:
	            	Lagu_2511531007 tail_1007 = head_1007;
	            	while (tail_1007 != null && tail_1007.next_1007 != null) {
	            	    tail_1007 = tail_1007.next_1007;
	            	}
	                Musik_2511531007.tampilMundur_1007(tail_1007);
	                break;

                case 5:
                	System.out.print("Masukkan judul lagu yang dicari: ");
	                String cari_1007 = input_1007.nextLine();
	                Musik_2511531007.cariLagu_1007(head_1007, cari_1007);
	                break;

	            case 6:
	                System.out.println("Program selesai");
	                break;
	                
	           default:
	                System.out.println("Pilihan tidak tersedia!");
	        }

	     } while (pilihan_1007 != 6);
	      input_1007.close();
	 }
}
