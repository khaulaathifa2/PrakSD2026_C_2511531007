package pekan3_2511531007;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511531007 {

	public static int postfixEvaluate_1007(String expression_1007) {
		Stack<Integer> s_1007 = new Stack<Integer>();
		Scanner input_1007 = new Scanner(expression_1007);
		while (input_1007.hasNext()) {
			if (input_1007.hasNextInt()) { // an operand (integer)
				s_1007.push(input_1007.nextInt());
			} else {
				String operator_1007 = input_1007.next();
				int operand2_1007 = s_1007.pop();
				int operand1_1007 = s_1007.pop();
				if (operator_1007.equals("+")) {
					s_1007.push(operand1_1007 + operand2_1007);
				} else if (operator_1007.equals("-")) {
					s_1007.push(operand1_1007 - operand2_1007);
				} else if (operator_1007.equals("*")) {
					s_1007.push(operand1_1007 * operand2_1007);
				} else {
					s_1007.push(operand1_1007 / operand2_1007);
				}
			}
		}
		input_1007.close();
		return s_1007.pop();
		
	}
	public static void main(String[] args) {
		System.out.println("hasil postfix = "+postfixEvaluate_1007("5 2 4 * + 7 -"));
	}

}
