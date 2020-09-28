import java.util.Scanner;

public class Main {

	public static boolean prime[];

	public static void main(String[] args) {
		int n = 0; 		// 자연수 n
		int count = 0; // 소수 카운트
		Scanner sc = new Scanner(System.in);
		

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			prime = new boolean[2 * n +1]; // 배열 생성
			get_prime();

			for (int i = n+1; i <= 2 * n; i++) {
				if (prime[i] == false) { // 소수이면 카운트
					count++;
				}
			}
			System.out.println(count);
			count = 0;
		}
	}

	/*
	 * 에라토스테네스의 체 
	 * " k=2 부터 √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다"
	 */
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;

		// i=2부터 √N 이하까지 반복
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			// i의 배수들을 모두 제외
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}
