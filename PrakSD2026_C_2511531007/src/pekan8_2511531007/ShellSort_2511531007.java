package pekan8_2511531007;

public class ShellSort_2511531007 {
	public static void shelllSort_1007(int[] A_1007) {
		int n_1007 = A_1007.length;
		int gap_1007 = n_1007 / 2;
		while (gap_1007 > 0) {
			for (int i_1007 = gap_1007; i_1007 < n_1007; i_1007++) {
				int temp_1007 = A_1007[i_1007];
				int j_1007 = i_1007;
				while (j_1007 >= gap_1007 && A_1007[j_1007 - gap_1007] > temp_1007) {
					A_1007[j_1007] = A_1007[j_1007 - gap_1007];
					j_1007 = j_1007 - gap_1007;
				}
				A_1007[j_1007] = temp_1007;
			}
			gap_1007 = gap_1007 / 2;
		}
	}

	public static void main(String[] args) {
		int [] data_1007 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("Sebelum: ");
		printArray_1007(data_1007);
		
		shelllSort_1007(data_1007);
		
		System.out.print("Sesudah (Shell Sort): ");
		printArray_1007(data_1007);
	}
	
	public static void printArray_1007(int [] arr_1007) {
		for (int i_1007 : arr_1007)
			System.out.print(i_1007 + " ");
		System.out.println();
	}

}
