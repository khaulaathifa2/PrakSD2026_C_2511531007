package tugasPraktikum_pekan7_2511531007;

public class Mahasiswa_2511531007 {
	private String nama_1007;
    private String nim_1007;
    private String prodi_1007;

    //constructor
    public Mahasiswa_2511531007(String nama_1007, String nim_1007, String prodi_1007) {
        this.nama_1007 = nama_1007;
        this.nim_1007 = nim_1007;
        this.prodi_1007 = prodi_1007;
    }

    //getter
    public String getNama_1007() {return nama_1007;}
    public String getNim_1007() {return nim_1007;}
    public String getProdi_1007() {return prodi_1007;}

    //setter
    public void setNama_1007(String nama_1007) {this.nama_1007 = nama_1007;}
    public void setNim_1007(String nim_1007) {this.nim_1007 = nim_1007;}
    public void setProdi_1007(String prodi_1007) {this.prodi_1007 = prodi_1007;}

    @Override
    public String toString() {
        return nama_1007;
    }
}

