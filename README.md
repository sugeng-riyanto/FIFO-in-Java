
# Sistem Antrian Pengunjung di Kebun Binatang

Program ini dibuat untuk membantu mahasiswa memahami konsep **Queue (Antrean)** dalam algoritma dan pemrograman. Dengan program ini, mahasiswa dapat mempelajari cara mengimplementasikan antrean menggunakan Java dan mempraktikkan operasi dasar pada antrean.

## 🎯 Tujuan Pembelajaran
1. Mahasiswa dapat memahami konsep **Queue** sebagai struktur data.
2. Mahasiswa dapat mengimplementasikan operasi dasar antrean, seperti:
   - Menambahkan elemen ke antrean (**enqueue**).
   - Menghapus elemen dari antrean (**dequeue**).
   - Menampilkan elemen dalam antrean.

## 🚀 Fitur Program
1. **Masukkan Pengunjung**: Menambahkan nama pengunjung ke dalam antrean.
2. **Layani Pengunjung**: Menghapus nama pengunjung dari antrean sesuai urutan kedatangan.
3. **Cek Antrian**: Menampilkan semua nama pengunjung yang ada dalam antrean.
4. **Keluar**: Menutup program.

## 🛠️ Tools yang Digunakan
- **IntelliJ IDEA** (atau IDE Java lainnya seperti Eclipse/NetBeans)
- **Java Development Kit (JDK)** versi 8 atau lebih baru.

## 📂 Struktur Folder
```plaintext
ZooQueueSystem/
├── src/
│   └── ZooQueue.java   // File utama program
├── .idea/              // Konfigurasi IntelliJ IDEA (otomatis dibuat)
├── ZooQueueSystem.iml  // Metadata proyek
└── out/                // File hasil kompilasi
📋 Langkah-Langkah Instalasi dan Penggunaan
Clone Repository:

bash
Copy code
git clone https://github.com/username/ZooQueueSystem.git
cd ZooQueueSystem
Buka di IntelliJ IDEA:

Pilih opsi Open di IntelliJ IDEA.
Navigasikan ke folder proyek dan klik OK.
Setup JDK:

Pastikan JDK sudah terpasang dan diatur di IntelliJ IDEA.
Pergi ke File > Project Structure > SDK, pilih versi JDK yang sesuai.
Jalankan Program:

Buka file ZooQueue.java di dalam folder src.
Klik tombol hijau di samping metode main untuk menjalankan program.
💻 Kode Program
```java
Copy code
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ZooQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        while (true) {
            System.out.println("\n--- Sistem Antrian Pengunjung ---");
            System.out.println("1. Masukkan Pengunjung");
            System.out.println("2. Layani Pengunjung");
            System.out.println("3. Cek Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pengunjung: ");
                    String nama = scanner.nextLine();
                    queue.add(nama);
                    System.out.println("Pengunjung " + nama + " telah ditambahkan ke antrian.");
                    break;

                case 2:
                    if (!queue.isEmpty()) {
                        String dilayani = queue.poll();
                        System.out.println("Pengunjung " + dilayani + " sedang dilayani.");
                    } else {
                        System.out.println("Antrian kosong! Tidak ada pengunjung yang bisa dilayani.");
                    }
                    break;

                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println("Pengunjung dalam antrian:");
                        for (String pengunjung : queue) {
                            System.out.println("- " + pengunjung);
                        }
                    } else {
                        System.out.println("Antrian kosong!");
                    }
                    break;

                case 4:
                    System.out.println("Sistem ditutup. Terima kasih!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
```
📖 Penjelasan

Queue: Struktur data FIFO (First In, First Out).

LinkedList: Digunakan untuk mengimplementasikan antrean.

Scanner: Digunakan untuk menerima input dari pengguna.

🧑‍🎓 Tugas Mahasiswa

Tambahkan fitur untuk menghitung jumlah pengunjung dalam antrean.
Tambahkan validasi jika nama pengunjung sudah ada dalam antrean.
Dokumentasikan program menggunakan komentar untuk setiap bagian kode.

📜 Lisensi
Proyek ini menggunakan lisensi MIT. Anda bebas menggunakannya untuk tujuan belajar.


Happy coding! 🚀#
