import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n = 0; // 입력받은 자연수
		int m = 0; // 생성자
		int num = 0; // 생성자 변수
		int sum = 0; // 각 자리수 합 변수
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			num = i;
			sum = 0;

			while (num != 0) {
				sum += num % 10; // 각 자리수 더하기
				num /= 10;
			}
			
			// 생성자를 찾았을 경우
			if (sum + i == n) {
				m = i;
				break;
			}
		}
		System.out.println(m);

	}

}
