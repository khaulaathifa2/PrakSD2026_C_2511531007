package tugasPraktikum_pekan5_2511531007;

public class Pasien_2511531007 {
    String namaPasien_1007;
    String penyakit_1007;
    int noAntrian_1007;
    Pasien_2511531007 next_1007; 
    
    // Constructor 
    public Pasien_2511531007(String namaPasien_1007, String penyakit_1007, int noAntrian_1007) {
        this.namaPasien_1007 = namaPasien_1007;
        this.penyakit_1007 = penyakit_1007;
        this.noAntrian_1007 = noAntrian_1007;
        this.next_1007 = null;
    }

    // Getter 
    public String getNamaPasien_1007() {return namaPasien_1007;}
    public String getPenyakit_1007() {return penyakit_1007;}
    public int getNoAntrian_1007() {return noAntrian_1007;}
    public Pasien_2511531007 getNext_1007() {return next_1007;}

    // Setter
    public void setNamaPasien_1007(String namaPasien_1007) {this.namaPasien_1007 = namaPasien_1007;}
    public void setPenyakit_1007(String penyakit_1007) {this.penyakit_1007 = penyakit_1007;}
    public void setNoAntrian_1007(int noAntrian_1007) {this.noAntrian_1007 = noAntrian_1007;}
    public void setNext_1007(Pasien_2511531007 next_1007) {this.next_1007 = next_1007;}
}