package P5;
import java.util.Scanner;

public class PemilihanPercobaan2_25 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float uas = input25.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input25.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input25.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input25.nextFloat();

        float total= (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.print("Nilai akhir = " + total + " dengan Nilai huruf = ");

        if (total<=100 && total>80) {
            System.out.println("A");
        } 

        else if (total<=80 && total>73) {
            System.out.println("B+");
        }

        else if (total<=73 && total>65) {
            System.out.println("B");
        }

        else if (total<=65 && total>60) {
            System.out.println("C+");
        }

        else if (total<=60 && total>50) {
            System.out.println("C");
        }

        else if (total<=50 && total>39) {
            System.out.println("D");
        }

        else if (total<=80 && total>73) {
            System.out.println("E");
        }

        System.out.println("sehingga " + message);
        input25.close();
    }
}
