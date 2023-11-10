package P10;
import java.util.Scanner;

public class BioskopWithScanner25 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        Scanner scStr25 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = scStr25.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc25.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc25.nextInt();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n) : ");
            next = scStr25.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        sc25.close();
        scStr25.close();
    }
}
