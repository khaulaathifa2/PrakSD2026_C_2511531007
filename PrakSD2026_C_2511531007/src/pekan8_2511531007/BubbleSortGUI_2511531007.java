package pekan8_2511531007;

import java.awt.*;
import javax.swing.*;

public class BubbleSortGUI_2511531007 extends JFrame {
	private static final long serialVersionUID = 1L;
	private int[] array_1007;
	private JLabel [] labelArray_1007;
	private JButton stepButton_1007, resetButton_1007, setButton_1007;
	private JTextField inputField_1007;
	private JPanel panelArray_1007;
	private JTextArea stepArea_1007;
			
	private int i_1007 = 1 ,j_1007;
	private boolean sorting_1007 = false;
	private int stepCount_1007 = 1;
			
	public BubbleSortGUI_2511531007() {
		setTitle("Insertion Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		// Panel input
		JPanel inputPanel_1007 = new JPanel(new FlowLayout());
		inputField_1007 = new JTextField(30);
		setButton_1007 = new JButton("Set Array");
		inputPanel_1007.add(new JLabel("Masukkan angka (pisahkan dengan koma): "));
		inputPanel_1007.add(inputField_1007);
		inputPanel_1007.add(setButton_1007);

		// Panel array visual
		panelArray_1007 = new JPanel();
		panelArray_1007.setLayout(new FlowLayout());

		// Panel kontrol
		JPanel controlPanel_1007 = new JPanel();
		stepButton_1007 = new JButton("Langkah Selanjutnya");
		resetButton_1007 = new JButton("Reset");
		stepButton_1007.setEnabled(false);
    		controlPanel_1007.add(stepButton_1007);
    		controlPanel_1007.add(resetButton_1007);
    		
    		// Area teks untuk log langkah-langkah
    		stepArea_1007 = new JTextArea(8, 60);
    		stepArea_1007.setEditable(false);
    		stepArea_1007.setFont(new Font("Monospaced", Font.PLAIN, 14));
    		JScrollPane scrollPane_1007 = new JScrollPane(stepArea_1007);

    		// Tambahkan panel ke frame
    		add(inputPanel_1007, BorderLayout.NORTH);
    		add(panelArray_1007, BorderLayout.CENTER);
    		add(controlPanel_1007, BorderLayout.SOUTH);
    		add(scrollPane_1007, BorderLayout.EAST);

    		// Event Set Array
    		setButton_1007.addActionListener(e -> setArrayFromInput());

    		// Event Langkah Selanjutnya
    		stepButton_1007.addActionListener(e -> performStep_1007());

    		// Event Reset
    		resetButton_1007.addActionListener(e -> reset());

	}
	private void setArrayFromInput() {
	    String text_1007 = inputField_1007.getText().trim();
	    if (text_1007.isEmpty()) return;
	    String[] parts_1007 = text_1007.split(",");
	    array_1007 = new int[parts_1007.length];
	    try {
	        for (int k_1007 = 0; k_1007 < parts_1007.length; k_1007++) {
	            array_1007[k_1007] = Integer.parseInt(parts_1007[k_1007].trim());
	        }
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(this, "Masukkan hanya angka"
	                + "yang dipisahkan koma!", "Error", JOptionPane.ERROR_MESSAGE);
	        return;
	    }
	    
	    i_1007 = 0;
	    stepCount_1007 = 0;
	    sorting_1007 = true;
	    stepButton_1007.setEnabled(true);
	    stepArea_1007.setText("");
	    panelArray_1007.removeAll();
	    labelArray_1007 = new JLabel[array_1007.length];
	    for (int k_1007 = 0; k_1007 < array_1007.length; k_1007++) {
	        labelArray_1007[k_1007] = new JLabel(String.valueOf(array_1007[k_1007]));
	        labelArray_1007[k_1007].setFont(new Font("Arial", Font.BOLD, 24));
	        labelArray_1007[k_1007].setOpaque(true);
	        labelArray_1007[k_1007].setBackground(Color.WHITE);
	        labelArray_1007[k_1007].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        labelArray_1007[k_1007].setPreferredSize(new Dimension(50, 50));
	        labelArray_1007[k_1007].setHorizontalAlignment(SwingConstants.CENTER);
	        panelArray_1007.add(labelArray_1007[k_1007]);
	    }
	    
	    panelArray_1007.revalidate();
	    panelArray_1007.repaint();
	}

	private void performStep_1007() {

	    if (!sorting_1007 || i_1007 > array_1007.length - 1) {

	        sorting_1007 = false;

	        stepButton_1007.setEnabled(false);

	        JOptionPane.showMessageDialog(this, "Sorting selesai!");

	        return;
	    }

	    resetHighlights_1007();

	    StringBuilder stepLog_1007 = new StringBuilder();

	    labelArray_1007[j_1007].setBackground(Color.CYAN);
	    labelArray_1007[j_1007 + 1].setBackground(Color.CYAN);

	    if (array_1007[j_1007] > array_1007[j_1007 + 1]) {

	        int temp_1007 = array_1007[j_1007];

	        array_1007[j_1007] = array_1007[j_1007 + 1];

	        array_1007[j_1007 + 1] = temp_1007;

	        labelArray_1007[j_1007].setBackground(Color.RED);

	        labelArray_1007[j_1007 + 1].setBackground(Color.RED);

	        stepLog_1007.append("Langkah ").append(stepCount_1007)
	                .append(": Menukar elemen ke-")
	                .append(j_1007).append(" (")
	                .append(array_1007[j_1007 + 1]).append(") dengan ke-")
	                .append(j_1007 + 1).append(" (")
	                .append(array_1007[j_1007]).append(")\n");

	    } else {

	        stepLog_1007.append("Langkah ").append(stepCount_1007)
	                .append(": Tidak ada pertukaran antara ke-")
	                .append(j_1007).append(" dan ke-")
	                .append(j_1007 + 1).append("\n");
	    }

	    stepLog_1007.append("Hasil: ")
	            .append(arrayToString(array_1007))
	            .append("\n\n");

	    stepArea_1007.append(stepLog_1007.toString());

	    updateLabels();

	    j_1007++;

	    if (j_1007 >= array_1007.length - 1 - i_1007) {
	        j_1007 = 0;
	        i_1007++;
	        stepCount_1007++;
	        if (i_1007 >= array_1007.length - 1) {
	            sorting_1007 = false;
	            stepButton_1007.setEnabled(false);
	            JOptionPane.showMessageDialog(this, "Sorting selesai!");
	        }
	    }
	}
	private void resetHighlights_1007() {
		for(JLabel label_1007 : labelArray_1007) {
			label_1007.setBackground(Color.WHITE);
		}
	}
	private void updateLabels() {
	    for (int k_1007 = 0; k_1007 < array_1007.length; k_1007++) {
	        labelArray_1007[k_1007].setText(String.valueOf(array_1007[k_1007]));
	    }
	}

	private void reset() {
	    inputField_1007.setText("");
	    panelArray_1007.removeAll();
	    panelArray_1007.revalidate();
	    panelArray_1007.repaint();
	    stepArea_1007.setText("");
	    stepButton_1007.setEnabled(false);
	    sorting_1007 = false;
	    i_1007 = 0;
	    j_1007 = 0;
	    stepCount_1007 = 1;
	}

	private String arrayToString(int[] arr) {
	    StringBuilder sb = new StringBuilder();
	    for (int k = 0; k < arr.length; k++) {
	        sb.append(arr[k]);
	        if (k < arr.length - 1) sb.append(", ");
	    }
	    return sb.toString();
	}
	  public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new BubbleSortGUI_2511531007().setVisible(true);
	            }
	        });
	    }
	
}