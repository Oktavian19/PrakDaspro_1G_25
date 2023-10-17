package P6;
import java.util.Scanner;

public class TugasDiskusi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilih;

        System.out.println("Pilih menu yang ingin diakses :1. Manage Teachers Data. 2. Show Teachers Data and Salary. 3. Change Allowance Data");
        pilih = input.nextInt();
        if (pilih == 1) {
            System.out.println("1. Input Teachers Data. 2. Edit Teachers Data. 3. Remove Teachers Data");
            pilih = input.nextInt();
            if (pilih == 1) {
                System.out.println("function inputteachers_data()");
            }
            if (pilih == 2) {
                System.out.println("function editteachers_data()");
            }
            if (pilih == 3) {
                System.out.println("function removeteachers_data()");
            }
        }
        if (pilih == 2) {
            System.out.println("1. Show Teachers Profile Data. 2. Show Teachers Salary Data");
            pilih = input.nextInt();
            if (pilih == 1) {
                System.out.println("function allteachers_data()");
            } else {
                System.out.println("function allsalary_data()");
            }
        }
        if (pilih == 3) {
            System.out.println("function edit_allowance()");
        }
    input.close();
    }
}
