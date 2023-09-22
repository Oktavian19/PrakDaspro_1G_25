package P4;
import java.util.Scanner;

public class HargaBayar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int harga, jumlah;
        double dis=0.1, total, bayar, jmlDis;

        System.out.println("Masukkan Harga barang yang dibeli: ");
        harga=sc.nextInt();

        System.out.println("Masukkan jumlah barang yang dibeli: ");
        jumlah=sc.nextInt();

        total=harga*jumlah;

        jmlDis=total*dis;

        bayar=total-jmlDis;

        System.out.println("Jumlah diskon yang anda peroleh: " + jmlDis);
        System.out.println("Jumlah yang harus dibayar: " + bayar);


    }
    
}
