package P4;
import java.util.Scanner;

public class Gaji25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji, potGaji;

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda: ");
        jmlMasuk=sc.nextInt();

        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda: ");
        JmlTdkMasuk=sc.nextInt();

        System.out.println("Masukkkan Besaran Gaji Anda: ");
        gaji=sc.nextInt();

        System.out.println("Masukkan Potongan Gaji Anda: ");
        potGaji=sc.nextInt();

        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);

        System.out.println("Gaji yang Anda Terima Sebesar: " + TotGaji);

        sc.close();
    }
}
