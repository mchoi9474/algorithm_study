package Implementation;

import java.util.Scanner;

public class �����5 {

	public static void main(String[] args) {
		// ù° �ٿ��� �� 1��, ��° �ٿ��� �� 3��, ..., N��° �ٿ��� �� 2��N-1���� ��� ����
		//���� ����� �������� ��Ī�̾�� �Ѵ�.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int row = 1; row <= N; row ++) {
			for(int nul = 0; nul <(N- row); nul++) {
				System.out.printf(" ");
			}
		for(int star = 0; star < (row*2-1); star++) {
			System.out.printf("*");
			
			}
		System.out.println(" ");
		}
	}

}
