package pekan5;

public class Tugas2pekan5 {
	public static void main(String[] args) {
		int dot = 4;
		int n = 4;
		
		//baris atas
		System.out.print("#");
		for(int i = 0; i < (dot*n); i++ ) {
			System.out.print("=");
		}
		System.out.println("#");
		
		//bagian tengah pertama
		for(int j = 0; j < n; j++) {
			System.out.print("|");
			for(int space = 0; space < (-2*j+6); space++) {
				System.out.print(" ");
			}
			System.out.print("<>");
			for(int d = 0; d < (dot*j); d++) {
				System.out.print(".");
			}
			System.out.print("<>");
			
			for(int space = 0; space < (-2*j+6); space++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
		//bagian tengah kedua
        for(int j = 0; j < n; j++) {
            System.out.print("|");
            for(int space = 0; space < (2*j); space++) {
                System.out.print(" ");
            }
            System.out.print("<>");
			for(int d = 0; d < (-4*j+12); d++) {
				System.out.print(".");
			}
			System.out.print("<>");

            for(int space = 0; space < (2*j); space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        //baris bawah
        System.out.print("#");
		for(int i = 0; i < (dot*n); i++ ) {
			System.out.print("=");
		}
		System.out.println("#");
	}
}
