package operators;

public class LogicalOperatorsDemo {

	public LogicalOperatorsDemo() {
		boolean x = true;
		boolean y = false;
		System.out.println("x & y : " + (x & y));
		System.out.println("x && y : " + (x && y));
		System.out.println("x | y : " + (x | y));
		System.out.println("x || y: " + (x || y));
		System.out.println("x ^ y : " + (x ^ y));
		System.out.println("!x : " + (!x));
	}
	public static void main(String args[]) {
		new LogicalOperatorsDemo();
	}
}
