import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int count = 1;
		int h, o, a, tmp;
		int sum = 0;
		tmp = n;
		while (true) {
			h = tmp / 10; // 십의 자리
			o = (tmp % 10);	// 일의 자리
			sum = o + h;	// 합
			if (sum > 9) {
				sum = sum % 10;
			}
			a = o * 10 + sum;	// 새로운 수
			if (n == a) {	// 새로운 수와 입력받은 수가 같으면 종료
				System.out.println(count);
				break;
			}

			count++;	// 반복 수
			tmp = a;

		}

	}

}