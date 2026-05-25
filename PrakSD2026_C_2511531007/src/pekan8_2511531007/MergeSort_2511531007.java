package pekan8_2511531007;

public class MergeSort_2511531007 {
    void merge(int arr[], int l_1007, int m_1007, int r_1007) {
        // Find sizes of two subarrays to be merged
        int n1_1007 = m_1007 - l_1007 + 1;
        int n2_1007 = r_1007 - m_1007;
        /* Create temp arrays */
        int L_1007[] = new int[n1_1007];
        int R_1007[] = new int[n2_1007];
        /* Copy data to temp arrays */
        for (int i_1007 = 0; i_1007 < n1_1007; ++i_1007)
            L_1007[i_1007] = arr[l_1007 + i_1007];
        for (int j_1007 = 0; j_1007 < n2_1007; ++j_1007)
            R_1007[j_1007] = arr[m_1007 + 1 + j_1007];
        int i_1007 = 0, j_1007 = 0;
        // Initial index of merged subarray array
        int k_1007 = l_1007;
        while (i_1007 < n1_1007 && j_1007 < n2_1007) {
            if (L_1007[i_1007] <= R_1007[j_1007]) {
                arr[k_1007] = L_1007[i_1007];
                i_1007++;
            } else {
                arr[k_1007] = R_1007[j_1007];
                j_1007++;
            }
            k_1007++;
        }
        /* Copy remaining elements of L[] if any */
        while (i_1007 < n1_1007) {
            arr[k_1007] = L_1007[i_1007];
            i_1007++;
            k_1007++;
        }
        /* Copy remaining elements of R[] if any */
        while (j_1007 < n2_1007) {
            arr[k_1007] = R_1007[j_1007];
            j_1007++;
            k_1007++;
        }
    }
    void sort(int arr_1007[], int l_1007, int r_1007) {
        if (l_1007 < r_1007) {
            // Find the middle point
            int m_1007 = (l_1007 + r_1007) / 2;
            // Sort first and second halves
            sort(arr_1007, l_1007, m_1007);
            sort(arr_1007, m_1007 + 1, r_1007);
            // Merge the sorted halves
            merge(arr_1007, l_1007, m_1007, r_1007);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr_1007[]) {
        int n_1007 = arr_1007.length;
        for (int i_1007 = 0; i_1007 < n_1007; ++i_1007)
            System.out.print(arr_1007[i_1007] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr_1007[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Sebelum terurut");
        printArray(arr_1007);
        MergeSort_2511531007 ob_1007 = new MergeSort_2511531007();
        ob_1007.sort(arr_1007, 0, arr_1007.length - 1);
        System.out.println("\nSesudah Terurut menggunakan merge Sort");
        printArray(arr_1007);
    }
}