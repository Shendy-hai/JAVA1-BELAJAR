package KELAS1;

import javax.swing.JOptionPane;

public class Jopt1 {
public static void main(String[] args) {
    
        String nama = JOptionPane.showInputDialog("Nama:");
        String nim = JOptionPane.showInputDialog("NIM:");
        int nilai = Integer.parseInt(
                JOptionPane.showInputDialog("Nilai:"));

        if (nilai < 50) {
            JOptionPane.showMessageDialog(null,
                    "Nama: " + nama +
                            "\nNIM: " + nim +
                            "\nNilai: " + nilai +
                            "\nTidak Lulus");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Nama: " + nama +
                            "\nNIM: " + nim +
                            "\nNilai: " + nilai +
                            "\nLulus");
        }
    }
}