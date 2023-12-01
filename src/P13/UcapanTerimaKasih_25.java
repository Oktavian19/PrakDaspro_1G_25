package P13;

import java.util.Scanner;

public class UcapanTerimaKasih_25 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        Scanner sc = new Scanner(System.in);
        String nama = PenerimaUcapan();
        System.out.print("Masukkan ucapan tambahan anda: ");
        String tambah = sc.nextLine();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could just ask you anything.");
        System.out.println(UcapanTambahan(tambah));
    }

    public static String UcapanTambahan(String ucapan) {
        return ucapan;
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
