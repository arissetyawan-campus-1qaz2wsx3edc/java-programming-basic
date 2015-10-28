/*
* BitwiseOperatorsDemo.java
* Java provides Bit wise operators to manipulate the contents of variables at the bit level.
* These variables must be of numeric data type ( char, short, int, or long). Java provides seven bit
* wise operators. They are AND, OR, Exclusive-OR, Complement, Left-shift, Signed Right-shift, and Un* signed Right-shift
*/

package operators;

public class BitwiseOperatorsDemo { 
  public BitwiseOperatorsDemo() { 
    int x = 0xFAEF; //1 1 1 1 1 0 1 0 1 1 1 0 1 1 1 1 
    int y = 0xF8E9; //1 1 1 1 1 0 0 0 1 1 1 0 1 0 0 1 
    int z; System.out.println("x & y : " + (x & y)); 
    System.out.println("x | y : " + (x | y)); 
    System.out.println("x ^ y : " + (x ^ y)); 
    System.out.println("~x : " + (~x)); 
    System.out.println("x <<  y : " + (x <<  y)); 
    System.out.println("x >> y : " + (x >> y));
    System.out.println("x >>> y : " + (x >>> y)); 
    //There is no unsigned left shift operator
    }

  public static void main(String args[]){
     new BitwiseOperatorsDemo(); 
  }

}
