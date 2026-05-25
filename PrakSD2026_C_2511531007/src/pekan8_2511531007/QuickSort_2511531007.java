package pekan8_2511531007;

public class QuickSort_2511531007 {
	static void swap_1007(int [] arr_1007, int i_1007, int j_1007) {
		int temp_1007 = arr_1007[i_1007];
		arr_1007[i_1007] = arr_1007[j_1007];
		arr_1007[j_1007] = temp_1007;
	}
	// metode tambahan untuk mengatur pivot menggunakan median-of-three
	static void medianOfThree_1007(int [] arr_1007, int low_1007, int high_1007) {
		int mid_1007 = low_1007 + (high_1007 - low_1007) / 2;
		
		//urutkan elemen low, mid, dan high
		if (arr_1007[low_1007] > arr_1007[mid_1007]) {
			swap_1007(arr_1007, low_1007, mid_1007);
		}
		if (arr_1007[low_1007] > arr_1007[high_1007]) {
			swap_1007(arr_1007, low_1007, high_1007);
		}
		if (arr_1007[mid_1007] > arr_1007[high_1007]) {
			swap_1007(arr_1007, mid_1007, high_1007);
		}
		swap_1007(arr_1007, mid_1007, high_1007);
	}
	static int partition_1007(int[] arr_1007, int low_1007, int high_1007) {
		//panggil fungsi medianOfThree sebelum menentukan pivot
		medianOfThree_1007(arr_1007, low_1007, high_1007);
		
		int pivot_1007 = arr_1007[high_1007]; // sekarang arr_1007[high_1007] sudah berisi nilai median
		int i_1007 = (low_1007 - 1);
		
		for (int j_1007 = low_1007; j_1007 <= high_1007 - 1; j_1007++) {
			// jika elemen saat ini lebih kecil dari atau sama dengan pivot
			if (arr_1007[j_1007] < pivot_1007) {
				// increment indeks elemen yang lebih kecil
				i_1007++;
				swap_1007(arr_1007, i_1007, j_1007);
			}
		}
		swap_1007(arr_1007, i_1007 + 1, high_1007);
		return (i_1007 + 1);
	}
	static void quickSort_1007(int[] arr_1007, int low_1007, int high_1007) {
		if (low_1007 < high_1007) {
			int pi_1007 = partition_1007(arr_1007, low_1007, high_1007);
			quickSort_1007(arr_1007, low_1007, pi_1007 - 1);
			quickSort_1007(arr_1007, pi_1007 + 1, high_1007);
		}
	}
	
	public static void printArr_1007(int[] arr_1007) {
		for (int i_1007 = 0; i_1007 < arr_1007.length; i_1007++) {
			System.out.print(arr_1007[i_1007] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr_1007 = { 10, 7, 8, 9, 1, 5 };
		int N_1007 = arr_1007.length;
		System.out.print("Data sebelum diurutkan: ");
		printArr_1007(arr_1007);
		
		quickSort_1007(arr_1007, 0, N_1007 - 1);
		
		System.out.print("Data Terurut quicksort: ");
		printArr_1007(arr_1007);

	}

}
