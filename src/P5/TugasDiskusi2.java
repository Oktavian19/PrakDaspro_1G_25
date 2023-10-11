package P5;
import java.util.Scanner;

class TugasDiskusi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sertifd4, sertifs1, sertifs2, sertifpnsd, sertifpppk;
        int gajisertif;

        gajisertif = 0;
        String pend, pnsd, pppk;

        sertifd4 = 750000;
        sertifs1 = 500000;
        sertifs2 = 1000000;
        sertifpnsd = 4200000;
        sertifpppk = 2000000;
        System.out.println("Apa pendidikan terakhir anda: d4/s1/s2");
        pend = input.nextLine();
        System.out.println("Apakah anda memiliki sertifikat pnsd: Ya/TIdak");
        pnsd = input.nextLine();
        System.out.println("Apakah anda memiliki sertifikat PPPK: Ya/TIdak");
        pppk = input.nextLine();
        if (pend.equals("d4")) {
            gajisertif = gajisertif + sertifd4;
        } 
        else if (pend.equals("s1")) {
            gajisertif = gajisertif + sertifs1;
        } 
        else if (pend.equals("s2")) {
             gajisertif = gajisertif + sertifs2;
        }
            
        
        if (pnsd.equals("Ya")) {
            gajisertif = gajisertif + sertifpnsd;
        }
        if (pppk.equals("Ya")) {
            gajisertif = gajisertif + sertifpppk;
        }
        System.out.println(gajisertif);

    input.close();
    }
}
