package Implementation;

import java.util.Scanner;

public class ����N {

	public static void main(String[] args) {
		// �ڿ��� N�� �־����� ��, N���� 1���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for(int i = N; i > 0; i--) {
			System.out.println(i);
		}

	}

}
