package Implementation;

import java.util.Scanner;

public class �����2 {

	public static void main(String[] args) {
		//ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ���� 
		//������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for(int row = 1; row <= N; row++) {
			if(row < N) {
				for(int nul = (N-row); nul > 0; nul--) {
					System.out.printf(" ");
				}
			}
			for(int col = 1;  col <= row; col++) {
				
				System.out.printf("*");
			}
			System.out.println("");
		}
	}

}
