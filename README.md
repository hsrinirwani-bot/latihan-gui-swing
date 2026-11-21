# Aplikasi Biodata Mahasiswa (Java Swing)

Aplikasi GUI sederhana berbasis **Java Swing** untuk mengisi biodata mahasiswa. Dibuat sebagai tugas mata kuliah **Pemrograman Berorientasi Objek (PBO)**.

## Tampilan Aplikasi

### Form Utama
![Tampilan Form](ss/FormUtama.png)

### Dialog Data Tersimpan
![Tampilan Dialog](ss/DialogDataTersimpan.png)

> Taruh foto di folder `screenshot/` dengan nama `form.png` dan `dialog.png`.

## Fitur
- Input **Nama**, **NIM**, dan **Jurusan**
- Tombol **Simpan**: menampilkan data dalam dialog (dengan validasi kolom tidak boleh kosong)
- Tombol **Reset**: mengosongkan semua kolom
- Tombol **Keluar**: keluar dari aplikasi dengan dialog konfirmasi

## Konsep yang Digunakan

| Konsep | Komponen |
|---|---|
| Top-level container | `JFrame`, `JOptionPane` |
| Intermediate container | `JPanel` |
| Atomic component | `JLabel`, `JTextField`, `JButton` |
| Layout manager | `BorderLayout`, `GridLayout`, `FlowLayout` |
| Event handling | `ActionListener` (lambda expression) |

## Struktur Folder

```
gui/
├── gui.java
├── README.md
└── screenshot/
    ├── form.png
    └── dialog.png
```

## Persyaratan

- Java JDK 8 atau lebih baru
- Cek versi dengan perintah: `java -version`



## Penulis

- **Nama**: (jihadul muhajirin ahmad)
- **NIM**: (f1d02510117)
