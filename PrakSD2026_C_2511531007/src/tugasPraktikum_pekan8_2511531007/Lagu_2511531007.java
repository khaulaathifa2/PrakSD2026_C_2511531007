package tugasPraktikum_pekan8_2511531007;

public class Lagu_2511531007 {
		private String judul_1007;
		private String penyanyi_1007;
		private int durasi_1007;
		
		// Konstruktor
		Lagu_2511531007(String judul_1007, String penyanyi_1007, int durasi_1007) {
			this.judul_1007 = judul_1007;
			this.penyanyi_1007 = penyanyi_1007;
			this.durasi_1007 = durasi_1007;
		}
		
		// Getter
		public String getJudul_1007() {return judul_1007;}
		public String getPenyanyi_1007() {return penyanyi_1007;}
		public int getDurasi_1007() {return durasi_1007;}
		
		// Setter
		public void setJudul_1007(String judul_1007) {this.judul_1007 = judul_1007;}
		public void setPenyanyi_1007(String penyanyi_1007) {this.penyanyi_1007 = penyanyi_1007;}
		public void setDurasi_1007(int durasi_1007) {this.durasi_1007 = durasi_1007;}
		
		public String toString_1007() {
			return judul_1007 + " - " + penyanyi_1007 + " (" + durasi_1007 + " detik)";
		}
		
}
