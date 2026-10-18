package BELAJAR;

public class Konversi {
    public static void main(String[] args) {
        // KONVERSI TIPE DATA (Hanya untuk Bilangan aja)

        //TD interger
       int nilaiInt = 450; // 32-bit
       System.out.println("nilai int = " + nilaiInt);
        
        // TD long (meperluas rentang ke TD yg lebih besar)
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);

        /* ini berjalan dengan baik karena bit dalam TD long masih banyak = 64bit
           sedangkan TD Int = 32bit */


        // TD byte (memperkecil rentang ke TD yg lebih kecil)
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);
        //cek nilai MAX dari byte
        System.out.println("nilai max byte = "  + Byte.MAX_VALUE); // nilai MAX 127 
        System.out.println("nilai min byte = " + Byte.MIN_VALUE); // niali MIN -128

        /*disini program bisa di konversi, tapi ga berjalan dengan baik atau muter2 
          sehingga tidak akurat. (byte) = dicasting/konversi*/

        // CASTING PEMBAGIAN
        int a = 10;
        float b = 4;

        float c = a/b;
        System.out.printf("%d / %f = %f \n",a,b,c); 
                                    /* dan jangan lupa macam format:
                                    Format	    Tipe data	                        Contoh:
                                    %d	    Bilangan bulat (int)	                10
                                    %f	    Bilangan desimal (float atau double)	3.14
                                    %s	    Teks (String)	                        "Budi"
                                    %c	    Satu karakter (char)	                'A'
                                    %b	    Boolean (true atau false)	            true & false */

        /* ini berhasil di casting ke FLOAT yha,
         yg asalnya INT tidak bisa mengerjakan desimal di ganti ke FLOAT jadi bisa desimal */

         int x = 10;
         int y = 4;
         float z = (float) x/y;

         System.out.printf("%d / %d = %f",x,y,z);
         
         /* dan di caster dengan cara seperti ini juga bisa, cuma menambahi di dalam kurung itu,
         agar menunjukkan float */




    }
}
