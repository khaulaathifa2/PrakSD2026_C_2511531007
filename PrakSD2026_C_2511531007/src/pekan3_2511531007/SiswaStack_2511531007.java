package pekan3_2511531007;

import java.util.ArrayList;

class Siswa_1007 {
	String nama_1007;
	int nim_1007;
	
	public Siswa_1007(String nama_1007, int nim_1007) {
		this.nama_1007 = nama_1007;
		this.nim_1007 = nim_1007;
	}
	@Override
	public String toString() {
		return "Nim: " + nim_1007 + ", Nama: " + nama_1007;
	}
}
public class SiswaStack_2511531007 {
	private ArrayList<Siswa_1007> stack_1007;
	
	public SiswaStack_2511531007() {
		stack_1007 = new ArrayList<>();
	}
	public void push_1007(Siswa_1007 mhs_1007) {
		stack_1007.add(mhs_1007);
	}
	
	public Siswa_1007 pop_1007() {
		if (!isEmpty_1007()) {
			return stack_1007.remove(stack_1007.size() - 1);
		}
		return null;
	}
	
	public Siswa_1007 peek_1007() {
		if (!isEmpty_1007()) {
			return stack_1007.get(stack_1007.size() - 1);
		}
		return null;
	}
	
	public boolean isEmpty_1007() {
		return stack_1007.isEmpty();
	}
	
	public void tampilkanSiswa_1007() {
		for (int i_1007 = stack_1007.size() - 1; i_1007 >= 0; i_1007--) {
			System.out.println(stack_1007.get(i_1007));
		}
	}
	public static void main(String[] args) {
		SiswaStack_2511531007 studentStack_1007 = new SiswaStack_2511531007();
		
		Siswa_1007 mhs1_1007 = new Siswa_1007("Ali", 1);
		Siswa_1007 mhs2_1007 = new Siswa_1007("Boby", 2);
		Siswa_1007 mhs3_1007 = new Siswa_1007("Charles", 3);
		
		studentStack_1007.push_1007(mhs1_1007);
		studentStack_1007.push_1007(mhs2_1007);
		studentStack_1007.push_1007(mhs3_1007);
		
		System.out.println("Siswa di dalam stack: ");
		studentStack_1007.tampilkanSiswa_1007();
		
		System.out.println("Siswa teratas " + studentStack_1007.peek_1007());
		System.out.println("Mengeluarkan siswa teratas dari stack: " + studentStack_1007.pop_1007());
		System.out.println("Daftar siswa setelah di pop : ");
		studentStack_1007.tampilkanSiswa_1007();
	}

}
