package BELAJAR;

public class Tipe_Data {
    public static void main(String[] args) {
        /*Tipe data di java:
        integer, byte, short, long, double, float, char, boolean */

        // integer (satuan)
      int i;
      i = 100;
    System.out.println("=========INTEGER=========");
    System.out.println("nilai integer i = " + (i + i));
    System.out.println("nilai integer MAX = " + Integer.MAX_VALUE);
    System.out.println("nilai integer MIN = " + Integer.MIN_VALUE);
    System.out.println("besar integer = " + Integer.BYTES + "bytes");
    System.out.println("besar integer = " + Integer.SIZE + "bit");  
 
        // byte (satuan)
      byte b = 10;
    System.out.println("=======BYTE========");
    System.out.println("nilai byte b = " + b);
    System.out.println("nilai MAX = " + Byte.MAX_VALUE);
    System.out.println("nilai MIN = " + Byte.MIN_VALUE);
    System.out.println("besar byte = " + Byte.BYTES + "bytes");
    System.out.println("besar byte = " + Byte.SIZE + "bit");
 
        // short (satuan)
      short s = 10;
    System.out.println("=======SHORT========");
    System.out.println("nilai short s = " + s);
    System.out.println("nilai MAX = " + Short.MAX_VALUE);
    System.out.println("nilai MIN = " + Short.MIN_VALUE);
    System.out.println("besar short = " + Short.BYTES + "bytes");
    System.out.println("besar short = " + Short.SIZE + "bit");

        // long (satuan)
      long l = 10L;
    System.out.println("========LONG========");
    System.out.println("nilai long l = " + l);
    System.out.println("nilai MAX = " + Long.MAX_VALUE);
    System.out.println("nilai MIN = " + Long.MIN_VALUE);
    System.out.println("besar long= " + Long.BYTES + "bytes");
    System.out.println("besar long= " + Long.SIZE + "bit");
                
        // double (Koma,Bilangan real)
      Double d = 10.5D;
    System.out.println("========DOUBLE========");
    System.out.println("nilai double d = " + d);
    System.out.println("nilai MAX = " + Double.MAX_VALUE);
    System.out.println("nilai MIN = " + Double.MIN_VALUE);
    System.out.println("besar double= " + Double.BYTES + "bytes");
    System.out.println("besar double= " + Double.SIZE + "bit");

    // float (Koma,Bilangan real)
     Float f = 7.5F;
    System.out.println("========FLOAT========");
    System.out.println("nilai float f = " + f);
    System.out.println("nilai MAX = " + Float.MAX_VALUE);
    System.out.println("nilai MIN = " + Float.MIN_VALUE);
    System.out.println("besar float = " + Float.BYTES + "bytes");
    System.out.println("besar float = " + Float.SIZE + "bit");

    // char (karakter) Berdasarkan ASCII
     char c = 'S';
    System.out.println("========CHAR========");
    System.out.println("nilai char S = " + c);
    System.out.println("nilai MAX = " + Character.MAX_VALUE);
    System.out.println("nilai MIN = " + Character.MIN_VALUE);
    System.out.println("besar char = " + Character.BYTES + "bytes");
    System.out.println("besar char = " + Character.SIZE + "bit");
    
    // boolean (nilai true atau false)
     Boolean hai = true;
    System.out.println("========BOOLEAN========");
    System.out.println("nilai boolean b = " + hai);
    System.out.println("nilai MAX = " + Boolean.TRUE);
    System.out.println("nilai MIN = " + Boolean.FALSE);
  
                                    /* dan jangan lupa macam2 format:
                                    Format	    Tipe data	                        Contoh:
                                    %d	    Bilangan bulat (int)	                10
                                    %f	    Bilangan desimal (float atau double)	3.14
                                    %s	    Teks (String)	                        "Budi"
                                    %c	    Satu karakter (char)	                'A'
                                    %b	    Boolean (true atau false)	            true & false */
    }
}
