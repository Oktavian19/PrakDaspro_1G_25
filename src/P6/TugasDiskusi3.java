package P6;
import java.util.Scanner;

public class TugasDiskusi3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmltunjangan=0, pil, jmlanak;

        System.out.println("Apakah anda sudah menikah? 1. Sudah. 2.Belum");
        pil = input.nextInt();
        if (pil == 1) {
            jmltunjangan = jmltunjangan + 200000;
            System.out.println("Berapa anak yang anda miliki? ");
            jmlanak = input.nextInt();
            if (jmlanak > 3) {
                jmltunjangan = jmltunjangan + 100000;
            } else {
                jmltunjangan = jmltunjangan + jmlanak * 40000;
            }
        }
        System.out.println("Dimana jabatan anda saat ini? 1. Guru Mapel. 2. WaliKelas. 3. Pengawas Sekolah");
        pil = input.nextInt();
        if (pil == 1) {
            jmltunjangan = jmltunjangan + 150000;
        } 
        else if (pil == 2) {
                jmltunjangan = jmltunjangan + 250000;
        } 
        else if (pil == 3) {
                    jmltunjangan = jmltunjangan + 500000;
        }
        System.out.println(jmltunjangan);

        input.close();
    }
}

