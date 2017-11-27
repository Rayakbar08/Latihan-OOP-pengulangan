import java.util.Scanner;

class Stars {
	public void printStar() {
		
		Scanner scan = new Scanner(System.in);
		int nilai;
		System.out.print("Masukkan nilai: ");
		nilai = scan.nextInt();
		
		for (int i = 0; i < nilai; i++) {
			for( int j=0; j<nilai;j++){
			System.out.print("*");
			}
			System.out.println("");
		
	
			
		}
		}
}
