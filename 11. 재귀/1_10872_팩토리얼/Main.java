import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n = 0; // 입력받은 정수
		int sum = 0; // 결과값
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sum = get_Factorial(n);
		System.out.println(sum);

	}

	// 팩토리얼을 구하는 재귀함수
	public static int get_Factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * get_Factorial(n - 1);
	}

}
