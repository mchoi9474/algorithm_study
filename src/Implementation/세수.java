package Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// �� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		for(int i = 0; i < 3 ;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		System.out.println(arr[1]);
	}

}
