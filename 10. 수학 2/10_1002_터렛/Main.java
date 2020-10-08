import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int test = 0; // 입력받은 테스트 갯수

		Scanner sc = new Scanner(System.in);
		test = sc.nextInt();

		for (int i = 0; i < test; i++) {
			int x1 = sc.nextInt(); // A의 x축 좌표
			int y1 = sc.nextInt(); // A의 y축 좌표
			int r1 = sc.nextInt(); // A의 반지름
			int x2 = sc.nextInt(); // B의 x축 좌표
			int y2 = sc.nextInt(); // B의 y축 좌표
			int r2 = sc.nextInt(); // B의 반지름

			// 반지름이 r1인 A와 반지름이 r2인 B의 접점의 개수 구하기
			System.out.println(get_point(x1, y1, r1, x2, y2, r2));
		}

	}

	/* 반지름이 r1인 A와 반지름이 r2인 B의 접점의 개수 구하기 */
	public static int get_point(int x1, int y1, int r1, int x2, int y2, int r2) {
		int distance = (int) ((int) Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); // 중점간 거리의 제곱
		// (접첨의 개수 무한)두 원의 중심이 같고, 반지름도 같을 때
		if (x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
			// (접점 X) 두 점 사이의 거리가 각 원의 반지름의 합보다 클 때
		} else if (distance > (int) Math.pow(r1 + r2, 2)) {
			return 0;
			// (접점 X) 한 원안에 다른 원이 있을 때
		} else if (distance < (int) Math.pow(r2 - r1, 2)) {
			return 0;
			// (접점 한 개) 내접할 때
		} else if (distance == (int) Math.pow(r2 - r1, 2)) {
			return 1;
			// (접점 한 개) 외접할 때
		} else if (distance == (int) Math.pow(r2 + r1, 2)) {
			return 1;
		} else {
			return 2;
		}

	}

}
