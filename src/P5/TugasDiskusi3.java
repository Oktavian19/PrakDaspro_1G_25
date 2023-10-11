package P5;
import java.util.Scanner;

public class TugasDiskusi3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jmltunjangan, jarak;
        int tunjanganjabatan;
        String keluarga;


        jmltunjangan = 0;
        System.out.println("Apakah ada telah berkeluarga? Y/N");
        keluarga = input.nextLine();
        System.out.println("Berapa km jarak rumah dengan kantor anda? ");
        jarak = input.nextInt();
        System.out.print("Apa Jabatan anda saat ini? 1.  Guru Mapel. 2. Wali Kelas. 3. Pengawas Sekolah");
        tunjanganjabatan = input.nextInt();

        if (keluarga.equals("Y")) {
            jmltunjangan = jmltunjangan + 200000;
        }
        if (jarak < 8) {
            jmltunjangan = jmltunjangan + 100000;
        } 
        else if (jarak > 8 && jarak < 15) {
            jmltunjangan = jmltunjangan + 150000;
        } 
        else if (jarak > 15) {
            jmltunjangan = jmltunjangan + 200000;
        }
            
        
        if (tunjanganjabatan == 1) {
            jmltunjangan = jmltunjangan + 150000;
        } 
        else if (tunjanganjabatan == 2) {
            jmltunjangan = jmltunjangan + 250000;
        }
        else if (tunjanganjabatan == 3) {
            jmltunjangan = jmltunjangan + 500000;
        }
            
        System.out.println(jmltunjangan);

    input.close();
    }
}