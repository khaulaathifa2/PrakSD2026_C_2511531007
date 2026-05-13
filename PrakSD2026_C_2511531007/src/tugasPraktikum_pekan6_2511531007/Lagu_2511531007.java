package tugasPraktikum_pekan6_2511531007;

public class Lagu_2511531007 {
	// mendefinisikan kelas node
	String judul_1007; // judul lagu
	String penyanyi_1007; // penyanyi
	Lagu_2511531007 next_1007; // pointer ke next node
	Lagu_2511531007 prev_1007; // pointer ke previous node
	
	// konstruktor
	public Lagu_2511531007(String judul_1007, String penyanyi_1007) {
		this.judul_1007 = judul_1007;
		this.penyanyi_1007 = penyanyi_1007;
		this.next_1007 = null;
		this.prev_1007 = null;
	}
	
	// getter 
	public String getJudul_1007() { return judul_1007; }
	public String getPenyanyi_1007() { return penyanyi_1007; }
	
	// setter
	public void setJudul_1007(String judul_1007) { this.judul_1007 = judul_1007; }
	public void setPenyanyi_1007(String penyanyi_1007) { this.penyanyi_1007 = penyanyi_1007; }
}
