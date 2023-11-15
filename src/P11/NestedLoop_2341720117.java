package P11;
import java.util.Scanner;

public class NestedLoop_2341720117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double[][] temps = new Double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        int i = 0;
        for (Double kota[] : temps) {
            System.out.println("Kota ke-" + (i + 1) + ": ");
            for (Double suhu : kota) {
                System.out.print(suhu + " ");
            }
            System.out.println();
            i++;
        }

        sc.close();
    }
}
