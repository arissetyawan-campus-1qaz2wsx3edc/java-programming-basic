/* Utama.java
* belajar access modifier pada method dan class
* belajar OOP 
* belajar constanta
*/

public class Utama
{
   public static void main(String[] parameter)
   {
      SukarnoWijoyo sr = new SukarnoWijoyo();
      //System.out.println(sr.nim);
      sr.printNim();
      System.out.println(sr.ADDRESS);   
      System.out.println(SukarnoWijoyo.ADDRESS1); 
      System.out.println(SukarnoWijoyo.ADDRESS);      
   }
}

class SukarnoWijoyo
{

   public String nim = "11100000101";
   public final String ADDRESS = "Jl. Raya Surabaya KM 33";
   public final static String ADDRESS1 = "Jl. Raya Surabaya KM 34";

   SukarnoWijoyo() //constructor
   {
      System.out.println("Saya sedang dibuat turunannya");
   }
   
   protected void printNim(){ System.out.println(nim); }
}
