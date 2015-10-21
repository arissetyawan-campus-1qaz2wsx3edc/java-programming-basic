public class TipeData2
{
  public static void main(String[] params)
  {
    TipeData2 td2 = new TipeData2(); // membuat object baru
    int a = 10;
    int b = 100;
    double c = 10.5;
    float d = 10.5f;
    boolean e = true;
    boolean f = false;
    double g = 10.0;
    td2.playBoolean(a==10);
    td2.playBoolean(a==g);
    td2.playBoolean(a==b/a);
    td2.playBoolean(c==d);
    td2.playBoolean(e==f);

    td2.playBoolean(a > 10);
    td2.playBoolean(b > a);
    td2.playBoolean(a >= 10 && b > a);
    
    td2.playBoolean(e);
    td2.playBoolean(f);
    
    td2.playSum(a, b);
    td2.playMultiply(a, a);
  }

  public TipeData2(){
    System.out.println("I'm the constructor but i have nothing to initialized...");  
  }

  private boolean playBoolean(boolean condition){
    if(condition){
      printResult("memenuhi");
    }
    else{
      printResult("tidak memenuhi");
    }
    return condition;
  }

  private void playSum(int a, int b){
     printResult(String.valueOf(a+b));
  }

  private void playMultiply(int a, int b){
     printResult(String.valueOf(a*b));
  }

  private void printResult(String result){
     System.out.println("Result: "+ result);
  }

}
