package P3;

import java.util.Scanner;
public class Segitiga25 {
    public static void main(String[] args) {

        Scanner sc25 = new Scanner(System.in);

        int alas, tinggi;
        float luas;

        System.out.println("Masukkan alas: ");
        alas = sc25.nextInt();
        System.out.println("Masukkan tinggi: ");
        tinggi = sc25.nextInt();

        luas = alas * tinggi / 2;

        System.out.println("Luas Segitiga: " +  luas);

        sc25.close();
    }
}
