package BELAJAR;

public class Aritmatika {
    public static void main(String[] args) {
        
        // Operasi Aritmatika (Penjumlahan,Pengurangan,perkalian,Pembagian,Modulus)

        int var1 = 100;
        int var2 = 5;

        int hasil;

        // 1.PENJUMLAHAN "+"
        hasil = var1 + var2;
        System.out.println(hasil);

        // 2.PENGURANGAN "-"
        hasil = var1 - var2;
        System.out.println(var1 + " - " + var2 + " = " + hasil );

        // 3.PERKALIAN "*"
        hasil = var1 * var2;
        System.out.printf("%d * %d = %d \n",var1,var2,hasil);

        // 4.PEMBAGIAN "/"
        int variabel3 = 100;
        int variabel4 = 5;
          
        int total; 

        total = variabel3 / variabel4;
        System.out.printf("%d / %d = %d \n",variabel3,variabel4,total);

        float a = 7;
        float b = 4;
        float hasilfloat = a/b;

        System.out.println(a + " / " + b + " = " + hasilfloat );


        /* 5.MODULUS "%" (“Modulus adalah operator untuk mencari sisa dari hasil pembagian dua bilangan.”
                            Contohnya:
                                        - (10 % 3 = 1), karena 10 dibagi 3 bersisa 1.
                                        - (8 % 2 = 0), karena 8 dibagi 2 tidak bersisa.)*/ 

        total = variabel3 % variabel4;
        System.out.printf("%d %% %d = %d \n",variabel3,variabel4,total);

    }
}
