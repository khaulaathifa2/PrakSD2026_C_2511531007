package tugasPraktikum_pekan9_2511531007;

import java.awt.*;
import java.util.*;
import java.util.List;
import javax.swing.*;
import javax.swing.border.*;

public class PetaKampusUnand_2511531007 extends JFrame {

	private static final long serialVersionUID = 1L;

	static class GraphTraversal_1007 {

		private Map<String, List<String>> graph_1007 = new LinkedHashMap<>();

		public void addEdge_1007(String node1_1007, String node2_1007) {
			graph_1007.putIfAbsent(node1_1007, new ArrayList<>());
			graph_1007.putIfAbsent(node2_1007, new ArrayList<>());
			graph_1007.get(node1_1007).add(node2_1007);
			graph_1007.get(node2_1007).add(node1_1007);
		}

		public List<String[]> getAllEdges_1007() {
			List<String[]> edges_1007 = new ArrayList<>();
			Set<String> added_1007 = new HashSet<>();
			for (String node_1007 : graph_1007.keySet()) {
				for (String neighbor_1007 : graph_1007.get(node_1007)) {
					String key1_1007 = node_1007 + "-" + neighbor_1007;
					String key2_1007 = neighbor_1007 + "-" + node_1007;
					if (!added_1007.contains(key1_1007) && !added_1007.contains(key2_1007)) {
						edges_1007.add(new String[] { node_1007, neighbor_1007 });
						added_1007.add(key1_1007);
					}
				}
			}
			return edges_1007;
		}

		// BFS iteratif
		public TraversalResult_1007 bfs_1007(String start_1007, String goal_1007) {
			List<String> visited_1007 = new ArrayList<>();
			Map<String, String> parent_1007 = new LinkedHashMap<>();
			Queue<String> queue_1007 = new LinkedList<>();
			queue_1007.add(start_1007);
			visited_1007.add(start_1007);
			parent_1007.put(start_1007, null);
			while (!queue_1007.isEmpty()) {
				String current_1007 = queue_1007.poll();
				if (current_1007.equals(goal_1007))
					break;
				for (String neighbor_1007 : graph_1007.getOrDefault(current_1007, new ArrayList<>())) {
					if (!visited_1007.contains(neighbor_1007)) {
						queue_1007.add(neighbor_1007);
						visited_1007.add(neighbor_1007);
						parent_1007.put(neighbor_1007, current_1007);
					}
				}
			}
			return new TraversalResult_1007(visited_1007, buildPath_1007(parent_1007, start_1007, goal_1007));
		}

		// DFS rekursif
		public TraversalResult_1007 dfs_1007(String start_1007, String goal_1007) {
			List<String> visited_1007 = new ArrayList<>();
			Map<String, String> parent_1007 = new LinkedHashMap<>();
			parent_1007.put(start_1007, null);
			dfsHelper_1007(start_1007, goal_1007, visited_1007, parent_1007);
			return new TraversalResult_1007(visited_1007, buildPath_1007(parent_1007, start_1007, goal_1007));
		}

		private boolean dfsHelper_1007(String current_1007, String goal_1007, List<String> visited_1007,
				Map<String, String> parent_1007) {
			if (visited_1007.contains(current_1007))
				return false;
			visited_1007.add(current_1007);
			if (current_1007.equals(goal_1007))
				return true;
			for (String neighbor_1007 : graph_1007.getOrDefault(current_1007, new ArrayList<>())) {
				if (!visited_1007.contains(neighbor_1007)) {
					parent_1007.put(neighbor_1007, current_1007);
					if (dfsHelper_1007(neighbor_1007, goal_1007, visited_1007, parent_1007))
						return true;
				}
			}
			return false;
		}

		private List<String> buildPath_1007(Map<String, String> parent_1007, String start_1007, String goal_1007) {
			List<String> path_1007 = new ArrayList<>();
			if (!parent_1007.containsKey(goal_1007))
				return path_1007;
			String cur_1007 = goal_1007;
			while (cur_1007 != null) {
				path_1007.add(0, cur_1007);
				cur_1007 = parent_1007.get(cur_1007);
			}
			return path_1007;
		}

		static class TraversalResult_1007 {
			public final List<String> visited_1007;
			public final List<String> path_1007;

			TraversalResult_1007(List<String> v, List<String> p) {
				visited_1007 = v;
				path_1007 = p;
			}
		}
	}

	class GraphPanel_1007 extends JPanel {

		private static final long serialVersionUID = 2L;
		private static final int R_1007 = 35;

		@Override
		protected void paintComponent(Graphics g_1007) {
			super.paintComponent(g_1007);
			Graphics2D g2_1007 = (Graphics2D) g_1007;
			g2_1007.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			drawEdges_1007(g2_1007);
			drawNodes_1007(g2_1007);
			drawLegend_1007(g2_1007);
		}

		private void drawEdges_1007(Graphics2D g2_1007) {
			for (String[] edge_1007 : traversal_1007.getAllEdges_1007()) {
				int[] p1_1007 = nodePos_1007.get(edge_1007[0]);
				int[] p2_1007 = nodePos_1007.get(edge_1007[1]);
				if (p1_1007 == null || p2_1007 == null)
					continue;
				if (isEdgeOnPath_1007(edge_1007[0], edge_1007[1])) {
					g2_1007.setColor(Color.ORANGE);
					g2_1007.setStroke(new BasicStroke(3f));
				} else {
					g2_1007.setColor(Color.DARK_GRAY);
					g2_1007.setStroke(new BasicStroke(1.5f));
				}
				g2_1007.drawLine(p1_1007[0], p1_1007[1], p2_1007[0], p2_1007[1]);
			}
			g2_1007.setStroke(new BasicStroke(1f));
		}

		private boolean isEdgeOnPath_1007(String a_1007, String b_1007) {
			if (pathNodes_1007.size() < 2)
				return false;
			for (int i_1007 = 0; i_1007 < pathNodes_1007.size() - 1; i_1007++) {
				String u_1007 = pathNodes_1007.get(i_1007);
				String v_1007 = pathNodes_1007.get(i_1007 + 1);
				if ((u_1007.equals(a_1007) && v_1007.equals(b_1007))
						|| (u_1007.equals(b_1007) && v_1007.equals(a_1007)))
					return true;
			}
			return false;
		}

		private void drawNodes_1007(Graphics2D g2_1007) {
			for (String node_1007 : nodePos_1007.keySet()) {
				int[] pos_1007 = nodePos_1007.get(node_1007);
				int x_1007 = pos_1007[0];
				int y_1007 = pos_1007[1];

				Color fill_1007;
				if (!pathNodes_1007.isEmpty() && node_1007.equals(pathNodes_1007.get(0))) {
					fill_1007 = new Color(46, 204, 113); // Start
				} else if (!pathNodes_1007.isEmpty()
						&& node_1007.equals(pathNodes_1007.get(pathNodes_1007.size() - 1))) {
					fill_1007 = new Color(231, 76, 60); // Goal
				} else if (pathNodes_1007.contains(node_1007)) {
					fill_1007 = new Color(241, 196, 15); // Jalur
				} else if (visitedNodes_1007.contains(node_1007)) {
					fill_1007 = new Color(52, 152, 219); // Dikunjungi
				} else {
					fill_1007 = new Color(189, 195, 199); // Belum
				}

				g2_1007.setColor(fill_1007);
				g2_1007.fillOval(x_1007 - R_1007, y_1007 - R_1007, R_1007 * 2, R_1007 * 2);
				g2_1007.setColor(Color.BLACK);
				g2_1007.setStroke(new BasicStroke(1.5f));
				g2_1007.drawOval(x_1007 - R_1007, y_1007 - R_1007, R_1007 * 2, R_1007 * 2);
				g2_1007.setStroke(new BasicStroke(1f));

				g2_1007.setFont(new Font("SansSerif", Font.BOLD, 10));
				g2_1007.setColor(Color.BLACK);
				FontMetrics fm_1007 = g2_1007.getFontMetrics();
				String[] parts_1007 = node_1007.split(" ", 2);
				if (parts_1007.length == 2) {
					g2_1007.drawString(parts_1007[0], x_1007 - fm_1007.stringWidth(parts_1007[0]) / 2, y_1007 - 3);
					g2_1007.drawString(parts_1007[1], x_1007 - fm_1007.stringWidth(parts_1007[1]) / 2, y_1007 + 11);
				} else {
					g2_1007.drawString(node_1007, x_1007 - fm_1007.stringWidth(node_1007) / 2, y_1007 + 4);
				}
			}
		}

		private void drawLegend_1007(Graphics2D g2_1007) {
			int lx_1007 = 16;
			int ly_1007 = getHeight() - 105;
			g2_1007.setFont(new Font("SansSerif", Font.PLAIN, 11));
			String[][] items_1007 = { { "Lokasi Awal", "" }, { "Lokasi Tujuan", "" }, { "Jalur Ditemukan", "" },
					{ "Sudah Dikunjungi", "" }, { "Belum Dikunjungi", "" } };
			Color[] colors_1007 = { new Color(46, 204, 113), new Color(231, 76, 60), new Color(241, 196, 15),
					new Color(52, 152, 219), new Color(189, 195, 199) };
			for (int i_1007 = 0; i_1007 < items_1007.length; i_1007++) {
				g2_1007.setColor(colors_1007[i_1007]);
				g2_1007.fillRect(lx_1007, ly_1007, 14, 14);
				g2_1007.setColor(Color.BLACK);
				g2_1007.drawRect(lx_1007, ly_1007, 14, 14);
				g2_1007.drawString(items_1007[i_1007][0], lx_1007 + 20, ly_1007 + 12);
				ly_1007 += 20;
			}
		}
	}

	private JComboBox<String> cbStart_1007;
	private JComboBox<String> cbGoal_1007;
	private JTextArea taResult_1007;
	private GraphPanel_1007 graphPanel_1007;

	private final GraphTraversal_1007 traversal_1007 = new GraphTraversal_1007();
	private List<String> visitedNodes_1007 = new ArrayList<>();
	private List<String> pathNodes_1007 = new ArrayList<>();
	private final Map<String, int[]> nodePos_1007 = new LinkedHashMap<>();

	private static final String[] NODES_1007 = { "Gerbang Utama", "Rektorat", "Perpus", "FT", "FEB", "FH", "FK", "FTI",
			"Masjid Nurul Ilmi", "Auditorium" };

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				new PetaKampusUnand_2511531007().setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public PetaKampusUnand_2511531007() {
		setTitle("Peta Universitas Andalas - BFS & DFS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1150, 680);
		buildGraph_1007();
		setupUI_1007();
	}

	private void buildGraph_1007() {
		nodePos_1007.put("Gerbang Utama", new int[] { 100, 220 });
		nodePos_1007.put("FK", new int[] { 280, 80 });
		nodePos_1007.put("Masjid Nurul Ilmi", new int[] { 280, 190 });
		nodePos_1007.put("FEB", new int[] { 280, 300 });
		nodePos_1007.put("FH", new int[] { 520, 240 });
		nodePos_1007.put("FTI", new int[] { 780, 140 });
		nodePos_1007.put("Perpus", new int[] { 780, 300 });
		nodePos_1007.put("Auditorium", new int[] { 1000, 80 });
		nodePos_1007.put("Rektorat", new int[] { 1000, 190 });
		nodePos_1007.put("FT", new int[] { 1000, 300 });

		traversal_1007.addEdge_1007("Gerbang Utama", "FK");
		traversal_1007.addEdge_1007("Gerbang Utama", "Masjid Nurul Ilmi");

		traversal_1007.addEdge_1007("FK", "Masjid Nurul Ilmi");
		traversal_1007.addEdge_1007("FK", "FH");

		traversal_1007.addEdge_1007("Masjid Nurul Ilmi", "FEB");
		traversal_1007.addEdge_1007("Masjid Nurul Ilmi", "FH");

		traversal_1007.addEdge_1007("FEB", "Perpus");
		traversal_1007.addEdge_1007("FEB", "FH");

		traversal_1007.addEdge_1007("FH", "FTI");
		traversal_1007.addEdge_1007("FH", "Rektorat");

		traversal_1007.addEdge_1007("FTI", "Auditorium");
		traversal_1007.addEdge_1007("FTI", "Perpus");

		traversal_1007.addEdge_1007("Perpus", "FT");
		traversal_1007.addEdge_1007("Perpus", "Rektorat");

		traversal_1007.addEdge_1007("FT", "Rektorat");
		traversal_1007.addEdge_1007("FTI", "Rektorat");
	}

	private void setupUI_1007() {
		JPanel contentPane_1007 = new JPanel(new BorderLayout(5, 5));
		contentPane_1007.setBorder(new EmptyBorder(8, 8, 8, 8));
		setContentPane(contentPane_1007);

		// Panel atas
		JPanel topPanel_1007 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		topPanel_1007.setBorder(new TitledBorder("Pencarian Jalur Menggunakan BFS dan DFS"));

		topPanel_1007.add(new JLabel("Lokasi Awal :"));
		cbStart_1007 = new JComboBox<>(NODES_1007);
		topPanel_1007.add(cbStart_1007);

		topPanel_1007.add(new JLabel("Lokasi Tujuan :"));
		cbGoal_1007 = new JComboBox<>(NODES_1007);
		cbGoal_1007.setSelectedIndex(5);
		topPanel_1007.add(cbGoal_1007);

		JButton btnBFS_1007 = new JButton("BFS");
		JButton btnDFS_1007 = new JButton("DFS");
		JButton btnReset_1007 = new JButton("Reset");

		btnBFS_1007.addActionListener(e -> runBFS_1007());
		btnDFS_1007.addActionListener(e -> runDFS_1007());
		btnReset_1007.addActionListener(e -> resetGraph_1007());

		topPanel_1007.add(btnBFS_1007);
		topPanel_1007.add(btnDFS_1007);
		topPanel_1007.add(btnReset_1007);
		contentPane_1007.add(topPanel_1007, BorderLayout.NORTH);

		// Panel tengah
		graphPanel_1007 = new GraphPanel_1007();
		graphPanel_1007.setBorder(new TitledBorder("Visualisasi Graph"));
		contentPane_1007.add(graphPanel_1007, BorderLayout.CENTER);

		// Panel bawah
		JPanel bottomPanel_1007 = new JPanel(new BorderLayout());
		bottomPanel_1007.setBorder(new TitledBorder("Hasil Pencarian"));
		bottomPanel_1007.setPreferredSize(new Dimension(0, 195));

		taResult_1007 = new JTextArea();
		taResult_1007.setEditable(false);
		taResult_1007.setFont(new Font("Monospaced", Font.PLAIN, 12));
		bottomPanel_1007.add(new JScrollPane(taResult_1007), BorderLayout.CENTER);
		contentPane_1007.add(bottomPanel_1007, BorderLayout.SOUTH);
	}

	private void runBFS_1007() {
		String start_1007 = (String) cbStart_1007.getSelectedItem();
		String goal_1007 = (String) cbGoal_1007.getSelectedItem();
		if (start_1007.equals(goal_1007)) {
			showSameNodeWarning_1007();
			return;
		}
		GraphTraversal_1007.TraversalResult_1007 res_1007 = traversal_1007.bfs_1007(start_1007, goal_1007);
		visitedNodes_1007 = res_1007.visited_1007;
		pathNodes_1007 = res_1007.path_1007;
		displayResult_1007("BFS", start_1007, goal_1007, res_1007.visited_1007, res_1007.path_1007);
		graphPanel_1007.repaint();
	}

	private void runDFS_1007() {
		String start_1007 = (String) cbStart_1007.getSelectedItem();
		String goal_1007 = (String) cbGoal_1007.getSelectedItem();
		if (start_1007.equals(goal_1007)) {
			showSameNodeWarning_1007();
			return;
		}
		GraphTraversal_1007.TraversalResult_1007 res_1007 = traversal_1007.dfs_1007(start_1007, goal_1007);
		visitedNodes_1007 = res_1007.visited_1007;
		pathNodes_1007 = res_1007.path_1007;
		displayResult_1007("DFS", start_1007, goal_1007, res_1007.visited_1007, res_1007.path_1007);
		graphPanel_1007.repaint();
	}

	private void resetGraph_1007() {
		visitedNodes_1007.clear();
		pathNodes_1007.clear();
		taResult_1007.setText("");
		cbStart_1007.setSelectedIndex(0);
		cbGoal_1007.setSelectedIndex(5);
		graphPanel_1007.repaint();
	}

	private void displayResult_1007(String algo_1007, String start_1007, String goal_1007, List<String> visited_1007,
			List<String> path_1007) {
		StringBuilder sb_1007 = new StringBuilder();
		sb_1007.append("=== HASIL PENCARIAN ").append(algo_1007).append(" ===\n");
		sb_1007.append("Lokasi Awal         : ").append(start_1007).append("\n");
		sb_1007.append("Lokasi Tujuan       : ").append(goal_1007).append("\n");
		sb_1007.append("-------------------------------------------------------\n");
		sb_1007.append("Node Dikunjungi     : ").append(String.join(" -> ", visited_1007)).append("\n");
		sb_1007.append("Jumlah Dieksplorasi : ").append(visited_1007.size()).append(" node\n");
		sb_1007.append("-------------------------------------------------------\n");
		if (path_1007.isEmpty()) {
			sb_1007.append("Jalur               : Tidak ditemukan!\n");
		} else {
			sb_1007.append("Jalur               : ").append(String.join(" -> ", path_1007)).append("\n");
			sb_1007.append("Panjang Jalur       : ").append(path_1007.size() - 1).append(" langkah\n");
		}
		taResult_1007.setText(sb_1007.toString());
	}

	private void showSameNodeWarning_1007() {
		JOptionPane.showMessageDialog(this, "Lokasi awal dan tujuan tidak boleh sama!", "Peringatan",
				JOptionPane.WARNING_MESSAGE);
	}
}