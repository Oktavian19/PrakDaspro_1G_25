package P9;

import java.util.Scanner;

public class ArrayRataNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        double lulus=0, tdklulus=0, jmllulus=0, jmltdklulus=0;
        double rata2lulus, rata2tdklulus;

        System.out.print("Masukkan jumlah mahasiswa : ");
        size = sc.nextInt();
        int[] nilaiMhs = new int[size];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                jmllulus += nilaiMhs[i];
                lulus++;
            }
            else if (nilaiMhs[i] < 70) {
                jmltdklulus += nilaiMhs[i];
                tdklulus++;
            }
        }

        rata2lulus = jmllulus/lulus;
        rata2tdklulus = jmltdklulus/tdklulus;

        System.out.println("Rata-rata nilai lulus = "+rata2lulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rata2tdklulus);

        sc.close();

    }
}
