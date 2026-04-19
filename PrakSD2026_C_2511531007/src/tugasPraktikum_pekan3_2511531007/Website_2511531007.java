package tugasPraktikum_pekan3_2511531007;

public class Website_2511531007 {
	String judul_1007;
	String url_1007;
	
	// Konstruktor 
	Website_2511531007 (String judul_1007, String url_1007) {
		this.judul_1007 = judul_1007;
		this.url_1007 = url_1007;
	}
	
	// Getter
	public String getJudul_1007() {return judul_1007;}
	public String getUrl_1007() {return url_1007;}
	
	// Setter
	public void setJudul_1007(String judul_1007) {this.judul_1007 = judul_1007;}
	public void setUrl_1007(String url_1007) {this.url_1007 = url_1007;}
	
	@Override
	public String toString() {
		return "Judul: " + judul_1007 + "\nURL: " + url_1007;
	}

}
