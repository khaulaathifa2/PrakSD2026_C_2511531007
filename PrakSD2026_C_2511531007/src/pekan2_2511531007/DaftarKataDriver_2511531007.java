package pekan2_2511531007;

public class DaftarKataDriver_2511531007 {

	public static void main(String[] args) {
		DaftarKata_2511531007 al = new DaftarKata_2511531007();
		
		// Menambah elemen (akhir)
		al.tambah_2511531007("Kami");
		al.tambah_2511531007("Informatika");
		
		// Menyisipkan elemen pada indeks 1
		al.tambahPada_2511531007(1, "Mahasiswa");
		
		// Cetak isi awal
		System.out.println("Awal           : " + al);
		
		//Mengubah elemen (index 1)
		al.ubahElemen_2511531007(1, "Departemen");
		System.out.println("Setelah Ubah   : " + al);
		
		//Menghapus elemen (hapus index 0)
		String terhapus = al.hapusElemen_2511531007(0);
		System.out.println("Terhapus       : " + terhapus);
		System.out.println("Setelah Hapus  : " + al);
		
		//Iterasi pada ArrayList (cetak setiap elemen)
		System.out.print("Iterasi        : ");
		al.iterasiCetak_2511531007();
		System.out.println();
	}

}
