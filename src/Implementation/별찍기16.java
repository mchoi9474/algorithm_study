package Implementation;

import java.util.Scanner;

public class º°Âï±â16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int row = 0; row < N; row++) {
			for(int nul = 0; nul < (N-1-row); nul++) {
				System.out.printf(" ");
			}
			for(int star = 0; star <= row; star++) {
				System.out.printf("*");
				if(star ==(N-1)) {
					
				}else {
					System.out.printf(" ");
				}
				
			}
			System.out.println("");
		}

	}

}
