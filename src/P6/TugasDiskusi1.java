package P6;
import java.util.Scanner;

public class TugasDiskusi1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password;
        int pilih;

        username = input.nextLine();
        password = input.nextLine();
        if (username.equals("guru1") && password.equals("password1")) {
            pilih = input.nextInt();
            if (pilih == 1) {
                System.out.println("function profil_guru()");
            } 
            else if (pilih == 2) {
                System.out.println("function tunjangan()");
            }
            else if (pilih == 3) {
                System.out.println("function gaji_sertif()");
            }
        } 
        else if (username.equals("admin") && password.equals("admin")) {
            pilih = input.nextInt();
            if (pilih == 1) {
                System.out.println("function datal_guru()");
            } 
            else if (pilih == 2) {
                System.out.println("function managedata_guru()");
                
                if (pilih == 1) {
                    System.out.println("function inputdata_guru()");
                } 
                else if (pilih == 2) {
                    System.out.println("function editdata_guru()");
                }
            }
        }
    input.close();
    }
}