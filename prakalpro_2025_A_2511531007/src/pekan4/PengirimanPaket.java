package pekan4;
import java.util.Scanner;

public class PengirimanPaket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama pengirim: ");
        String namaPengirim = input.nextLine();

        System.out.print("Berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Jarak pengiriman (km): ");
        int jarak = input.nextInt();

        System.out.println("\nJenis layanan:");
        System.out.println("1 = Reguler");
        System.out.println("2 = Express");
        System.out.println("3 = Same Day");
        System.out.print("Pilih layanan (1/2/3): ");
        int jenisLayanan = input.nextInt();

        System.out.println("\nJenis paket:");
        System.out.println("1 = Dokumen");
        System.out.println("2 = Barang Biasa");
        System.out.println("3 = Barang Elektronik");
        System.out.print("Pilih jenis paket (1/2/3): ");
        int jenisPaket = input.nextInt();

        int biayaDasar = (int) (berat * 6000);
        int biayaJarak = jarak * 600;
        int subtotal = biayaDasar + biayaJarak;

        String namaLayanan = "";
        int biayaLayanan = 0;
        String namaJenisPaket = "";
        int biayaJenisPaket = 0;

        if (jenisLayanan == 1) {
            namaLayanan = "Reguler";
            biayaLayanan = 0;
        } else if (jenisLayanan == 2) {
            namaLayanan = "Express";
            biayaLayanan = (int) (subtotal * 0.5);
        } else if (jenisLayanan == 3) {
            namaLayanan = "Same Day";
            biayaLayanan = (int) (subtotal * 1.0);
        } else {
            namaLayanan = "Tidak Valid";
            biayaLayanan = 0;
        }

        
        if (jenisPaket == 1) {
            namaJenisPaket = "Dokumen";
            biayaJenisPaket = 5000;
        } else if (jenisPaket == 2) {
            namaJenisPaket = "Barang Biasa";
            biayaJenisPaket = 8000;
        } else if (jenisPaket == 3) {
            namaJenisPaket = "Barang Elektronik";
            biayaJenisPaket = 20000;
        } else {
            namaJenisPaket = "Tidak Valid";
            biayaJenisPaket = 0;
        }

        int totalSebelumDiskon = subtotal + biayaLayanan + biayaJenisPaket;
        int diskon = 0;
        
        if (totalSebelumDiskon > 50000) {
            diskon = (int) (totalSebelumDiskon * 0.1);
        } 

        int totalBiaya = (int) (totalSebelumDiskon - diskon);

        int persen = 0;
        if (jenisLayanan == 2) {
            persen = 50;
        } else if (jenisLayanan == 3) {
            persen = 100;
        } else { 
        	persen = 0; 
        }

        System.out.println("\n===== BIAYA PENGIRIMAN PAKET =====");
        System.out.println("Nama Pengirim : " + namaPengirim);
        System.out.println("Berat Paket   : " + berat + " kg");
        System.out.println("Jarak Pengiriman : " + jarak + " km");
        System.out.println("Jenis Layanan : " + namaLayanan);
        System.out.println("Jenis Paket   : " + namaJenisPaket);
        System.out.println("--------------------------------------");
        System.out.println("Biaya Dasar        : Rp " + biayaDasar);
        System.out.println("Biaya Jarak        : Rp " + biayaJarak);
        System.out.println("Subtotal           : Rp " + subtotal);
        System.out.println("Biaya Layanan (" + persen + "%) : Rp " + biayaLayanan);
        System.out.println("Biaya Jenis Paket  : Rp " + biayaJenisPaket);
        System.out.println("Total Sebelum Disc.: Rp " + totalSebelumDiskon);
        System.out.println("Diskon             : Rp " + diskon);
        System.out.println("--------------------------------------");
        System.out.println("TOTAL BIAYA        : Rp " + totalBiaya);
    }
}