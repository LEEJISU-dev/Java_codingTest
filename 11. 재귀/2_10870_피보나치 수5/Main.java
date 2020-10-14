import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n = 0; // 입력받은 정수

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		System.out.println(fibo_num(n));

	}

	// 피보나치을 구하는 재귀함수
	public static int fibo_num(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibo_num(n - 1) + fibo_num(n - 2);
	}

}
