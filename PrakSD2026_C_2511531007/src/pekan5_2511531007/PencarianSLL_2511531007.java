package pekan5_2511531007;

public class PencarianSLL_2511531007 {
	static boolean searchKey_1007(NodeSLL_2511531007 head_1007, int key_1007) {
		NodeSLL_2511531007 curr_1007 = head_1007;
		while (curr_1007 != null) {
			if (curr_1007.data_1007 == key_1007)
				return true;
			curr_1007 = curr_1007.next_1007;
		}
		return false;
	}
	
	public static void traversal_1007(NodeSLL_2511531007 head_1007) {
		// mulai dari head
		NodeSLL_2511531007 curr_1007 = head_1007;
		while (curr_1007 != null) {
			System.out.print(" " + curr_1007.data_1007);
			curr_1007 = curr_1007.next_1007;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		NodeSLL_2511531007 head_1007 = new NodeSLL_2511531007(14);
		head_1007.next_1007 = new NodeSLL_2511531007(21);
		head_1007.next_1007.next_1007 = new NodeSLL_2511531007(13);
		head_1007.next_1007.next_1007.next_1007 = new NodeSLL_2511531007(30);
		head_1007.next_1007.next_1007.next_1007.next_1007 = new NodeSLL_2511531007(10);
		System.out.print("Penelusuran SLL : ");
		traversal_1007(head_1007);
		// data yang akan dicari
		int key_1007 = 30;
		System.out.print("cari data " +key_1007+ " = ");
		if (searchKey_1007(head_1007, key_1007))
			System.out.println("ketemu");
		else 
			System.out.println("tidak ada");
	} 

}
