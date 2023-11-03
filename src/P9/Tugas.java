package P9;
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);

        int size, temp=0;
        double rerata, jml=0;

        System.out.print("Masukkan jumlah elemen array: ");
        size = sc25.nextInt();
        int[] bil = new int[size];

        for (int i = 0; i < bil.length; i++) {
            System.out.print("Masukkan nilai untuk elemen ke-"+(i+1)+" : ");
            bil[i] = sc25.nextInt();
        }

        for (int i = 0; i < bil.length; i++) {
            for (int j = 1; j < bil.length; j++) {
                if (bil[j]<bil[j-1]) {
                    temp = bil[j-1];
                    bil[j-1] = bil[j];
                    bil[j] = temp;
                }
            }
        }

        System.out.println("Nilai Tertinggi : "+bil[bil.length-1]);
        System.out.println("Nilai Terendah  : "+bil[0]);

        for (int i = 0; i < bil.length; i++) {
            jml += bil[i];
        }

        rerata = jml/bil.length;

        System.out.println("Rata-Rata       : "+rerata);

        sc25.close();
    }
}
