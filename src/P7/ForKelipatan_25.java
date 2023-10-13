package P7;
import java.util.Scanner;

public class ForKelipatan_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah=0, counter=0;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        float ratarata = (float)jumlah/counter;
        System.out.printf("Rata-rata jumlah bilangan kelipatan %d dari 1 sampai 50 adalah %.1f\n", kelipatan, ratarata);
    }
}
