package Implementation;
import java.util.Scanner;

public class �����1 {
	public static void main(String[] args) {
		//ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		sc.close();
		for(int row = 1; row <= A; row++) {
			for(int col = 1; col <= row; col++){
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
