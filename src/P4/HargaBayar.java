package P4;
import java.util.Scanner;

public class HargaBayar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner stringsc=new Scanner(System.in);

        int harga, jumlah, jmlhalaman;
        double dis=0.1, total, bayar, jmlDis;
        String merek;

        System.out.print("Masukkan Harga barang yang dibeli: ");
        harga=sc.nextInt();

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        jumlah=sc.nextInt();

        System.out.print("Masukkan besar diskon yang anda peroleh: ");
        dis=sc.nextDouble();

        System.out.print("Masukkan nama merek buku: ");
        merek=stringsc.nextLine();

        System.out.print("Masukkan jumlah halaman buku: ");
        jmlhalaman=sc.nextInt();

        total=harga*jumlah;

        jmlDis=total*dis;

        bayar=total-jmlDis;

        System.out.println("Jumlah diskon yang anda peroleh: " + jmlDis);
        System.out.println("Jumlah yang harus dibayar: " + bayar);
        System.out.printf("Merek buku yang anda beli adalah %s dengan jumlah halaman %d",merek,jmlhalaman);


    }
    
}
