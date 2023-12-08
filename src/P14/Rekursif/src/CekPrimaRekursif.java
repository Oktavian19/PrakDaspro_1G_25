public class CekPrimaRekursif {

    static boolean CekPrima(int n, int i) {
        if (i == n) {
            return true;
        } else if(n % i != 0) {
            return CekPrima(n, i + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        //n = input(boleh diubah), i = bilangan pembagi(tidak boleh diubah)
        System.out.println("Apakah Prima? " + CekPrima(4, 2));
    }
}
