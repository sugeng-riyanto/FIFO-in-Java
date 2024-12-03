import java.util.LinkedList; // Mengimpor LinkedList untuk implementasi antrean
import java.util.Queue;      // Mengimpor interface Queue dari Java Collections Framework
import java.util.Scanner;    // Mengimpor Scanner untuk membaca input dari pengguna

public class ZooQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input
        Queue<String> queue = new LinkedList<>(); // Membuat antrean menggunakan LinkedList

        while (true) { // Loop tak hingga untuk menu
            // Menampilkan menu utama
            System.out.println("\n--- Sistem Antrian Pengunjung ---");
            System.out.println("1. Masukkan Pengunjung");
            System.out.println("2. Layani Pengunjung");
            System.out.println("3. Cek Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            
            int pilihan = scanner.nextInt(); // Membaca pilihan pengguna
            scanner.nextLine(); // Membersihkan buffer setelah membaca integer

            switch (pilihan) { // Switch-case untuk memproses pilihan pengguna
                case 1:
                    // Memproses masukan pengunjung
                    System.out.print("Masukkan nama pengunjung: ");
                    String nama = scanner.nextLine(); // Membaca nama pengunjung
                    queue.add(nama); // Menambahkan nama pengunjung ke dalam antrean
                    System.out.println("Pengunjung " + nama + " telah ditambahkan ke antrian.");
                    break; // Keluar dari case 1

                case 2:
                    // Melayani pengunjung dari antrean
                    if (!queue.isEmpty()) { // Mengecek apakah antrean tidak kosong
                        String dilayani = queue.poll(); // Mengambil dan menghapus elemen pertama dari antrean
                        System.out.println("Pengunjung " + dilayani + " sedang dilayani.");
                    } else {
                        // Pesan jika antrean kosong
                        System.out.println("Antrian kosong! Tidak ada pengunjung yang bisa dilayani.");
                    }
                    break; // Keluar dari case 2

                case 3:
                    // Menampilkan semua pengunjung dalam antrean
                    if (!queue.isEmpty()) { // Mengecek apakah antrean tidak kosong
                        System.out.println("Pengunjung dalam antrian:");
                        for (String pengunjung : queue) { // Iterasi melalui antrean
                            System.out.println("- " + pengunjung); // Menampilkan setiap nama pengunjung
                        }
                    } else {
                        // Pesan jika antrean kosong
                        System.out.println("Antrian kosong!");
                    }
                    break; // Keluar dari case 3

                case 4:
                    // Keluar dari program
                    System.out.println("Sistem ditutup. Terima kasih!");
                    scanner.close(); // Menutup scanner untuk membebaskan sumber daya
                    return; // Mengakhiri program

                default:
                    // Pesan untuk pilihan tidak valid
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
