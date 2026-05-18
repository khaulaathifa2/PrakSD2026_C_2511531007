package pekan7_2511531007;

public class SelectionSort_2511531007 {
	public static void selectionSort_1007(int[] arr_1007) {
		int n_1007 = arr_1007.length;
		for (int i_1007 = 0; i_1007 < n_1007; i_1007++) {
			int minIndex_1007 = i_1007;
			for (int j_1007 = i_1007 + 1; j_1007 < n_1007; j_1007++) {
				if (arr_1007[j_1007] < arr_1007[minIndex_1007]) {
					minIndex_1007 = j_1007;
				}
			}
			int temp_1007 = arr_1007[i_1007];
			arr_1007[i_1007] = arr_1007[minIndex_1007];
			arr_1007[minIndex_1007] = temp_1007;
		}
	}

	public static void main(String[] args) {
		int arr_1007[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_1007 = arr_1007.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_1007 = 0; i_1007 < n_1007; i_1007++)
			System.out.print(arr_1007[i_1007] + " ");
		System.out.println("");
		selectionSort_1007(arr_1007);
		System.out.printf("array yang terurut:\n");
		for (int i_1007 = 0; i_1007 < n_1007; i_1007++)
			System.out.print(arr_1007[i_1007] + " ");
		System.out.println("");
	}

}
