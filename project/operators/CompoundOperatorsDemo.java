package operators;

public class CompoundOperatorsDemo {

	public CompoundOperatorsDemo() {
		int x = 0, y = 5;
		x += 3;
		System.out.println("x : " + x);
		y *= x;
		System.out.println("y :  " + y);
		/*Similarly other operators can be applied as shortcuts. Other 
		  compound assignment operators include boolean logical 
		 , bitwiseand shift operators*/
	}

	public static void main(String args[]) {
		new CompoundOperatorsDemo();
	}
}
