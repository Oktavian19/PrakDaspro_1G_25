package P6;
import java.util.Scanner;

public class Pemilihan2Percobaan1_25 {
    public static void main(String[] args) {

        Scanner input25 = new Scanner(System.in);

        System.out.print("Masukkan Tahun : ");
        int tahun = input25.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun %  100) != 0) {
                System.out.println("Tahun Kabisat");
            }
        } else
            System.out.println("Bukan Tahun Kabisat");

            input25.close();
    }
    
}