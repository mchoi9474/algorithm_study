package Mathematics;

import java.math.BigInteger;
import java.util.*;


public class 긴자리계산 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BigInteger a = new BigInteger(sc.nextLine());
		BigInteger b = new BigInteger(sc.nextLine());
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		sc.close();
	}
	

}
