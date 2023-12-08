public class DeretDescendingRekursif {
    static int tampilBilanganRekursif(int n) {
        if (n == 0) {
            System.out.print("0");
            return 0;
        } else {
            System.out.print(n + " ");
            return tampilBilanganRekursif(n - 1);
        }
    }

    static void tampilBilanganIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        tampilBilanganRekursif(5);
        System.out.println();
        tampilBilanganIteratif(5);
    }
}
