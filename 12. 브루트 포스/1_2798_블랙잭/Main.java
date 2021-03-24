import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0; // 입력받은 수 N
		int m = 0; // 입력받은 수 M
		int result = 0; // 결과값

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		int[] num = new int[n]; // n개 입력받은 수
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		result = search(num, n, m);
		System.out.println(result);
	}

	static int search(int[] num, int n, int m) {
		int result = 0;

		// 첫번째 카드 : 세개의 카드를 고르기때문에 n-2까지
		for (int i = 0; i < n - 2; i++) {
			// 두번째 카드 : 첫번째 카드 다음부터 n-1까지
			for (int j = i + 1; j < n - 1; j++) {
				// 세번째 카드 : 두번째 카드 다음부터 n까지
				for (int k = j + 1; k < n; k++) {
					int tmp = num[i] + num[j] + num[k]; // 세개 카드의 합

					if (m == tmp) {
						return tmp;
					}
					// 세 카드의 합이 이전 합보다 크면서 m보다 작을 경우 result
					if (result < tmp && tmp < m) {
						result = tmp;
					}
				}
			}
		}
		return result;
	}
}
