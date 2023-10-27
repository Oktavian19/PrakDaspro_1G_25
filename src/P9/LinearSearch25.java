package P9;
import java.util.Scanner;

public class LinearSearch25 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        
        int size;
        int key;
        int hasil = 0;

        System.out.print("Masukkan jumlah elemen array: ");
        size = sc25.nextInt();
        int[] arrayInt = new int[size];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            arrayInt[i]=sc25.nextInt();
        }

        System.out.print("Masukkan key yang ingin anda cari : ");
        key = sc25.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);

        sc25.close();
    }
}
