// Mengambil semua komponen Swing: JFrame, JPanel, JLabel, JTextField, JButton, JOptionPane
import javax.swing.*;
// Mengambil layout manager (BorderLayout, GridLayout, FlowLayout) dan Font
import java.awt.*;

// Class utama; nama class harus sama dengan nama file (AplikasiBiodata.java)
public class AplikasiBiodata {

    // Method main: titik awal program dijalankan
    public static void main(String[] args) {

        // Membuat jendela utama (top-level container) dengan judul di title bar
        JFrame frame = new JFrame("Aplikasi Biodata");
        // Program ikut berhenti saat tombol X di jendela ditekan
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Mengatur layout frame: BorderLayout dengan jarak 5 piksel antar area
        frame.setLayout(new BorderLayout(5, 5));

        // Membuat label judul dengan teks rata tengah
        JLabel judul = new JLabel("Form Biodata Mahasiswa", JLabel.CENTER);
        // Mengatur font judul: Arial, tebal, ukuran 18
        judul.setFont(new Font("Arial", Font.BOLD, 18));

        // Membuat kotak isian teks untuk Nama
        JTextField txtNama = new JTextField();
        // Membuat kotak isian teks untuk NIM
        JTextField txtNim = new JTextField();
        // Membuat kotak isian teks untuk Jurusan
        JTextField txtJurusan = new JTextField();

        // Membuat panel form (intermediate container) berbentuk tabel 3 baris x 2 kolom, jarak 5 piksel
        JPanel panelForm = new JPanel(new GridLayout(3, 2, 5, 5));
        // Memberi margin kosong 10 piksel di sekeliling panel agar tidak menempel ke tepi
        panelForm.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // Menambahkan label "Nama:" ke sel baris 1 kolom 1
        panelForm.add(new JLabel("Nama:"));
        // Menambahkan kotak isian Nama ke sel baris 1 kolom 2
        panelForm.add(txtNama);
        // Menambahkan label "NIM:" ke sel baris 2 kolom 1
        panelForm.add(new JLabel("NIM:"));
        // Menambahkan kotak isian NIM ke sel baris 2 kolom 2
        panelForm.add(txtNim);
        // Menambahkan label "Jurusan:" ke sel baris 3 kolom 1
        panelForm.add(new JLabel("Jurusan:"));
        // Menambahkan kotak isian Jurusan ke sel baris 3 kolom 2
        panelForm.add(txtJurusan);

        // Membuat tombol Simpan
        JButton btnSimpan = new JButton("Simpan");
        // Membuat tombol Reset
        JButton btnReset = new JButton("Reset");
        // Membuat tombol Keluar
        JButton btnKeluar = new JButton("Keluar");

        // Membuat panel tombol dengan FlowLayout (tersusun berderet ke samping, rata tengah)
        JPanel panelTombol = new JPanel(new FlowLayout());
        // Menambahkan tombol Simpan ke panel
        panelTombol.add(btnSimpan);
        // Menambahkan tombol Reset ke panel
        panelTombol.add(btnReset);
        // Menambahkan tombol Keluar ke panel
        panelTombol.add(btnKeluar);

        // Mendaftarkan aksi saat tombol Simpan diklik (lambda expression)
        btnSimpan.addActionListener(e -> {
            // Mengambil teks Nama dan membuang spasi di awal/akhir
            String nama = txtNama.getText().trim();
            // Mengambil teks NIM dan membuang spasi di awal/akhir
            String nim = txtNim.getText().trim();
            // Mengambil teks Jurusan dan membuang spasi di awal/akhir
            String jurusan = txtJurusan.getText().trim();

            // Mengecek apakah ada kolom yang masih kosong
            if (nama.isEmpty() || nim.isEmpty() || jurusan.isEmpty()) {
                // Jika ada yang kosong, tampilkan dialog peringatan
                JOptionPane.showMessageDialog(frame, "Semua data harus diisi!",
                        "Peringatan", JOptionPane.WARNING_MESSAGE);
            } else {
                // Jika semua terisi, tampilkan data dalam dialog informasi (\n = baris baru)
                JOptionPane.showMessageDialog(frame,
                        "Nama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan,
                        "Data Tersimpan", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Mendaftarkan aksi saat tombol Reset diklik
        btnReset.addActionListener(e -> {
            // Mengosongkan kotak Nama
            txtNama.setText("");
            // Mengosongkan kotak NIM
            txtNim.setText("");
            // Mengosongkan kotak Jurusan
            txtJurusan.setText("");
        });

        // Mendaftarkan aksi saat tombol Keluar diklik
        btnKeluar.addActionListener(e -> {
            // Menampilkan dialog konfirmasi Ya/Tidak dan menyimpan pilihan user
            int pilih = JOptionPane.showConfirmDialog(frame, "Yakin ingin keluar?",
                    "Konfirmasi", JOptionPane.YES_NO_OPTION);
            // Jika user memilih Ya
            if (pilih == JOptionPane.YES_OPTION) {
                // Menghentikan program
                System.exit(0);
            }
        });

        // Menaruh judul di bagian atas frame
        frame.add(judul, BorderLayout.NORTH);
        // Menaruh panel form di bagian tengah frame
        frame.add(panelForm, BorderLayout.CENTER);
        // Menaruh panel tombol di bagian bawah frame
        frame.add(panelTombol, BorderLayout.SOUTH);

        // Mengatur ukuran jendela: lebar 350, tinggi 230 piksel
        frame.setSize(350, 230);
        // Menampilkan jendela di tengah layar
        frame.setLocationRelativeTo(null);
        // Menampilkan jendela (wajib, karena default-nya tersembunyi)
        frame.setVisible(true);
    }
}