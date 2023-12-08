public class PenjumlahanRekursif {
    static int Penjumlahan(int n, int f) {
        if (n == f) {
            System.out.print(f + " = ");
            return f;
        } else {
            System.out.print(n + " + ");
            return n + Penjumlahan(n + 1, f);
        }
    }

    public static void main(String[] args) {
        System.out.println(Penjumlahan(1, 8));
    }
}
