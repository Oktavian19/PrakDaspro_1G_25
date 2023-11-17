package P11;

public class KolomNama {
    public static void main(String[] args) {
        char[] karakter = { 'O', 'k', 't', 'a', 'v', 'i', 'a', 'n', 'E', 'k', 'a', 'R', 'a', 'm', 'a', 'd', 'h', 'a', 'n' };
        char[][] nama = new char[8][5];
        int index = 0;

        for (int i = 0; i < nama.length; i++) {
            for (int j = 0; j < nama[i].length; j++, index++) {
                if (index == karakter.length) {
                    index = 0;
                }
                nama[i][j] = karakter[index];
            }
        }

        System.out.println("-".repeat(21));
        for (int i = 0; i < nama.length; i++) {
            System.out.print("|");
            for (int j = 0; j < nama[i].length; j++) {
                System.out.print(" " + nama[i][j] + " ");
                System.out.print("|");
            }
            System.out.println("\n" + "-".repeat(21));
        }
    }
}
