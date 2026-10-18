package KELAS1;

import java.util.Scanner;

public class Penilaian1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Nilai: ");
        int nilai = input.nextInt();

        if (nilai < 50) {
            System.out.println("=======HASIL PENIAIAN=======");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
                System.out.println("Nilai: " + nilai);
                System.out.println("Tidak Lulus");
        } else {
            System.out.println("=======HASIL PENILAIAN=======");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
                System.out.println("Nilai: " + nilai);
                System.out.println("Lulus");
        }

        input.close();
    }
}