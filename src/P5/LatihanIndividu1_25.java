package P5;
import java.util.Scanner;

public class LatihanIndividu1_25 {
    public static void main(String[] args) {

        Scanner input25 = new Scanner(System.in);

        int jarak;

        jarak = input25.nextInt();
        if (jarak <= 5) {
            System.out.println("Melee weapon");
        } else {
            System.out.println("Range Weapon");
        }
        input25.close();
    }
}
