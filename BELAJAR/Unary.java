package BELAJAR;

public class Unary {
    
    public static void main(String[] args) {
        
        // UNARY = Operasi yg dilakukan pada satu variabel
        
        // UNARY + dan -
        int angka1 = 1;
        System.out.printf("unary '+' %d menjadi %d\n",angka1,+angka1); // klo bilangan positif tidak bisa ada plus nya
         System.out.printf("unary '-' %d menjadi %d\n",angka1,-angka1); // klo bilangan negatif akan menjadi mines '-'

         // UNARY Decrement & Increment
        //increment
         int angka2 = 5;
         ++angka2; // karena ditambah '++' maka nilai seperti '5+1'
         System.out.println("nilai dengan '++' menjadi = " + angka2);

         // decrement
         int angka3 = 5;
         --angka3; // karena ditambah '--' ,aka nilai seperti '5-1'
         System.out.println("nilai dengan '--' menjadi = " + angka3);
        
         int a = 10;
         System.out.printf("nilai dengan '++' prefix %d\n",++a); //prefix = ada tanda '++' didepan var. a 
         
         int b = 10;
         System.out.printf("nilai dengan '++' postfix %d\n",b++); 
         System.out.printf("nilai dengan '++' postfix %d\n",b);   
            /*  karena ada tanda '++' di belakang var. b, maka hasilnya akan sama, 
            tetapi hasil kedua akan bertambah nilanya, karena pengoperasian output yg kedua seperti
             "++a*/
            //dan ini juga bisa dilakukan dengan operasi '--'
            

        // unary BOOLEAN dengan ! untuk negasi
        boolean kipli = true;
        System.out.println("nilai boolean = " + kipli);
        System.out.println("nilai boolean = " + !kipli);
        //karena ada tanda '!' yg mengubah nilai boolean yg awalnya true menjadi false
    }
 }
