package P10;
import java.util.Scanner;

public class BioskopWithScanner25 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        Scanner scStr25 = new Scanner(System.in);

        int baris, kolom, pilih;
        String nama, next;
        boolean quit = false;

        String[][] penonton = new String[4][2];

        while (true) {
           System.out.println("1. Input data penonton");
           System.out.println("2. Tampilkan daftar penonton");
           System.out.println("3. Exit");

           System.out.print("Pilih menu :"); 
           pilih = sc25.nextInt();
           switch (pilih) {
            case 1:
                while (true) {
                    boolean skip = false;

                    System.out.print("Masukkan nama: ");
                    nama = scStr25.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc25.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc25.nextInt();

                    for (int i = 0; i < penonton.length; i++) {
                        if(baris > penonton.length || kolom > penonton[i].length){
                            System.out.println("\nBaris/Kolom anda tidak tersedia!\n");
                            skip = true;
                            break;
                        }
                    }
                    if(skip) continue;

                    if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Kursi yang anda pilih telah terisi!\n");
                        skip = true;
                    }

                    if(skip) continue;

                    penonton[baris-1][kolom-1] = nama;

                    System.out.print("Input penonton lainnya? (y/n) : ");
                    next = scStr25.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                    System.out.println();
                }//menu 1
                break;

            case 2:
                while (true) {
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.printf("%s\t", penonton[i][j]);
                        }
                        System.out.println();
                    }
                    next = scStr25.nextLine();
                    break;
                }
                break;
            
            case 3:
                quit = true;
                break;
           
            default:
                System.out.println("Menu yang anda masukkan salah!");
                break;
            }//switch menu
            if(quit) break;
        }//menu awal
        sc25.close();
        scStr25.close();
    }//main
}
