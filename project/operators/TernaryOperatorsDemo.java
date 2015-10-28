package operators;

public class TernaryOperatorsDemo {

	public TernaryOperatorsDemo() {
		int x = 10, y = 12, z = 0;
		z = x > y ? x : y;
		System.out.println("z : " + z);
	}
	public static void main(String args[]) {
		new TernaryOperatorsDemo();
	}
}
