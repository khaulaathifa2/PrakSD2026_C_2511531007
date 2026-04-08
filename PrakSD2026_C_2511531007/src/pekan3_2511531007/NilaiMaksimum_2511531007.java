package pekan3_2511531007;

import java.util.Stack;

public class NilaiMaksimum_2511531007 {
	public static int max_1007(Stack<Integer> s_1007) {
		Stack<Integer> backup_1007 = new Stack<Integer>();
		int maxValue_1007 = s_1007.pop();
		backup_1007.push(maxValue_1007);
		while (!s_1007.isEmpty()) {
			int next_1007 = s_1007.pop();
			backup_1007.push(next_1007);
			maxValue_1007 = Math.max(maxValue_1007, next_1007);
		}
		while (!backup_1007.isEmpty()) {
			s_1007.push(backup_1007.pop());
		}
		return maxValue_1007;
	}
	public static void main(String[] args) {
		Stack<Integer> s_1007 = new Stack<Integer>();
		s_1007.push(70);
		s_1007.push(12);
		s_1007.push(20);
		System.out.println("Isi stack " + s_1007);
		System.out.println("Stack teratas " + s_1007.peek());
		System.out.println("Nilai Maksimum " + max_1007(s_1007));
	}

}
