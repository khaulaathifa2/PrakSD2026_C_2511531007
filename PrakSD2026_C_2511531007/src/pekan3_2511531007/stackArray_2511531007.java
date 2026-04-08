package pekan3_2511531007;

public class stackArray_2511531007 {
	static final int MAX_1007 = 1000;
	int top_1007;
	int a_1007 [] = new int [MAX_1007];
	boolean isEmpty_1007()
	{
		return (top_1007< 0);
	}
	stackArray_2511531007()
	{
		top_1007 = -1;
	}
	boolean push_1007(int x_1007)
	{
		if (top_1007 >= (MAX_1007 - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a_1007 [++top_1007] = x_1007;
			System.out.println(x_1007 + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_1007()
	{
		if (top_1007 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x_1007 = a_1007[top_1007--];
			return x_1007;
		}
	}
	int peek_1007()
	{
		if (top_1007 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x_1007 = a_1007[top_1007];
			return x_1007;
		}
	}
	void print_1007() {
		for (int i_1007 = top_1007; i_1007 > -1; i_1007--) {
		System.out.print(" " + a_1007[i_1007]);
		}
	}
}
