package Implementation;

import java.util.Scanner;

public class �����4 {

	public static void main(String[] args) {
//		ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ��� ����
//		������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int row = N; row > 0; row --) {
			for(int i = N; i > row; i--) {
				System.out.printf(" ");
			}
			for(int col = row; col > 0; col--) {
				System.out.printf("*");
			}
			System.out.println("");
		}
	}

}
