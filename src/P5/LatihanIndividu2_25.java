package P5;
import java.util.Scanner;

public class LatihanIndividu2_25 {
    public static void main(String[] args) {

    Scanner input25 = new Scanner(System.in);

        String username;
        String password;
        username = input25.nextLine();
        password = input25.nextLine();
        if (username == "admin" && password == "admin") {
            System.out.println("Selamat anda masuk ke system");
        } else {
            System.out.println("user dan password salah");
        }
    input25.close();    
    }
}