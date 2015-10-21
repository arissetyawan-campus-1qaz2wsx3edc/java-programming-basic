public class Literal
{
   public static void main(String[] argv)
   {
      MyInteger mi = new MyInteger();
      mi.print();
      MyFloatingPoint mf = new MyFloatingPoint();
      mf.print();
      MyCharacter mc = new MyCharacter();
      mc.print();
   }

}

class MyInteger
{

  private int speed = 300;
  private int wind = 0xC; //12
  private int power = 014; //12

  public void print()
  {
    System.out.println(speed + " kph");
    System.out.println(wind + " knot");
    System.out.println(power + " HP");
  }
  MyInteger()
  {
    System.out.println("Called: MyInteger"); 
  }
}


class MyFloatingPoint
{

  private double speed = 300.131;
  private float wind = 12.345F; 
  private double power = 0.12345e2; 

  MyFloatingPoint()
  {
    System.out.println("Called: MyFloatingPoint"); 
  }
  
  public void print()
  {
    System.out.println(speed + " kph");
    System.out.println(wind + " knot");
    System.out.println(power + " HP");
  }
}

class MyCharacter
{

  private char speed = 'A';
  private char wind = 65; 
  private char power = '\u0293';

  MyCharacter()
  {
    System.out.println("Called: MyCharacter"); 
  }

  public void print()
  {
    System.out.println(speed + " kph");
    System.out.println(wind + " knot");
    System.out.println(power + " HP");
  }
}
