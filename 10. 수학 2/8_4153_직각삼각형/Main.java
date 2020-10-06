import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int max = 0; // 입력받은 세 수 중 최댓값
		Scanner sc = new Scanner(System.in);
		while (true) {
			int[] tria = { sc.nextInt(), sc.nextInt(), sc.nextInt() };
			// 입력받은 세수가 모두 0이면 종료
			if (tria[0] == 0 && tria[1] == 0 && tria[2] == 0) {
				break;
			}
			if(Math.pow(tria[0], 2)==(Math.pow(tria[1], 2)+Math.pow(tria[2], 2))) {
				System.out.println("right");
			}else if(Math.pow(tria[1], 2)==(Math.pow(tria[0], 2)+Math.pow(tria[2], 2))) {
				System.out.println("right");
			}else if(Math.pow(tria[2], 2)==(Math.pow(tria[0], 2)+Math.pow(tria[1], 2))) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}

		}
	}

}
