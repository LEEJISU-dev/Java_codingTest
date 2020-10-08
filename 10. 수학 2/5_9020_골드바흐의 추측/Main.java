import java.util.Scanner;

public class Main {
	public static boolean prime[];

	public static void main(String[] args) {
		int test = 0; // 테스트 케이스의 수
		int n = 0; // 입력받은 짝수

		Scanner sc = new Scanner(System.in);
		test = sc.nextInt();

		for (int i = 0; i < test; i++) {
			n = sc.nextInt();
			prime = new boolean[n + 1];
			get_prime();
			int partition1 = n / 2; // 입력받은 소수의 절반
			int partition2 = n / 2; // 입력받은 소수의 절반
			// 두 소수의 차가 작은 것을 출력하기 위해 짝수 n을 절반을 나누어서 검사
			while (true) {
				if (!prime[partition1] && !prime[partition2]) {
					System.out.println(partition1 + " " + partition2);
					break;
				}
				partition1--;
				partition2++;
			}
		}
	}

	/* 에라토스테네스의 체 */
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
}
