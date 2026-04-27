package pekan4_2511531007;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511531007 {

	public static void main(String[] args) {
		Queue<Integer> q_1007 = new LinkedList<Integer>();
		q_1007.add(1);
		q_1007.add(2);
		q_1007.add(3); // [1, 2, 3]
		System.out.println("sebelum reverse = " + q_1007);
		Stack<Integer> s_1007 = new Stack<Integer>();
		while (!q_1007.isEmpty()) { // Q -> S
			s_1007.push(q_1007.remove());
		}
		while (!s_1007.isEmpty()) { // S -> Q
			q_1007.add(s_1007.pop());
		}
		System.out.println("sesudah reverse = " + q_1007); // [3, 2, 1]
	}

}
