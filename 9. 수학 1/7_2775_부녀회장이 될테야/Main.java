import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int test = 0; // 테스트 개수
		int k = 0; // 아파트의 층수
		int n = 0; // 아파트의 호수
		Scanner sc = new Scanner(System.in);
		test = sc.nextInt();

		for (int i = 0; i < test; i++) {
			k = sc.nextInt();
			n = sc.nextInt();

			System.out.println(el(k, n));
		}
		sc.close();

	}

	// 재귀함수(피보나치수열과 유사한 패턴)
	private static int el(int k, int n) {
		if (n == 0) {
			return 0;
		} else if (k == 0) {
			return n;
		} else {
			return el(k, n - 1) + el(k - 1, n);
		}
	}

}
