package P3;

import java.util.Scanner;
public class Bank25 {
    public static void main(String[] args) {
        
        Scanner input25 = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga =0.02,bunga, jml_tabungan_akhir;

        System.out.println("masukkan jumlah tabungan awal anda");
        jml_tabungan_awal = input25.nextInt();
        System.out.println("masukkan lama menabung anda");
        lama_menabung = input25.nextInt();

        bunga = lama_menabung * prosentase_bunga * jml_tabungan_awal;

        jml_tabungan_akhir = bunga + jml_tabungan_awal;

        System.out.println("Bunga adalah " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);

        input25.close();
    }
}
