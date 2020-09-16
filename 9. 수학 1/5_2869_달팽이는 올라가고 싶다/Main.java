import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int v = 0; // 높이
		int a = 0; // 낮에 올라가는 길이
		int b = 0; // 밤에 내려가는 길이
		int day = 0; // 결과값(며칠 걸리는지 )
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		v = sc.nextInt();
		
		// 마지막으로 도달할때 내려가는 길이를 빼준다
		day = (v - b) / (a - b);

		// 나머지가 있을경우
		if ((v - b) % (a - b) != 0) {
			day++;
		}

		System.out.println(day);

	}

}
