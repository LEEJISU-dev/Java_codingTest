import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String str[]; // 입력받은 식
		int result = Integer.MAX_VALUE; // 결과값
		Scanner sc = new Scanner(System.in);

		str = sc.nextLine().split("-"); // -부호를 기준으로 나누기

		for (int i = 0; i < str.length; i++) {
			int tmp = 0;
			// 뺄셈으로 나뉜 숫자를 덧셈으로 분리하여 더한다
			String[] add = str[i].split("\\+");

			// 덧셈으로 나뉜 숫자들을 모두 더한다
			for (int j = 0; j < add.length; j++) {
				tmp += Integer.parseInt(add[j]);
			}

			// 첫번째인 경우 tmp값이 첫 번째 수가 됨
			if (result == Integer.MAX_VALUE) {
				result = tmp;
			} else {
				result -= tmp;
			}
		}

		System.out.println(result);
	}

}
