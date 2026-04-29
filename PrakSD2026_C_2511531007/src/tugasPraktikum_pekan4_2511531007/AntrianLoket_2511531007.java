package tugasPraktikum_pekan4_2511531007;

import java.util.Scanner;

class QueueArray_2511531007 {
    int front_1007, rear_1007, max_1007;
    String queue_1007[];

    public QueueArray_2511531007(int max_1007) {
        this.max_1007 = max_1007;
        queue_1007 = new String[max_1007];
        front_1007 = -1;
        rear_1007 = -1;
    }

    boolean isEmpty_1007() {
        return rear_1007 == -1;
    }

    boolean isFull_1007() {
        return rear_1007 == max_1007 - 1;
    }

    void enqueue_1007(String data_1007) {
        if (isFull_1007()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (isEmpty_1007()) {
            front_1007 = 0;
        }
        rear_1007++;
        queue_1007[rear_1007] = data_1007;
        System.out.println("Data berhasil ditambahkan ke antrian");
    }

    void dequeue_1007() {
        if (isEmpty_1007()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println(queue_1007[front_1007] + " telah dilayani");

        if (front_1007 == rear_1007) {
            front_1007 = -1;
            rear_1007 = -1;
        } else {
            front_1007++;
        }
    }

    void display_1007() {
        if (isEmpty_1007()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Isi antrian:");
        int no_1007 = 1;
        for (int i_1007 = front_1007; i_1007 <= rear_1007; i_1007++) {
            System.out.println(no_1007 + ". " + queue_1007[i_1007]);
            no_1007++;
        }
    }

    void reverse_1007() {
        if (isEmpty_1007()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Isi antrian:");
        int start_1007 = front_1007;
        int end_1007 = rear_1007;
        while (start_1007 < end_1007) {
            String temp_1007 = queue_1007[start_1007];
            queue_1007[start_1007] = queue_1007[end_1007];
            queue_1007[end_1007] = temp_1007;

            start_1007++;
            end_1007--;
        }
        int no_1007 = 1;
        for (int i_1007 = front_1007; i_1007 <= rear_1007; i_1007++) {
            System.out.println(no_1007 + ". " + queue_1007[i_1007]);
            no_1007++;
        }
    }
}

public class AntrianLoket_2511531007 {
    public static void main(String[] args) {
        Scanner input_1007 = new Scanner(System.in);
        QueueArray_2511531007 q_1007 = new QueueArray_2511531007(100);

        int choose_1007;
        
        System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Hapus Antrian");
        System.out.println("3. Tampilkan Antrian");
        System.out.println("4. Reverse");
        System.out.println("5. Keluar");
        do {
            System.out.print("\nPilih menu: ");
            choose_1007 = input_1007.nextInt();
            input_1007.nextLine();

            switch (choose_1007) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama_1007 = input_1007.nextLine();
                    q_1007.enqueue_1007(nama_1007);
                    break;

                case 2:
                    q_1007.dequeue_1007();
                    break;

                case 3:
                    q_1007.display_1007();
                    break;

                case 4:
                    q_1007.reverse_1007();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (choose_1007 != 5);

        input_1007.close();
    }
}