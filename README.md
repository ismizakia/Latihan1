## Identitas
- Nama  : Ismi Zakia
- NPM   : 2210010020
- Kelas : 5B Non Reguler Banjarmasin

# Kalkulator Penjumlahan

Kalkulator Penjumlahan adalah aplikasi berbasis GUI (Graphical User Interface) yang dibuat menggunakan Java Swing. Aplikasi ini memungkinkan pengguna untuk melakukan operasi penjumlahan dua angka dengan mudah.

## Fitur

- Input dua angka menggunakan text field.
- Tombol untuk melakukan penjumlahan.
- Tombol untuk menghapus input dan hasil.
- Tombol untuk keluar dari aplikasi.
- Validasi input sehingga hanya angka yang diperbolehkan.

## Prasyarat

- **Java Development Kit (JDK)** versi 8 atau lebih baru.
- IDE seperti NetBeans, IntelliJ IDEA, atau Eclipse (opsional).

## Cara Menjalankan

1. **Kloning atau unduh repository ini**.
2. **Buka kode program di IDE** atau gunakan terminal.
3. **Kompilasi dan jalankan program**:
   - Jika menggunakan terminal:
     ```bash
     javac KalkulatorPenjumlahan.java
     java KalkulatorPenjumlahan
     ```

## Penjelasan Kode

### Komponen Utama
1. **JFrame**:
   - Digunakan sebagai jendela utama aplikasi.

2. **JPanel**:
   - Mengatur tata letak komponen dengan `GridLayout`.

3. **JTextField**:
   - Input untuk angka pertama, angka kedua, dan hasil.

4. **JButton**:
   - `Tambah`: Untuk menjumlahkan angka.
   - `Hapus`: Untuk mengosongkan semua input.
   - `Keluar`: Untuk menutup aplikasi.

5. **JLabel**:
   - Label untuk menunjukkan teks seperti "Angka 1", "Angka 2", dan "Hasil".

### Validasi
- Menggunakan `KeyAdapter` untuk memastikan input hanya berupa angka dan titik desimal.
- Menggunakan dialog pesan (`JOptionPane`) untuk menangani error jika input tidak valid.

## Contoh Penggunaan
1. Masukkan angka pertama dan angka kedua.
2. Klik tombol **Tambah** untuk melihat hasilnya.
3. Klik tombol **Hapus** untuk mengosongkan input dan hasil.
4. Klik tombol **Keluar** untuk menutup aplikasi.

## Struktur Kode
- `main`: Titik masuk program.
- `KalkulatorPenjumlahan`: Kelas utama yang berisi logika GUI.
- Listener untuk tombol dan input field:
  - `ActionListener` untuk tombol.
  - `KeyAdapter` untuk validasi input.
  - `FocusListener` untuk menghapus input saat mendapat fokus.
