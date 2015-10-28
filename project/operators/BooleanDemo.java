/*  
* This is to demo with boolean, constructor, access modifers, 
* fixed number operators, expression, statements, etc
* arissetyawan.email@gmail.com
*/

package operators;

public class BooleanDemo
{
  private boolean x;
  private boolean y;

  protected void setValues(boolean inputX, boolean inputY){
    this.x = inputX;
    this.y = inputY;
  }

  public BooleanDemo(){
     System.out.println();
     System.out.println("-------------------------------------------------");
     System.out.println(" BooleanDemo is constructed !");
     System.out.println("-------------------------------------------------");
     System.out.println();
  }

  private void printRow()
  {

     boolean col1 =  this.x;
     boolean col2 =  this.y;
     boolean col3 =  !this.x;
     boolean col4 =  this.x & this.y;
     boolean col5 =  this.x | this.y;
     boolean col6 =  this.x ^ this.y;

     System.out.println("| "+ spaces(col1) + " | "+  spaces(col2) + " | "+  spaces(col3) + " | " +
                              spaces(col4) + " | "+  spaces(col5) + " | "+  spaces(col6) + " |");
     System.out.println("-------------------------------------------------");
  }
  
  private String spaces(boolean value){
    if(value){
      return value + " ";
    }
    else{
      return ""+value;
    }
  }

  private void printHeaderColumn(){
     System.out.println("-------------------------------------------------");
     System.out.println("|   x   |  y    |   !x  | x & y | x | y | x ^ y |");
     System.out.println("|       |       |       | x && y| x || y|       |");
     System.out.println("-------------------------------------------------");
  }
  
  protected void printTable(){
    this.printHeaderColumn();
    this.printRow();
  }

  protected void fullTable(){
    this.printHeaderColumn();
    this.x = true;
    this.y = true;
    this.printRow();

    this.x = true;
    this.y = false;
    this.printRow();

    this.x = false;
    this.y = true;
    this.printRow();

    this.x = false;
    this.y = false;
    this.printRow();
  }

  public static void main(String[] argv)
  {
    BooleanDemo bd = new BooleanDemo();
    bd.setValues(true, true);
    bd.printTable();

    BooleanDemo bd1 = new BooleanDemo();
    bd.setValues(true, false);
    bd1.printTable();


    BooleanDemo bd2 = new BooleanDemo();
    bd1.fullTable();
  }
}
