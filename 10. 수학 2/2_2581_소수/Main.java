import java.util.Scanner;

public class Main {

	public static boolean prime[];

	public static void main(String[] args) {
		int m = 0; // 자연수 m
		int n = 0; // 자연수 n
		int sum = 0; // 소수의 합
		int min = Integer.MAX_VALUE; // 소수의 최솟값
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();

		prime = new boolean[n + 1]; // 배열 생성
		get_prime();

		for (int i = m; i <= n; i++) {
			if (prime[i] == false) { // 소수이면
				sum += i;
				if (min == Integer.MAX_VALUE) {
					min = i;
				}
			}
		}
		// 소수가 없을 경우
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}

	}

	/*
	 * 에라토스테네스의 체 
		" k=2 부터 √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다"
	 */
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			for (int j = i * i; j < prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}

}
