package P13;

import java.util.Scanner;

public class Kubus25 {
    static int hitungLuas(int s) {
        return s * s;
    }

    static int hitungVolume(int s) {
        return hitungLuas(s) * s;
    }

    static int hitungLuasPerm(int s) {
        return hitungLuas(s) * 6;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int s = sc.nextInt();

        System.out.println("Volume Kubus adalah " + hitungVolume(s));
        System.out.println("Luas Permukaan Kubus adalah " + hitungLuasPerm(s));

        sc.close();
    }
}
