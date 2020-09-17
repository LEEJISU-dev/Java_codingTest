import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int test = 0; // 테스트 케이스 개수
		int max = 0; // 최대값
		int distance = 0; // 거리

		Scanner sc = new Scanner(System.in);
		test = sc.nextInt();
		for (int i = 0; i < test; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			distance = y - x;

			// max의 값은 distance의 루트 값에서 소수점을 보린 정수값과 같다.
			max = (int) Math.sqrt(distance);

			// distance의 제곱근이 정수로 딱 떨어질 경우
			if (max == Math.sqrt(distance)) {
				System.out.println(2 * max - 1);
			// max가 변하는 지점과 다음지점 사이에는 count가 두번씩 변한다
			} else if (distance <= max * max + max) {
				System.out.println(2 * max);
			// max값이 변할때 count값
			} else {
				System.out.println(2 * max + 1);
			}
		}
	}

}
