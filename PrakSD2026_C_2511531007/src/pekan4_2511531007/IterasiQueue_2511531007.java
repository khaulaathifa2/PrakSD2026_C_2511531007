package pekan4_2511531007;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterasiQueue_2511531007 {

	public static void main(String[] args) {
		Queue<String> q_1007 = new LinkedList<>();
		
		q_1007.add("Praktikum");
		q_1007.add("Struktur");
		q_1007.add("Data");
		q_1007.add("Dan");
		q_1007.add("Algoritma");
		Iterator<String> iterator_1007 = q_1007.iterator(); 
		while (iterator_1007.hasNext()) {
			System.out.print(iterator_1007.next() + " ");
		}
	}

}
