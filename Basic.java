/** Basic.java
 *  Explains:
 *  Statements
 *  Expression
 *  Block
 *  Comments
 *  Whitespaces
 */
public class Basic {   // start of block1
   public static void main(String args[]) { // start of block 2
      String text = "Hello, basic element"; 
     // declare a variable with data type is string, this is also called as an expression (a statement that returning values)
      int size = 10; //this also called as an expression
      System.out.println(text);   // statement
      System.out.print(    size );   // statement, with white spaces
      System.out.println();
      int newSize = size + 1; //expression;
      System.out.printf("new size: %d", newSize);
      System.out.println();
   } //end of block 2
} // end of block 1
