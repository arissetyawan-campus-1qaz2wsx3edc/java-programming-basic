public class TipeData1 //nama class, salah satu identifier
{// block buka untuk class 
  public static void main(String[] args) //?
  {
    boolean setuju; //deklarasi varibale degn tipe boolean 
    char charku = 66; // ini unicode nya berapa ? //dekalasri variable tipe char dan jg inisialisasi nilai 66, ini expression
    char lain = 'A';
    char lagi = '\u2122';  
    char arabic = '\u075C'; //inisialisasi dengan unicode 
    System.out.println(charku); // disebut apa?
    System.out.println(lain);
    System.out.println(lagi);

    System.out.println(      arabic                    );
    TipeData1 x = new TipeData1();      
    x.cetakRange();
    x.checkOverFlow();
  }

  public TipeData1()//kapan ini dipanggil dimana, apa ini
  {      
    System.out.println("Cetak ranges tipe data"); 
  }

  private void checkOverFlow(){
    byte coba = Byte.MAX_VALUE; //nanti coba + 1 dan compile. liat error yg terjadi
    System.out.println(coba);
  }

  private void cetakRange()//kapan ini dipanggil dimana, apa ini
  {
    System.out.println("Byte: size:" + Byte.SIZE + ", min:"+ Byte.MIN_VALUE + ", max:"+ Byte.MAX_VALUE);
    System.out.println("Integer: size:" + Integer.SIZE + ", min:"+ Integer.MIN_VALUE + ", max:"+ Integer.MAX_VALUE);
  }

}



/*

kumpulkan pertemuan selanjutnya, no delay.
1. commentar tiap baris
2. tulis juga cara compile dan run program ini.

Yang dinilai:
1. tidak ada typo
2. commentar 
3. cara komentar

$javac Halo.java (Salah)


Identifier digunakan untuk penamaan class, package, variable dan fungsi/method



*/




