package P7;
import java.util.Scanner;

public class DoWhileCuti_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahcuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahcuti = sc.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari<=jatahcuti) {
                    jatahcuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahcuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    //break;
                }
            }

        } while (jatahcuti > 0);

        sc.close();
    }
}
