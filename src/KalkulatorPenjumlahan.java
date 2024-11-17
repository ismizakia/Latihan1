import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KalkulatorPenjumlahan extends JFrame {
    private JTextField fieldAngka1, fieldAngka2, fieldHasil;
    private JButton btnTambah, btnHapus, btnKeluar;

    public KalkulatorPenjumlahan() {
        // Membuat JFrame
        setTitle("Kalkulator Penjumlahan");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Membuat JPanel
        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));

        // Komponen input
        fieldAngka1 = new JTextField();
        fieldAngka2 = new JTextField();
        fieldHasil = new JTextField();
        fieldHasil.setEditable(false);

        // Menambahkan komponen ke panel
        panel.add(new JLabel("Angka 1:"));
        panel.add(fieldAngka1);
        panel.add(new JLabel("Angka 2:"));
        panel.add(fieldAngka2);
        panel.add(new JLabel("Hasil:"));
        panel.add(fieldHasil);

        // Membuat tombol
        btnTambah = new JButton("Tambah");
        btnHapus = new JButton("Hapus");
        btnKeluar = new JButton("Keluar");

        // Menambahkan tombol ke panel
        panel.add(btnTambah);
        panel.add(btnHapus);

        // Menambahkan panel dan tombol Keluar ke JFrame
        add(panel, BorderLayout.CENTER);
        add(btnKeluar, BorderLayout.SOUTH);

        // Logika untuk tombol Tambah
        btnTambah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double angka1 = Double.parseDouble(fieldAngka1.getText());
                    double angka2 = Double.parseDouble(fieldAngka2.getText());
                    double hasil = angka1 + angka2;
                    fieldHasil.setText(String.valueOf(hasil));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Logika untuk tombol Hapus
        btnHapus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fieldAngka1.setText("");
                fieldAngka2.setText("");
                fieldHasil.setText("");
                fieldAngka1.requestFocus();
            }
        });

        // Logika untuk tombol Keluar
        btnKeluar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Membatasi input hanya angka pada JTextField dengan KeyAdapter
        KeyAdapter hanyaAngka = new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char karakter = e.getKeyChar();
                if (!Character.isDigit(karakter) && karakter != '.') {
                    e.consume(); // Abaikan karakter jika bukan angka atau titik
                }
            }
        };
        fieldAngka1.addKeyListener(hanyaAngka);
        fieldAngka2.addKeyListener(hanyaAngka);

        // Menghapus teks saat JTextField mendapatkan fokus dengan FocusListener
        FocusListener hapusSaatFokus = new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                ((JTextField) e.getSource()).setText("");
            }
        };
        fieldAngka1.addFocusListener(hapusSaatFokus);
        fieldAngka2.addFocusListener(hapusSaatFokus);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new KalkulatorPenjumlahan().setVisible(true);
        });
    }
}
