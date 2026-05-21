package tugasPraktikum_pekan7_2511531007;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class SortingMahasiswaGUI_2511531007 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField namaField_1007, nimField_1007, prodiField_1007; // input data mahasiswa
	private JButton startButton_1007, deleteButton_1007, addButton_1007; // tombol kontrol
	private JComboBox<String> cbSorting_1007; // algoritma sorting
	private JTable tabel_1007; // menampilkan data mahasiswa
	private DefaultTableModel model_1007;
	private JTextArea stepArea_1007; // menampilkan langkah sorting
	private ArrayList<Mahasiswa_2511531007> data_1007 = new ArrayList<>(); // menyimpan data mahasiswa

	// Constructor GUI
	public SortingMahasiswaGUI_2511531007() {
		setTitle("Sorting Nama Mahasiswa");
		setSize(900, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// Panel input
		JPanel panelInput_1007 = new JPanel(new GridLayout(4, 2));

		panelInput_1007.add(new JLabel("Nama"));
		namaField_1007 = new JTextField();
		panelInput_1007.add(namaField_1007);

		panelInput_1007.add(new JLabel("NIM"));
		nimField_1007 = new JTextField();
		panelInput_1007.add(nimField_1007);

		panelInput_1007.add(new JLabel("Program Studi"));
		prodiField_1007 = new JTextField();
		panelInput_1007.add(prodiField_1007);

		panelInput_1007.add(new JLabel("Algoritma"));

		cbSorting_1007 = new JComboBox<>();
		cbSorting_1007.addItem("Insertion Sort");
		cbSorting_1007.addItem("Selection Sort");
		cbSorting_1007.addItem("Bubble Sort");

		panelInput_1007.add(cbSorting_1007);

		add(panelInput_1007, BorderLayout.NORTH);

		// Tabel mahasiswa
		model_1007 = new DefaultTableModel(new String[] { "Nama", "NIM", "Program Studi" }, 0);
		tabel_1007 = new JTable(model_1007);
		add(new JScrollPane(tabel_1007), BorderLayout.CENTER);

		// Area langkah sorting
		stepArea_1007 = new JTextArea();
		stepArea_1007.setEditable(false);

		add(new JScrollPane(stepArea_1007), BorderLayout.EAST);

		// Panel tombol
		JPanel panelButton_1007 = new JPanel();

		addButton_1007 = new JButton("Tambah Data");

		deleteButton_1007 = new JButton("Hapus Data");

		startButton_1007 = new JButton("Mulai Sorting");

		panelButton_1007.add(addButton_1007);
		panelButton_1007.add(deleteButton_1007);
		panelButton_1007.add(startButton_1007);

		add(panelButton_1007, BorderLayout.SOUTH);

		// Event tombol
		addButton_1007.addActionListener(e -> addData_1007());

		deleteButton_1007.addActionListener(e -> deleteData_1007());

		startButton_1007.addActionListener(e -> startSorting_1007());

	}

	// Menambahkan data mahasiswa
	private void addData_1007() {
		String nama_1007 = namaField_1007.getText();
		String nim_1007 = nimField_1007.getText();
		String prodi_1007 = prodiField_1007.getText();
		if (nama_1007.isEmpty() || nim_1007.isEmpty() || prodi_1007.isEmpty()) {

			JOptionPane.showMessageDialog(this, "Lengkapi data terlebih dahulu");
			return;
		}

		Mahasiswa_2511531007 mhs_1007 = new Mahasiswa_2511531007(nama_1007, nim_1007, prodi_1007);
		data_1007.add(mhs_1007);
		model_1007.addRow(new Object[] { nama_1007, nim_1007, prodi_1007 });

		namaField_1007.setText("");
		nimField_1007.setText("");
		prodiField_1007.setText("");
	}

	// Menghapus data yang dipilih
	private void deleteData_1007() {

		int row_1007 = tabel_1007.getSelectedRow();

		if (row_1007 >= 0) {
			data_1007.remove(row_1007);
			model_1007.removeRow(row_1007);
		}
	}

	// Menjalankan algoritma sorting
	private void startSorting_1007() {
		stepArea_1007.setText("");
		String pilihan_1007 = cbSorting_1007.getSelectedItem().toString();
		if (pilihan_1007.equals("Insertion Sort")) {

			stepArea_1007.append("=== INSERTION SORT ===\n");

			insertionSort_1007();

		} else if (pilihan_1007.equals("Selection Sort")) {

			stepArea_1007.append("=== SELECTION SORT ===\n");

			selectionSort_1007();

		} else {

			stepArea_1007.append("=== BUBBLE SORT ===\n");

			bubbleSort_1007();
		}

		refreshTable_1007();
	}

	// Algoritma Insertion Sort
	private void insertionSort_1007() {

		for (int i_1007 = 1; i_1007 < data_1007.size(); i_1007++) {

			// Data yang akan disisipkan
			Mahasiswa_2511531007 key_1007 = data_1007.get(i_1007);
			int j_1007 = i_1007 - 1;

			// Menggeser data yang lebih besar
			while (j_1007 >= 0 && data_1007.get(j_1007).getNama_1007().compareToIgnoreCase(key_1007.getNama_1007()) > 0) {
				data_1007.set(j_1007 + 1, data_1007.get(j_1007));
				j_1007--;
			}

			// Menempatkan data pada posisi yang sesuai
			data_1007.set(j_1007 + 1, key_1007);
			stepArea_1007.append("Langkah " + i_1007 + " : " + tampilNama_1007() + "\n");
		}
	}

	// Algoritma Selection Sort
	private void selectionSort_1007() {
		for (int i_1007 = 0; i_1007 < data_1007.size() - 1; i_1007++) {
			int minIndex_1007 = i_1007;
			// Mencari indeks nama terkecil
			for (int j_1007 = i_1007 + 1; j_1007 < data_1007.size(); j_1007++) {
				if (data_1007.get(j_1007).getNama_1007().compareToIgnoreCase(data_1007.get(minIndex_1007).getNama_1007()) < 0) {
					minIndex_1007 = j_1007;
				}
			}

			// Menukar posisi data
			Mahasiswa_2511531007 temp_1007 = data_1007.get(i_1007);
			data_1007.set(i_1007, data_1007.get(minIndex_1007));
			data_1007.set(minIndex_1007, temp_1007);
			stepArea_1007.append("Pass " + (i_1007 + 1) + " : " + tampilNama_1007() + "\n");
		}
	}

	// Algoritma Bubble Sort
	private void bubbleSort_1007() {
		for (int i_1007 = 0; i_1007 < data_1007.size() - 1; i_1007++) {
			for (int j_1007 = 0; j_1007 < data_1007.size() - i_1007 - 1; j_1007++) {

				// Tukar data jika urutannya salah
				if (data_1007.get(j_1007).getNama_1007().compareToIgnoreCase(data_1007.get(j_1007 + 1).getNama_1007()) > 0) {
					Mahasiswa_2511531007 temp_1007 = data_1007.get(j_1007);
					data_1007.set(j_1007, data_1007.get(j_1007 + 1));
					data_1007.set(j_1007 + 1, temp_1007);
				}
			}
			stepArea_1007.append("Pass " + (i_1007 + 1) + " : " + tampilNama_1007() + "\n");
		}
	}

	// Menampilkan daftar nama mahasiswa
	private String tampilNama_1007() {
		StringBuilder sb_1007 = new StringBuilder("[");
		for (int i_1007 = 0; i_1007 < data_1007.size(); i_1007++) {
			sb_1007.append(data_1007.get(i_1007).getNama_1007());
			if (i_1007 < data_1007.size() - 1) {
				sb_1007.append(", ");
			}
		}
		sb_1007.append("]");
		return sb_1007.toString();
	}

	// Memperbarui isi tabel setelah sorting
	private void refreshTable_1007() {
		model_1007.setRowCount(0);
		for (Mahasiswa_2511531007 m_1007 : data_1007) {
			model_1007.addRow(new Object[] { m_1007.getNama_1007(), m_1007.getNim_1007(), m_1007.getProdi_1007() });
		}
	}

	// Menjalankan program GUI
	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {

			SortingMahasiswaGUI_2511531007 gui_1007 = new SortingMahasiswaGUI_2511531007();

			gui_1007.setVisible(true);
		});
	}
}
