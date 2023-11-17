package P11;

public class Porseni25 {
    public static void main(String[] args) {
        // [0](Badminton), [1](Tenis Meja), [2](Basket), [3](Bola Voly)
        String[][] namaPeserta = {
                { "Budi", "Agus", "Doni", "Sugeng", "Leon" },
                { "Zannur", "Roy", "Ucup", "Dani", "Sulaiman" },
                { "Soultan", "Adham", "Charger", "Yuri", "Nikolai" },
                { "Price", "Xitoyuri", "Nadhif", "Yudha", "Wijaya" }
        };

        for (int i = 0; i < namaPeserta.length; i++) {
            for (int j = 1; j < namaPeserta[i].length; j++) {
                for (int k = 0; k < namaPeserta[i].length; k++) {
                    String temp = namaPeserta[i][j];
                    if (temp.compareToIgnoreCase(namaPeserta[i][k]) < 0) {
                        namaPeserta[i][j] = namaPeserta[i][k];
                        namaPeserta[i][k] = temp;
                    }
                }
            }
        }

        for (String[] namaCabor : namaPeserta) {
            for (String namaUrut : namaCabor) {
                System.out.print(namaUrut + " ");
            }
            System.out.println();
        }
    }
}
