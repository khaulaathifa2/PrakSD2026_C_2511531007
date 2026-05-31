package tugasPraktikum_pekan8_2511531007;

public class Sorting_2511531007 {
	Lagu_2511531007[] dataLagu_1007 = new Lagu_2511531007[20];
	int jumlah_1007 = 0;

	public void inputData_1007() {
		dataLagu_1007[0] = new Lagu_2511531007("Feel It", "D4vd", 137);
		dataLagu_1007[1] = new Lagu_2511531007("In My Room", "Chance Peña", 157);
		dataLagu_1007[2] = new Lagu_2511531007("Unforgettable", "Miyuze", 122);
		dataLagu_1007[3] = new Lagu_2511531007("Nobody's Better", "Suzi ft. Fetty Wap", 209);
		dataLagu_1007[4] = new Lagu_2511531007("Her", "JVKE ft. ZVC", 144);
		dataLagu_1007[5] = new Lagu_2511531007("On Bended Knee", "Boyz II Men", 329);
		dataLagu_1007[6] = new Lagu_2511531007("Love", "Keyshia Cole", 255);
		jumlah_1007 = 7;
	}

	public void tampilData_1007() {
		for (int i_1007 = 0; i_1007 < jumlah_1007; ++i_1007) {
			System.out.println((i_1007 + 1) + "." + dataLagu_1007[i_1007].toString_1007());
		}
	}
	
	// swap dua elemen array Lagu
	static void swap_1007(Lagu_2511531007[] arr_1007, int i_1007, int j_1007) {
		Lagu_2511531007 temp_1007 = arr_1007[i_1007];
		arr_1007[i_1007] = arr_1007[j_1007];
		arr_1007[j_1007] = temp_1007;
	}

	// metode tambahan untuk mengatur pivot menggunakan median-of-three
	static void medianOfThree_1007(Lagu_2511531007[] arr_1007, int low_1007, int high_1007) {
		int mid_1007 = low_1007 + (high_1007 - low_1007) / 2;

		// Urutkan berdasarkan durasi: low, mid, high
		if (arr_1007[low_1007].getDurasi_1007() > arr_1007[mid_1007].getDurasi_1007()) {
			swap_1007(arr_1007, low_1007, mid_1007);
		}
		if (arr_1007[low_1007].getDurasi_1007() > arr_1007[high_1007].getDurasi_1007()) {
			swap_1007(arr_1007, low_1007, high_1007);
		}
		if (arr_1007[mid_1007].getDurasi_1007() > arr_1007[high_1007].getDurasi_1007()) {
			swap_1007(arr_1007, mid_1007, high_1007);
		}
		// Pindahkan median ke posisi high sebagai pivot
		swap_1007(arr_1007, mid_1007, high_1007);
	}

	static int partition_1007(Lagu_2511531007[] arr_1007, int low_1007, int high_1007) {
		// panggil fungsi medianOfThree sebelum menentukan pivot
		medianOfThree_1007(arr_1007, low_1007, high_1007);

		int pivot_1007 = arr_1007[high_1007].getDurasi_1007(); // sekarang arr_1007[high_1007] sudah berisi nilai median dari durasi
		int i_1007 = (low_1007 - 1);

		for (int j_1007 = low_1007; j_1007 <= high_1007 - 1; j_1007++) {
			// membandingkan durasi
			if (arr_1007[j_1007].getDurasi_1007() < pivot_1007) {
				// increment indeks elemen yang lebih kecil
				i_1007++;
				swap_1007(arr_1007, i_1007, j_1007);
			}
		}
		swap_1007(arr_1007, i_1007 + 1, high_1007);
		return (i_1007 + 1);
	}

	// method utama quick sort
	static void quickSort_1007(Lagu_2511531007[] arr_1007, int low_1007, int high_1007) {
		if (low_1007 < high_1007) {
			int pi_1007 = partition_1007(arr_1007, low_1007, high_1007);
			quickSort_1007(arr_1007, low_1007, pi_1007 - 1);
			quickSort_1007(arr_1007, pi_1007 + 1, high_1007);
		}
	}

	// wrapper method untuk memudahkan panggilan dari luar
	public void quickSort_1007() {
		if (jumlah_1007 > 1) {
			quickSort_1007(dataLagu_1007, 0, jumlah_1007 - 1);
		}
	}

	public static void main(String[] args) {
		Sorting_2511531007 playlist_1007 = new Sorting_2511531007();

		System.out.println("=== Sorting Playlist NIM: 2511531007 ===");
		System.out.println("Pilih Algoritma (1=Shell, 2=Quick, 3=Merge): 2");
		playlist_1007.inputData_1007();

		System.out.println("\nData Sebelum Sorting:");
		playlist_1007.tampilData_1007();

		// Eksekusi Quick Sort
		playlist_1007.quickSort_1007();

		System.out.println("\nData Setelah Quick Sort (Durasi Asc):");
		playlist_1007.tampilData_1007();
	}
}
