import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x = 0; // x의 좌표
		int y = 0; // y의 좌표

		Scanner sc = new Scanner(System.in);
		int[] cord1 = { sc.nextInt(), sc.nextInt() }; // 첫 번째 점
		int[] cord2 = { sc.nextInt(), sc.nextInt() }; // 두 번째 점
		int[] cord3 = { sc.nextInt(), sc.nextInt() }; // 세 번째 점
		
		// x좌표 구하기
		if (cord1[0] == cord2[0]) {
			x = cord3[0];
		} else if (cord1[0] == cord3[0]) {
			x = cord2[0];
		} else {
			x = cord1[0];
		}
		
		// y좌표 구하기
		if (cord1[1] == cord2[1]) {
			y = cord3[1];
		} else if (cord1[1] == cord3[1]) {
			y = cord2[1];
		} else {
			y = cord1[1];
		}

		System.out.println(x + " " + y);

	}

}
