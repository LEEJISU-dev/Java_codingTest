import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		int sum = 0;	// 총합계
		int avg = 0;	// 평균
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			n = sc.nextInt();
			// 40점 미만일 경우 40점
			if (n < 40) {
				n = 40;
			}
			sum += n;
		}
		avg = sum / 5;
		System.out.println(avg);

	}

}