/*
 * The below program demonstrates bitwise operators keeping in mind operator precedence
 * Operator Precedence starting with the highest is: |, ^, &
 */

package operators;

public class BitwisePrecedenceEx {

	public static void main(String[] args) {
		int a = 1 | 2 ^ 3 & 5;
		int b = ((1 | 2) ^ 3) & 5;
		int c = 1 | (2 ^ (3 & 5));
		System.out.println(a + "," + b + "," + c);
	}
}
