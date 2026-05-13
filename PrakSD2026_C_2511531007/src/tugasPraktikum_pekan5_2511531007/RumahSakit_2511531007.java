package tugasPraktikum_pekan5_2511531007;

import java.util.Scanner;

public class RumahSakit_2511531007 {
    
    // Counter statis untuk nomor antrian otomatis
    static int counter_1007 = 0;

    public static void main(String[] args) {
        Scanner scanner_1007 = new Scanner(System.in);
        Pasien_2511531007 head_1007 = null; // Head list dimulai null
        int pilihan_1007 = 0;

        do {
            // Tampilan Menu
            System.out.println("\n=== Antrian Rumah Sakit NIM:2511531007===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            
            if (scanner_1007.hasNextInt()) {
                pilihan_1007 = scanner_1007.nextInt();
                scanner_1007.nextLine(); 
            } else {
                System.out.println("Input harus berupa angka!");
                scanner_1007.nextLine();
                continue;
            }

            switch (pilihan_1007) {
                case 1:
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama_1007 = scanner_1007.nextLine();
                    System.out.print("Masukkan Keluhan : ");
                    String keluhan_1007 = scanner_1007.nextLine();
                    head_1007 = daftarkanPasien_1007(head_1007, nama_1007, keluhan_1007);
                    break;

                case 2:
                    head_1007 = panggilPasien_1007(head_1007);
                    break;

                case 3:
                    tampilkanAntrian_1007(head_1007);
                    break;

                case 4:
                    System.out.print("Masukkan nama pasien yang dicari: ");
                    String kataKunci_1007 = scanner_1007.nextLine();
                    cariPasien_1007(head_1007, kataKunci_1007);
                    break;

                case 5:
                    cekStatus_1007(head_1007);
                    break;

                case 6:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_1007 != 6);
        
        scanner_1007.close();
        
    }

    // 1. Daftarkan Pasien 
    public static Pasien_2511531007 daftarkanPasien_1007(Pasien_2511531007 head_1007, String nama, String keluhan) {
        // Increment counter antrian
        counter_1007++;
        
        // Buat node baru
        Pasien_2511531007 nodeBaru_1007 = new Pasien_2511531007(nama, keluhan, counter_1007);

        // Jika list kosong, node baru jadi head
        if (head_1007 == null) {
            head_1007 = nodeBaru_1007;
        } else {
            // Cari node terakhir 
            Pasien_2511531007 temp_1007 = head_1007;
            while (temp_1007.next_1007 != null) {
                temp_1007 = temp_1007.next_1007;
            }
            // Sambungkan node baru ke akhir
            temp_1007.next_1007 = nodeBaru_1007;
        }

        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + nodeBaru_1007.noAntrian_1007);
        return head_1007;
    }

    // 2. Panggil Pasien 
    public static Pasien_2511531007 panggilPasien_1007(Pasien_2511531007 head_1007) {
        if (head_1007 == null) {
            System.out.println("Antrian kosong, tidak ada pasien untuk dipanggil.");
            return head_1007;
        }

        System.out.println("\n--- Memanggil Pasien ---");
        System.out.println("Nomor Antrian: " + head_1007.noAntrian_1007);
        System.out.println("Nama: " + head_1007.namaPasien_1007);
        System.out.println("Keluhan: " + head_1007.penyakit_1007);
        System.out.println("------------------------\n");

        // Geser head ke node berikutnya
        head_1007 = head_1007.next_1007;
        return head_1007;
    }

    // 3. Tampilkan Antrian 
    public static void tampilkanAntrian_1007(Pasien_2511531007 head_1007) {
        if (head_1007 == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("\n=== Daftar Antrian Saat Ini ===");
        Pasien_2511531007 curr_1007 = head_1007;
        int posisi_1007 = 1;
        while (curr_1007 != null) {
            System.out.println("Posisi " + posisi_1007 + ":");
            System.out.println("  No. Antrian: " + curr_1007.noAntrian_1007);
            System.out.println("  Nama: " + curr_1007.namaPasien_1007);
            System.out.println("  Keluhan: " + curr_1007.penyakit_1007);
            curr_1007 = curr_1007.next_1007;
            posisi_1007++;
        }
        System.out.println("===============================\n");
    }

    // 4. Cari Pasien 
    public static void cariPasien_1007(Pasien_2511531007 head_1007, String namaCari) {
        if (head_1007 == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        Pasien_2511531007 curr_1007 = head_1007;
        boolean ditemukan_1007 = false;

        while (curr_1007 != null) {
            if (curr_1007.namaPasien_1007.equalsIgnoreCase(namaCari)) {
                System.out.println("\nPasien Ditemukan!");
                System.out.println("No. Antrian: " + curr_1007.noAntrian_1007);
                System.out.println("Nama: " + curr_1007.namaPasien_1007);
                System.out.println("Keluhan: " + curr_1007.penyakit_1007);
                ditemukan_1007 = true;
                break; 
            }
            curr_1007 = curr_1007.next_1007;
        }

        if (!ditemukan_1007) {
            System.out.println("Pasien dengan nama '" + namaCari + "' tidak ditemukan dalam antrian.");
        }
    }

    // 5. Cek Status Antrian
    public static void cekStatus_1007(Pasien_2511531007 head_1007) {
        System.out.println("\n=== Status Antrian ===");
        if (head_1007 == null) {
            System.out.println("Total Pasien: 0");
            System.out.println("Pasien Terdepan: Tidak ada (Antrian Kosong)");
        } else {
            // Hitung total pasien
            int total_1007 = 0;
            Pasien_2511531007 curr_1007 = head_1007;
            while (curr_1007 != null) {
                total_1007++;
                curr_1007 = curr_1007.next_1007;
            }

            System.out.println("Total Pasien: " + total_1007);
            System.out.println("Pasien Terdepan: " + head_1007.namaPasien_1007 + " (No. Antrian: " + head_1007.noAntrian_1007 + ")");
        }
        System.out.println("====================\n");
    }
}