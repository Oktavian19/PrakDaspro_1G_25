package P11;

import java.util.Scanner;

public class SegitigaSikuTerbalik25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Masukkan N: ");
        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print(" ".repeat(N-i));
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
