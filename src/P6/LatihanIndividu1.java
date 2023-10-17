package P6;

public class LatihanIndividu1 {

    public static void main(String[] args) {

        int bil1 = 28, bil2 = 54, bil3 = 15;

        if (bil1 < bil2) {
            if (bil2 < bil3) {
                System.out.println("bilangan terbesar " + bil3);
            } else {
                System.out.println("bilangan terbesar " + bil2);
            }
        }
        else if (bil1 < bil3) {
                System.out.println("bilangan terbesar " + bil3);
        } else {
                System.out.println("bilangan terbesar " + bil1);
            }
    }
}
