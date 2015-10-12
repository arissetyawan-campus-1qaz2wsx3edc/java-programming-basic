public class TipeData1
{
   public static void main(String[] args)
   {
      boolean setuju;
      char charku = 66;
      char lain = 'A';
      char lagi = '\u2122';
      char arabic = '\u075C';
      System.out.println(charku);
      System.out.println(lain);
      System.out.println(lagi);
      System.out.println(arabic);

      TipeData1 td1 = new TipeData1();      
      td1.cetakRange();
      td1.checkOverFlow();
   }

   public TipeData1()
   {      System.out.println("Cetak ranges tipe data");

   }

  private void checkOverFlow(){
    byte coba = Byte.MAX_VALUE;
    System.out.println(coba);
  }

   private void cetakRange()
   {
      System.out.println("byte: size:" + Byte.SIZE + ", min:"+ Byte.MIN_VALUE + ", max:"+ Byte.MAX_VALUE);
      //Character
     //Integer
//Float
//Double
//Long
   }

}
