import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int test = 0; // 테스트 개수
		int h = 0; // 호텔의 층수
		int w = 0; // 각 층의 방 개수
		int n = 0; // n번째 손님
		int room = 0; // 방의 호수
		Scanner sc = new Scanner(System.in);
		test = sc.nextInt();

		for (int i = 0; i < test; i++) {
			h = sc.nextInt();
			w = sc.nextInt();
			n = sc.nextInt();

			if (n % h != 0) {
				room = (n % h) * 100 + (n / h) + 1;
			} else {
				room = h * 100 + (n / h);
			}

			System.out.println(room);
		}

	}

}
