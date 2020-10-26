import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n = 0; // 입력받은 수
		int cnt = 1; // 영화제목의 숫자
		int num = 666;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (cnt != n) {
			num++;
			// 문자열에 666이 있는지 검사
			if (String.valueOf(num).contains("666")) {
				cnt++;
			}
		}
		System.out.println(num);

	}

}
