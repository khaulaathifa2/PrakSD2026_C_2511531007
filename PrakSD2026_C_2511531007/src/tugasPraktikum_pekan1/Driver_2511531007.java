package tugasPraktikum_pekan1;

import java.util.Scanner;

public class Driver_2511531007 {
    static Mobil_2511531007[] dataMobil = new Mobil_2511531007[10];
    static int jumlah = 0;

    // Tambah mobil
    static void tambahMobil(Mobil_2511531007 m) {
        if (jumlah < dataMobil.length) {
            dataMobil[jumlah] = m;
            jumlah++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    // Hapus mobil 
    static void hapusMobil(int index) {
        if (index >= 0 && index < jumlah) {
            for (int i = index; i < jumlah - 1; i++) {
                dataMobil[i] = dataMobil[i + 1];
            }
            jumlah--;
        } else {
            System.out.println("Index tidak valid!");
        }
    }
    static void tampilSemua() {
        for (int i = 0; i < jumlah; i++) {
            dataMobil[i].dataMobil();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        tambahMobil(new Mobil_2511531007("Avanza", 2020, 1300, 150000000, "Toyota"));
        tambahMobil(new Mobil_2511531007("APV", 2012, 2500, 200000000, "Suzuki"));

        System.out.println("Data Mobil:");
        tampilSemua();

        hapusMobil(0);

        System.out.println("Data Dihapus:");
        tampilSemua();
    }
}