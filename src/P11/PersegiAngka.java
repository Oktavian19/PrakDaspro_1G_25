package P11;

import java.util.Scanner;

public class PersegiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Masukkan nila N: ");
        N=sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) { 
                if (i == 0 || i == N-1) {
                    System.out.print(N + " ");          
                } 
            }
            if (!(i == 0 || i == N-1)) {
                System.out.print(N + " " + "  ".repeat(N-2) + N);
            }
            System.out.println();
        }

        sc.close();
    }
}
