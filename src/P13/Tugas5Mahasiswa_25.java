package P13;

import java.util.Scanner;

public class Tugas5Mahasiswa_25 {
    static Scanner sc = new Scanner(System.in);

    static void inputNilai(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Masukkan nilai mahasiswa ke-%d pada minggu ke-%d: ", i + 1, j + 1);
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilSeluruh(int[][] arr, String[] nama) {
        String[][] arrString = arrayIntToStrings(arr);
        tableLine(arr);
        System.out.print("| Nama ");
        for (int i = 0; i < arrString[0].length; i++) {
            System.out.print("| Minggu ke-" + (i + 1) + " ");
        }
        System.out.println("|");
        tableLine(arr);
        for (int i = 0; i < arrString.length; i++) {
            System.out.printf("| %s |", nama[i]);
            for (int j = 0; j < arrString[i].length; j++) {
                System.out.print(" ".repeat(5) + arrString[i][j] + " ".repeat(8 - arrString[i][j].length()) + "|");
            }
            System.out.println();
        }
        tableLine(arr);
        System.out.println();
    }

    static int[] hariTinggi(int[][] arr) {
        int[] hasil = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int nilai = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > nilai) {
                    nilai = arr[i][j];
                    hasil[i] = j + 1;
                }
            }
        }
        return hasil;
    }

    static int[] nilaiTinggi(int[][] arr) {
        int[] hasil = { 0, 0, 0 }; // Nilai tertinggi, Nama Mhs, Minggu ke-
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > hasil[0]) {
                    hasil[0] = arr[i][j];
                    hasil[1] = i;
                    hasil[2] = j + 1;
                }
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        int[][] dataNilai = new int[5][7];
        String[] namaMhs = { "Sari", "Rina", "Yani", "Dwi ", "Lusi" };

        inputNilai(dataNilai);
        tampilSeluruh(dataNilai, namaMhs);
        int[] nilaiTinggiHari = hariTinggi(dataNilai);
        for (int i = 0; i < dataNilai.length; i++) {
            System.out.printf("Nilai tertinggi %s ada pada hari ke-%d\n", namaMhs[i], nilaiTinggiHari[i]);
        }
        int[] nilaiTinggiSeluruh = nilaiTinggi(dataNilai);
        System.out.printf("\nMahasiswa yang memiliki nilai tertinggi adalah %ssebesar %d pada minggu ke-%d",
                namaMhs[nilaiTinggiSeluruh[1]], nilaiTinggiSeluruh[0], nilaiTinggiSeluruh[2]);
    }

    static String[][] arrayIntToStrings(int[][] num) {
        String[][] hasil = new String[num.length][num[0].length];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                hasil[i][j] = Integer.toString(num[i][j]);
            }
        }
        return hasil;
    }

    static void tableLine(int[][] arr) {
        System.out.printf("+" + "-".repeat(6) + "+");
        for (int i = 0; i < arr[0].length; i++) {
            System.out.print("-".repeat(13) + "+");
        }
        System.out.println();
    }
}
