package P6;
import java.util.Scanner;

public class LatihanIndividu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jenis;
        int jumlah;
        int diskon;

        diskon = 0;
        jenis = input.nextLine();
        jumlah = input.nextInt();
        if (jenis.equals("kamus") && jumlah > 2) {
            diskon = diskon + 12;
        } 
        else if (jenis.equals("kamus")) {
                diskon = diskon + 10;
        }
        if (jenis.equals("novel") && jumlah > 3) {
                diskon = diskon + 9;
        }
        else if (jenis.equals("novel") && jumlah <= 3) {
                    diskon = diskon + 8;
        } 
        else if (jumlah > 3) {
                        diskon = diskon + 5;
        }

        System.out.println("jumlah diskon = " + diskon + "%");

        input.close();
    }
}

