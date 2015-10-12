public class TipeData
{
   public static void main(String[] argv)
   {
       float nilai = 80;
       int jumlahSiswa = 30;
       boolean hadir = true;
       if(hadir)
       { 
          System.out.println("Nilainya:"+ nilai);
          System.out.println("Rata-rata: "+ (nilai/30));
       }

      if(jumlahSiswa==30)
      {
         System.out.println("Lengkap");
      }

      if(!hadir){
        System.out.println("Tidak dapat nilai");
      }
   }
}
